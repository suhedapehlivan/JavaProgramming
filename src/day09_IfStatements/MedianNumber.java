package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10,
                b = 15,
                c= 20;
        // if we have three different numbers,one must be max, one must be min, and one must be median.

        //                 a=15 b=10 c=20       a=15 c=10 b=20
        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);

        /*
in order for a to be the median number:
1. if c is the maximum number & b is the minimum number, then a is the median number
2. if b is the maximum number & c is the minimum number, then a is the median number
 */

        //                  b=15 a=20 c=10     b=15 a=10 c=20
        boolean bIsMedian = (b > c && b < a) || (b > a && b < c);

        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian){   //if a is the median number
            System.out.println(a+ " is the median number");
        }

        if (bIsMedian){  //if b is the median number
            System.out.println(b+ " is the median number");
        }

        if (cIsMedian){  //if c is the median number
            System.out.println(c+ " is the median number");
        }









    }
}


/*
can find the median number between three different given integers

ex:   a=10   b=15     c=20
output:
15 is the median number
median number: middle
 */

/*
possibility #1: a could be median number
possibility #2: b could be median number
possibility #3: c could be median number
 */

/*
kaç possibility varsa o kadar single if statement
 */