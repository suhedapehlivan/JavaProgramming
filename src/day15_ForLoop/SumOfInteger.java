package day15_ForLoop;

import java.util.Scanner;

public class SumOfInteger {

    public static void main(String[] args) {

        int sum =0;

        for (int i = 1; i < 101; i++) {
            sum += i;
        }

        System.out.println(sum);


    }


}
/*
 3. Write a program that can calculate the sum of all integers between 1 to 100
 */