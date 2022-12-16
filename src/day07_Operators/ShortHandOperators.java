package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        //assignment: =
        int number = 100;

        System.out.println("number = " + number); //100

        number = 200;
        System.out.println("number = " + number); //200


        String word = "Java Programming";
        System.out.println("word = " + word); //Java Programming

        word = "Wooden Spoon";
        System.out.println("word = " + word); //Wooden Spoon

        word = "Cydeo";
        System.out.println("word = " + word); //Cydeo


        System.out.println("---------------");

        // addition assignment bir variable nın değerini arttırmak için 
        int x = 100;
        System.out.println("x = " + x);
        System.out.println(x+200); //300

        x=x+200;
        System.out.println("x = " + x);



        String str = "Wooden";
        str += " Spoon";
        System.out.println("str = " + str);


        double num1 =2.5;
        System.out.println("num1 = " + num1); //2.5

        num1 += 5.5;    //ekleme
        System.out.println("num1 = " + num1); //8.0




        double availableBalance = 1000.50;
        //deposit 300$
        availableBalance += 300; //availablebalance = 1000.50 +300
        System.out.println("availableBalance = " + availableBalance);


        System.out.println("------------------");

        //withdrawing 500$

        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance); //1300.5-500=800.5

        //withdrawing 200$, then depositin 400$

        availableBalance -= 200; // available balance= 600.5
        availableBalance += 400; // 1000.5

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("---------------");

        double salary = 50000.50;
        System.out.println("salary = " + salary);
        salary *= 2; //salary = salary * 2
        System.out.println("salary = " + salary);

        double dodge = 0.00000001;
        dodge *= 1000000;
        System.out.println("dodge = " + dodge);

        System.out.println("------------------");

        double num2 = 25000;
        num2 /= 2;   //num2 = num2 / 2
        System.out.println("num2 = " + num2);

        System.out.println("--------------");

        double num3 = 100;
        num3 %= 3;
        System.out.println("num3 = " + num3);    //1 (100 bölü 3 kalan 1.)

        System.out.println("------------");

        int amount = 127; //cents
        int quarters =amount / 25; //127 centte kaç çeyrek  diye 25 e böl
        // kalanı bulmak için:
        int cents = amount % 25;

        System.out.println("quarters = " + quarters); //5
        System.out.println("cents = " + cents); //2   yani 127 cent 5 çeyreklik artı 2 cent eder kalanı 2


        System.out.println("-----------");
        int cents2 =127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2); //2

        System.out.println("--------------");

        int y =300;
        y %= 16; //300 16 ya bölünürse kalan nedir?
        System.out.println("y = " + y); //12 is the leftover

        System.out.println("---------");

        int balance = 3500;
        //insurance fee: 153 3500ü 153 e bölünce kalan nedir remainder
        balance %= 153;
        System.out.println("balance = " + balance); //134
















    }
}
