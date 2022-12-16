package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {


        char[] alphabets = new char[26]; //Z-A
/*                i    ch
        alphabets[0]='Z';  //90 ascii table value
        alphabets[1]='Y';  //89 ascii table value
        alphabets[2]='X';  //88 ascii table value
//index no artarken char no azalıyor   */

        char ch = 'Z';
        for (int i = 0; i < alphabets.length ; i++, ch--) {
            alphabets[i]=ch;
        }

        System.out.println(Arrays.toString(alphabets));   //print the whole array
      //  System.out.println(alphabets[0]); // printing the element of array


        System.out.println("---------------------second way");
        for (char i = 0, j='Z'; i < alphabets.length; i++, j--) {  //i index artar, j char azalır
            alphabets[i]=j;
        }
        System.out.println(Arrays.toString(alphabets));
    }
}