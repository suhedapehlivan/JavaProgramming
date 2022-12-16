package day21_ArrayUtility_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David","James","Aaron","Daniel"};
//copy first 3 names, and put another array
        String[] earlyBirds = Arrays.copyOf(students, 3);
        System.out.println(Arrays.toString(earlyBirds));


        System.out.println("-------------");
        int[] numbers ={1,2,3,4,5,6,7,8,9,10};
        numbers = Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------");

        char[] ch1 = {'A','B','C','D','E','F','G','H','I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2,6);  // C, D, E, F  ending index doesnt included. bitişin de dahil olmasını istiyorsan 6+1 yap
        System.out.println(Arrays.toString(ch2));


        System.out.println("-----------");

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
         //index         0  1   2   3   4   5   6   7   8   9
                //4.-8. copy

        int[] result = Arrays.copyOfRange(scores, 3,7+1);
        System.out.println(Arrays.toString(result));


        int[] result2 = Arrays.copyOfRange(scores, 5,scores.length); //5 ten sona
        System.out.println(Arrays.toString(result2));
    }

}
