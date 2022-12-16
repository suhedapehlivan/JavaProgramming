package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("Enter your age:");
            int age = scan.nextInt();

            while (!(age>=1 && age<=120)){  //while the age is invalid  (age valid ise bu loop executed
                System.out.println("Invalid Entry, Please re-enter your age");
                age = scan.nextInt();
            }
            System.out.println("Would you like to continue?");
            String a =scan.next().toLowerCase();

            while (!(a.equals("yes")|| a.equals("no"))){  //while the answer is invalid. it gets executed. (if the user info from scanner is valid yes or no
                System.err.println("Invalid Entry, Please re-enter. Would you like to continue?");
                a = scan.next().toLowerCase();
            }

            if (a.equals("no")){  //inner loop dışında outer loop içinde ne zaman biteceği çıkış olacağı verilir
                break;
            }
        }
scan.close();
    }
}
