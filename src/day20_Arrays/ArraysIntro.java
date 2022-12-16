package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {


        //create a variable that's capable enough to contain 5 names

        String[] myGroup = new String[5];   // it should be matched string string iki taraf da.
//0~4
        myGroup[0] = "Ali";
        myGroup[1] = "Ahmet";
        myGroup[2] = "Ayse";
        myGroup[3] = "Arya";
        myGroup[4] = "Alin";

      //  System.out.println(myGroup);  //hashcode  WRONG Printing Array

        //printing array;

        System.out.println(Arrays.toString(myGroup));   //write ARRay and click java.util  to import


        System.out.println("----------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
       //index              0       1            2          3            4          5          6
        System.out.println(Arrays.toString(days));

        int number =5;

        if (number<1 || number>7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number-1]);   //num-1 yapılır cünkü index 1 küçük num dan. cunku index 0 dan başlar

    }
}
