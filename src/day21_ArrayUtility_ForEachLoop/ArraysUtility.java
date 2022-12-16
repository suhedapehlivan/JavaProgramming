package day21_ArrayUtility_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

        System.out.println(nums);  //hashcode -hata  [I@1cd072a9
        System.out.println(Arrays.toString(nums));  // single dimensional array printing

        System.out.println(nums[0]);  //print just one element


        System.out.println("-----------");

        int[] scores = {95, 100, 55, 65, 85, 78};
        Arrays.sort(scores);  // order from smallest to largest number
        System.out.println(Arrays.toString(scores));

        System.out.println("Min score = " + scores[0]);
        System.out.println("Max score = " + scores[scores.length-1]);


        System.out.println("--------");

        String[] names = {"Gunay", "Anna","Ahmet", "Zuhal", "Maria", "Sinem"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


        System.out.println("------");
        String[] words = {"Anna", "ANNA"};   //check ascii table numbers and order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));


        System.out.println("-------------");

        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1,arr2);  //checks index by index
        System.out.println(r1);   //false

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println(r2);  //true

        System.out.println("-----------");
        // acb  & bac checks if it is anagram(if they have same charachter such as;
        // listen& silent    or    heart & earth
        char[] ch1 = {'a','c','b'};
        char[] ch2 = {'b','a','c'};

        Arrays.sort(ch1);  // abc
        Arrays.sort(ch2);  // abc
        //if they are equal then they are anagram
        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println("anagram = " + anagram);

    }
}
