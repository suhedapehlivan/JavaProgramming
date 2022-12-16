package day21_ArrayUtility_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Java";

        for (char each :str.toCharArray() ){
            System.out.println(each);
        }

        //or
        System.out.println("-------");

        char[] chars = str.toCharArray();
        for ( char each : chars ){
            System.out.println(each);
        }


        System.out.println("-----------split");

        String sentence = "Wooden Spoon";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("-----------");

        String email = "WoodenSpoon@cydeo.com";
        String[] arr = email.split("@");
        System.out.println(Arrays.toString(arr));


        System.out.println("-------");
        String s = "Today is nice. Today is monday. Today we learn java.";
        String[] sentences = s.split("\\. ");   // to split with . use \\.
        System.out.println(Arrays.toString(sentences));



    }
}
