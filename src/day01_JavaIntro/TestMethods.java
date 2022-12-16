package day01_JavaIntro;

import day24_CustomMethod_Return.ReturnMethodIntro;
import day24_CustomMethod_Return.ReturnMethodPractice4;
import utilities.StringUtility;

public class TestMethods {
    public static void main(String[] args) {

        String str = "aaaaaaabbbbbbbcccccccdddddddd";

        str = ReturnMethodPractice4.removeDuplicates(str);

        System.out.println(str);



        String name = "Java Programming";

        String reversedName = ReturnMethodIntro.reverse(name);

        System.out.println(reversedName);


        String str1= "Wooden Spoon";
        StringUtility.printEachChar(str1);

    }
}
