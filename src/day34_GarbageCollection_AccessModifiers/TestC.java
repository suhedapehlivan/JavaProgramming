package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.*;
import static utilities.MathUtility.*;

public class TestC {
    public static void main(String[] args) {

        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);

        System.out.println("----------------------------");

        // find the sum of 10, 20
        int r1 = sumOfTwoNumber(10, 20);

        // find the sum of 100, 200
        int r2 = sumOfTwoNumber(100, 200);


        int r3 = subtractionOfTwoNumber(100,50);

        int r4 = maxOfTwoNumber(1000, 2000);


    }
}
