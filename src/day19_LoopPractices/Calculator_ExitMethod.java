package day19_LoopPractices;

import java.util.Scanner;

public class Calculator_ExitMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = scan.nextInt();

        System.out.println("Enter a math operator:");
        char operator = scan.next().charAt(0);  // add charAt to string return char

        if (!(operator == '+' || operator == '-')){  // if the operator is not valid
            System.err.println("Invalid Math Operator: "+ operator);
            System.exit(0);
        }

        System.out.println("Enter a number:");
        int num2 = scan.nextInt();

        if (operator== '-'){
            System.out.println(num1-num2);
        }else {
            System.out.println(num1 + num2);
        }
// eğer operatoru yanlıs girerse buralara gelmeyecek exit olacak

scan.close();
    }
}
