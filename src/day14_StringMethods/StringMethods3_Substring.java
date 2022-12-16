package day14_StringMethods;

public class StringMethods3_Substring {

    public static void main(String[] args) {
        //substring(beginning index, ending index )

        String word = "Cydeo School";
        //             012345...

        String brand = word.substring(0, 4+1);

        System.out.println(brand);

        String str1 = word.substring(6);  //son kelime ise ilk index number yazman yeterli

        System.out.println(str1);


        System.out.println("-----------");


        String word3 = "Java Programming Language";



        String ss1 = word3.substring(0, word3.indexOf(" "));  //Java
        String ss2 = word3.substring(word3.indexOf(" ")+1, word3.lastIndexOf(" ")  ); //Programming
        String ss3 = word3.substring(word3.lastIndexOf(" ")+1);  //Language

        System.out.println(ss1);
        System.out.println(ss2);
        System.out.println(ss3);

        System.out.println("-----------------------------------");
        String word2 = "Python C# Ruby";

        String s1 = word2.substring(0,  word2.indexOf(" ") ); //"Python"

        String s2 = word2.substring( word2.indexOf(" ")+1 ,   word2.lastIndexOf(" ") ); //"C#"

        String s3 = word2.substring( word2.lastIndexOf(" ")+1  ); //"Language"

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}

