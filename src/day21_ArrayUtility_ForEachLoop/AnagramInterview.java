package day21_ArrayUtility_ForEachLoop;

import java.util.Arrays;

public class AnagramInterview {
    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";

        //write a program that can check if str1 and str2 are build out same characters (is it anagram?)

        char[] ch1 = str1.toCharArray(); //['a','c'...]
        char[] ch2 = str2.toCharArray();

     /*   System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
*/
        Arrays.sort(ch1);
        Arrays.sort(ch2);
      /*  System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
*/

        boolean anagram = Arrays.equals(ch1, ch2);
        System.out.println("anagram = " + anagram);  //true
    }
}
