package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        //ımplicit casting

        byte a = 100;
        short b = a;

        //short b = (short)a;
        //        (short)a

        int c = b;   //implicit casting
        // int c = (int)b

        long d = c;
        //        (long)c

        float e = d;

        double f = e;

        //explicit casting
        //manuel olarak eklemelisin, büyükten küçüğe olduğu için

        int x = 55;
        short y = (short) x;
        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short) j;
        System.out.println(j + " : " + k);
        //shortun rangeinde olmadıgı için en büyük hali sonuc cıkar bir milyon cıkmaz.
        //1000000:16960

        double l = 2.5;
        float m = (float) l;
        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int) n;
        System.out.println(n + " : " + s);
        //noktalı sayı oldugu için int de sayı oldugu için 10 sonucu cıkar

        double d1 = 20.5;
        short s1 = (short) d1;
        // shortcut ; bitişine tıkla sonra option +enter - click cast to short
        System.out.println(d1 + " : " + s1);


        float f1 = 30.5F;
        long l1 = (long) f1;
        System.out.println(f1 + " : " + l1);







    }

}


//range aralığına göre küçükten büyüğe yapılır
/*
double > float > long > int > short > byte

smaller primitive can be directly assigned to larger primitive type
 */