package day10_NestedIfAndTernaries;

public class GradeReport2Ternaries {
    public static void main(String[] args) {

        int s = 78;

        String grade = (s>=0 && s<=100)? (s>=90)? "Excellent" :(s>=80)? "Great"
                :(s>=70)? "Good" :(s>=60)? "Passed" : "Failed" : "Invalid Score";
        System.out.println(grade);


        System.out.println("---------------");

   /* int score =95;
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

    */

        //mix is the best way; to readable code


        int score =95;
        String result2 = "";

        if (score>=0 && score<=100){
            result2 = (s>=0 && s<=100)? (s>=90)? "Excellent" :(s>=80)? "Great"
                    :(s>=70)? "Good" :(s>=60)? "Passed" : "Failed" : "Invalid Score";

        }else {
            result2 = "Invalid Score";
        }
        System.out.println(result2);

}
}