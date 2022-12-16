package day08_IfStatement;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 65;
        boolean divisibleBy2 = number % 2 == 0; //65 e bölünmesini bulmak için remainder bak. eğer sıfırsa bölünür, sıfırdan farklıysa bölünmez.
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        //if the remainder of a number divided by 2 is zero, then it's evenly divisible by2.

        System.out.println(number + " is divisible by 2: " + divisibleBy2);
        System.out.println(number + " is divisible by 3: " + divisibleBy3);
        System.out.println(number + " is divisible by 5: "+ divisibleBy5);


        System.out.println("-------------");

        int year = 2000;
        boolean isLeapYear = year % 4 == 0;
        System.out.println(year + " is leap year: " + isLeapYear);



    }
}

/*
check if a number is evenly divisible by 2,3,5
number=65

output
65 is divisible by 2: false
65 is divisible by 3: false
65 is divisible by 5: true
 */