package day08_IfStatement;

public class SingleIfStatementsIntro {

    public static void main(String[] args) {

        int number = 301;
        /* System.out.println("Odd Number");  //tek sayı
        System.out.println("Even Number"); //çift sayı */

        boolean evenNumber = number%2 == 0;
        boolean oddNumber = ! evenNumber;    //not even number
        if(evenNumber){

            System.out.println(number + " is even number");
        }
        if(!evenNumber){                 //not even number:odd number
            System.out.println(number+ " is odd number");
        }

        System.out.println("-------------");

        int n = 200;

        //positive
        if (n> 0){    //if the n is greater than zero, then it s positive
            System.out.println(n +" is positive");
        }

        //negative
        if(n<0){    //if the n is less than zero, then it s negative
            System.out.println(n + " is negative");
        }

        //zero
        if(n==0){
            System.out.println(n+ " is zero");
        }

//üçünden sadece biri executed olarak kod outputu görünecek




    }
}


/*
If statements:

      Single If: can be used creating cindition for 1 possible outputs

      if & else: for 2 condition only

      multi-branch if: for 3 or more conditions

      nested if: pre-condition
      (not valid)
 */