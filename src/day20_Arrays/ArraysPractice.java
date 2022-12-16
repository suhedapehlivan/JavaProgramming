package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        //store teh elements: 10, 20, 50, 70
        int[] numbers = {10, 20, 50, 70}; //size:4
        System.out.println(Arrays.toString(numbers));

        System.out.println("--------");
        //create a variable that can contain 5 scores(we dont know what are they, just know size
        int[] scores= new int[5];    // 0 0 0 0 0 default value

        scores[1]= 85;  //2. element
        scores[scores.length -1]= 95;  //last element. index=len-1
        scores[3] =75;
        scores[0] =65;
        scores[2] =55;
        System.out.println(Arrays.toString(scores));
    }
}
