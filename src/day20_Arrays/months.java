package day20_Arrays;

import java.util.Arrays;

public class months {
    public static void main(String[] args) {


        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep","Oct", "Nov", "Dec"};  //index 0~11  -> length-1
        System.out.println(Arrays.toString(months));

        int num = 4;
        if (num<1 || num>12){
            System.out.println("Invalid");
            System.exit(0);
        }
        System.out.println(months[num-1]);

        System.out.println("---------------");
        System.out.println(months[0]);   //jan
        System.out.println(months[1]);
        System.out.println(months[2]);
        System.out.println(months[3]);
        System.out.println(months[4]);
        System.out.println(months[5]);
        System.out.println(months[6]);
        System.out.println(months[7]);
        System.out.println(months[8]);
        System.out.println(months[9]);
        System.out.println(months[10]);
        System.out.println(months[11]);

        System.out.println("----------------------");

        for (int i = 0; i < months.length; i++) {  //i:represents the index numbers of array starting from zero
            System.out.println(months[i]);
        }

        System.out.println("----------------------");

        for (int i = months.length-1; i >= 0; i--) { //i:represents the index numbers of array starting from last index
            System.out.println(months[i]);
        }



    }
}
