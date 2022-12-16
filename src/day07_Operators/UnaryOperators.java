package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = 25; //pozitif number + koymaya gerek bile yok
        int num2 = -25; //negatif number - koymak zorunlu yoksa negatif olduğunu anlayamayız

        System.out.println(num1 < 0); //false
        System.out.println(num2 < 0); //true


        System.out.println("--------------------------");

        int a =5;
        ++a; //pre increment: increases the value by 1 right away, immidiatelly

        System.out.println(a); //6

        --a;// pre increment: decreases the value by 1 right away, immidiatelly

        System.out.println(a); //5 (cunku 6 olmuştu geri 5 e düştü


        System.out.println("----------------------");
        int b = 100;
        System.out.println(++b); //pre increment hemen ekler eksiltir

        int c= 100;
        System.out.println(c++); //post increment. hemen değil sonradan ekler eksiltir //100 (it does next step)
                               //first passes the current value, then increases the value by1 (at the next step)
        System.out.println(c); //101 sonra oldugu için artmıs olacak



        int x =200;
        System.out.println(--x ); // 199 pre decrement: decreases the value by 1 right away
        System.out.println(++x); //200

        int y =200;
        System.out.println(y--); //200 post decrement: first passes the current value, then decreases the value by 1
        System.out.println(y); //199 (post decrement second stepte değişir)

        System.out.println("----------------");

        int z = 45;
        System.out.println(++z); //46 z=46
        System.out.println(z++); //46 z=47
        System.out.println(z); //47

        int q = 30;
        System.out.println(--q); //29 q=29
        System.out.println(q--); //29 q=28
        System.out.println(q); //28




    }
}
