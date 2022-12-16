package day18_NestedLoop;

public class InterviewQuestionDivision {

    public static void main(String[] args) {

        int a = 30;
        int b = 7;
        int count = 0;  //kaç kere çıkaracağımızı sayacak (how many times while is iterated

        while (a>=b){
            a -= b;
            count++;
        }

        System.out.println(count + " with a remainder of " + a);
/*
20 / 6 = 3 with the remainder of 2
6

a=20
b=6
a -= b;   // a=14
a -= b;   // a=8
a -= b;   // a=2   (also 2 is remainder)

a<b olana kadar çıkarırız -=

yani a>=b olana kadar while repeat devam eder, a<b olunca stop

while(a >= b) {
         a -= b;
         count++;
         }
 */

    }
}
/*
    1.  Write a program that can divide two positive numbers without using
     / (division) and * (multiplication) and % operators
 */