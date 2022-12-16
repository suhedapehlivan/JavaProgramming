package day29_ArrayList2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class tekrar {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(list);
        int max= list.get(0);
        int min= list.get(0);
        int sum= 0;

        for (Integer each:list) {
            if (each>max){
                max =each;
            }
            if (each<min){
                min=each;
            }
            sum+=each;



        }
        double average = (double) sum / list.size();
        System.out.println("average = " + average);
        System.out.println("min = " + min);
        System.out.println("max = " + max);


        System.out.println("--------");

        String str= "hhhssdddkkklllfffnnno";
       String[] arr = str.split("");
       ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);
        String unique = "";
        for (String eachh:list2) {
            int frequency= Collections.frequency(list2,eachh);
            if (frequency==1){
                unique +=eachh;

            }
        }
        System.out.println("unique = " + unique);

        System.out.println(" --------------");

        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        System.out.println("Here is the monthly payment schedule:");

        for (int i = 0; i < 3; i++) {
            int monthAmount= amount/10;
            int remainingAmount = amount- monthAmount;
            amount=remainingAmount;
            System.out.println(amount);

        }





    }
}
