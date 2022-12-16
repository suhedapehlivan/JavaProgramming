package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 38 years old

        byte age = 38;

        // weight: 160 pounds. we use short because 160 is out of byte's range

        short wight = 160;
        short num = 129;

        // salary: 100000 $
        // 100000 is within the range of int

        int salary = 100000;

        // int is the preferred data type for integer numbers.

        long asset = 3_333_333_333_333L;

        // long olduğunu tanımlamak için sayının sonuna L ya da l koy.
        // javada basamak ayıran virgül yerine _ kullan.
        // tüm sayılar için genellikle int kullanılır.

        // tax: 0.26

        float tax = 0.26F;
        double PI = 3.14;    //more preferred type noktalı sayılarda

        char ch1 = '#';    //# tek bir karakter variable olacaksa char kullan
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;      //ascii tabledan karakterlere ve onların numaralarına bakabilirsin
        System.out.println("ch2 = " + ch2);
         // ascii table da # ve 35 aynı. ascii table from google

        char ch3 = 45000;
        System.out.println("ch3 = " + ch3);
        
        char gender = 'F';
        char grade = 'F';
        char yesNo = 'Y';
        
        char ch4 = 65535;
        System.out.println("ch4 = " + ch4);

        boolean isEmployeed = true;
        boolean isMarried = false;
        boolean result = 100 > 300;
        System.out.println("result = " + result);

        String name = "Wooden Spoon"; //more than one character. String of text. sequence of character
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";
        String phoneNumber = "(123)-78-876";

        /*
        primitives:
        int: for integers
        double: for decimals
        char: for single characters
        boolean: true/false
        non primitive: string birden fazla karakter ya da text

        variable name rules:
        1. must be unique
        2. camelCase ilk kucuk harf ikinci buyuk harf
        3. cannot start with digits
        4. start with lower case letters
        5. cannot be java reserved words
        6. cannot have special characters other than _ and $
        7. readable, understandable


         */




    }


}
