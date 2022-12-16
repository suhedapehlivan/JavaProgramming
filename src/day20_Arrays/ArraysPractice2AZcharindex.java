package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2AZcharindex {
    public static void main(String[] args) {

        //There are different ways of print A-Z

        char[] letters = new  char[26];

        /*
        letters[0]= 'A';
        letters[1]= 'B';
        letters[2]= 'C';      index no ve char karakteri değişiyor
         */
        for (char i = 'A', j=0; i <= 'Z' && j<letters.length; i++, j++) {    //i char // j index represent
            letters[j]=i;
        }


        System.out.println(Arrays.toString(letters));  //A~Z


        System.out.println("------------------");

        for (int i = 0, j='A'; i < letters.length ; i++, j++) {  //i:represent index numbers 0~last index  //j:represent charachters A~Z
            letters[i]=(char)j;
        }


        System.out.println(Arrays.toString(letters));


        System.out.println("----------------");
        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch++;
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("----------------");
        char ch1 = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch1;
            ch1++;
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("----------------");
        char ch2 = 'A';
        for (int i = 0; i < letters.length; i++, ch2++) {
            letters[i] = ch2;
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("----------");
        char[] letters2 = new  char[26];

        char ch3 = 'Z';
        for (int i = 0; i < letters.length; i++) {
            letters2[i] = ch3--;
    }
        System.out.println(Arrays.toString(letters2));

    }
}

