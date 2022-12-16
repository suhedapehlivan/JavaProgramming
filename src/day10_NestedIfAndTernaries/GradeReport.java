package day10_NestedIfAndTernaries;

public class GradeReport {

    public static void main(String[] args) {

/*
90~100: Excellent
80~89 : Great
70~79 :Good
60~69 : Passed
0~59 :Failed
 */

        int score =95;
        String result = "";  //temporary

        if (score>=0 && score<=100){ //if the score is valid
            //5 possibilities A B C D F
            if (score >=90){  //false if score<90
                result = "Excellent";
            } else if (score >= 80) { //false if score<80
                result = "Great";
            }else if (score >= 70) { //false if score<70
                result = "Good";
            }else if (score >= 60) { //false if score<60
                result = "Passed";
            }else {
                result = "Failed";
            }


        }else { //if the score is not valid
            result = "Invalid Score";
        }

        System.out.println(result);

    }
}
