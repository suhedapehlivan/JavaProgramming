package day28_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        int max=Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for (Integer each: list) {
            if (each>max){
                max=each;

            }
            if (each<min){
                min=each;
            }
        }
        System.out.println(max);
        System.out.println(min);

    }

}
/*
5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5
 */
