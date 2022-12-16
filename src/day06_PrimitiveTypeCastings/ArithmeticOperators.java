package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(10 + 20); //30
        System.out.println(100 - 50); //50
        System.out.println("12 + 1"); // 121, concatenation
        System.out.println(10 * 6); //60

        System.out.println(100 / 3); //33
        System.out.println((double) 100 / 3); //33.333
        System.out.println(10.0 / 4); //2.5
        System.out.println(10 / 4.0); //2.5 en az biri noktalı olmalı double
        System.out.println(10d / 4); //2.5


        int a = 100;
        double b = a / 6; //16.0 ,int number
        System.out.println(b);

        double c = a / 6.0; //16.6666 decimal number
        double f = a / 6d;  // 16.666
        double g = (double) a /6; //16.666

        System.out.println(c);
        System.out.println(f);
        System.out.println(g);


        System.out.println(100D);


        System.out.println(20 % 5);
        System.out.println(20 % 6); //3.3333 in math - remainder: 20 - (6* 3)








    }

}

/*
+: addition
-: subtract
*: multiplication
/: division
in math 10/4=2.5
in java 10/4= 2 (int numberların sonucu int olur
        10.0/4 =2 (doğru sonuc için birini noktalı sayı yapmalısın.
%: remainder (geri kalan kısmı) int number

in math 10 / 4=2.5
remainder : numerator - (denominator * integer result)
             10 - (4 *2 )
             10- 8
             2
 */