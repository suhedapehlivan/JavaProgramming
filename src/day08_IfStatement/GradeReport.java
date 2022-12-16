package day08_IfStatement;

public class GradeReport {

    public static void main(String[] args) {

        int score = 99;   //0~100
        boolean a = score >=90 && score <= 100;
        boolean b = score >=80 && score <= 89;
        //boolean b = score >=80 && !a;   (if score is A, but score is greater than 80)
        boolean c = score >= 70 && score <=79;
        //boolean c = score >= 70 && !a && !b;
        boolean d = score >= 60 && score <= 69;
        boolean f = score >=0 && score <= 59;
        // boolean f = !a && !b && !c && !d;

        if(a) {               //if the student made an A
            System.out.println("Excellent");
        }

        if(b) {               //if the student made a B
            System.out.println("Great");
        }

        if(c) {              //if the student made a C
            System.out.println("Good");
        }

        if (d){              //if the student made a D

            System.out.println("Passed");
        }

        if (f){              //if the student made a F
            System.out.println("Failed");
        }





    }
}

/*
90~100 -> excellent
80~89 -> great
70~79 -> good
60~69 -> passed
0~59 -> failed
 */