package day21_ArrayUtility_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        String[] group1 = {"Ali", "Layan", "Aysenur" }; // 3
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"}; //5

        String[] students = new String[group1.length + group2.length];  // 8
//first determine the capacity of new array , then get each elements in loop with both group


        int i = 0;
        for (String each : group1) { // Ali, Layan, Aysenur
            students[i++] = each;
        }


        for (String each : group2) {
            students[i++] = each;
        }
// kaç array birleştireceksem o kadar for each loop yap


        System.out.println(Arrays.toString(students));


        System.out.println("-----------------------------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int j = 0;

        for (char ch : ch1) {
            chars[j]= ch;
            j++;
        }

        for (char ch : ch2) {
            chars[j]= ch;
            j++;
        }

        System.out.println(Arrays.toString(chars));

        System.out.println("-------------");

       int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6};

        int[] ints = new int[arr1.length + arr2.length];

        int k = 0;

        for( int each : arr1 ){
            ints[k]=each;
            k++;
        }
        for( int each : arr2 ){
            ints[k]=each;
            k++;
        }
        System.out.println(Arrays.toString(ints));


    }
}

/*
 1. write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}
 */