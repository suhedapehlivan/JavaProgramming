package day10_NestedIfAndTernaries;

public class TernariesWithNestedIf {

    public static void main(String[] args) {


        int score = 95;
        if (score >= 0 && score <= 100) {    //if the score is valid. diğer condition buna bağlı. bu doğru değilse diğer if kontrol edilmez

            if (score >= 68) {   // if student passed the exam
                System.out.println("Passed");
            } else {    //if the student failed exam
                System.out.println("Failed");
            }
        } else {   //if the score is not valid  ilk if te verilen sayı aralığında değilse invalid
            System.out.println("Invalid score");
        }

        System.out.println("--------------");

        int s = 85;
       String result1 = (s>= 0 && s<=100)? (s>=60)? "Passed" : "Failed" : "Invalid Score";
        System.out.println(result1);




    }
}
