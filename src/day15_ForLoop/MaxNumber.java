package day15_ForLoop;

import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2147483648;  //min int değeri, temporary (any user entered number will be greater than this number

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter a number:");
            int num = scan.nextInt(); //1 2 3 4 1 5

            if (num > max){   //if the user entered number is greater than current max number
                max = num;

            }
        }

        System.out.println("max = " + max);

        scan.close();

    }
}
/*
write a program that ask the user to enter a number for 5 times,
return the maximum number

 */