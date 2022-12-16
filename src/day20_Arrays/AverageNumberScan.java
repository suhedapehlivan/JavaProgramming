package day20_Arrays;

import java.util.Scanner;

public class AverageNumberScan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("how many numbers would you like to enter?");
        int numbers= scan.nextInt();
        double sum =0;
        double average=0;


        int[] num = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            System.out.println("Please enter a number");
            num[i]= scan.nextInt();
            sum += num[i];
        }

        average = sum/ num.length;
        System.out.println("average = " + average);

        scan.close();
    }
}