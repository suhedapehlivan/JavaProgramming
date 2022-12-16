package day13_StringClass;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";
         //            01234    range 0-4

        char thirdChar = word.charAt(2);   //3. karakter için 2 yazmalısın cunku 0 dan baslar

        System.out.println("thirdChar = " + thirdChar);

        /*
        char tenthChar = word.charAt(9);

        System.out.println("tenthChar = " + tenthChar);
*/

        System.out.println("--------------");

        String s1 = "Batch 10 is the best batch";

        int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);


        char lastChar = s1.charAt( s1.length()-1);
        // OR   char lastChar = s1.charAt( totalChars -1 );
        System.out.println("lastChar = " + lastChar);


        System.out.println("-----------");

        String str = "wooden spoon";
        str.toUpperCase();  //"WOODEN SPOON"   //String can not modified, so it creates new string

        System.out.println(str);


        //Today is a great day to learn java programming language.
        String sentence = "Today is a great day to learn java programming language.";

        sentence = sentence.toUpperCase();
        System.out.println(sentence);

    }
}
