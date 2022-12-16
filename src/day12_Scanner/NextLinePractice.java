package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine(); //enter
        //herhangi bir method sonrası nextLine varsa öncesine input.nextLine(); (for enter) koy
        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your GPA= ");
        double gpa = input.nextDouble();

        input.nextLine();

        System.out.println("Enter your school name= ");
        String schoolName = input.nextLine();

        System.out.println("age = "+ age);
        System.out.println("fullName = "+ fullName);
        System.out.println("gpa = "+ gpa);
        System.out.println("schoolName = "+ schoolName);


        input.close();

    }
}
/*
1.ask the user to enter age (nextInt())
2.ask the user to enter fuyll name (nextLine())
 */

/*
           ** nextLine(); if we are using nextLine() method after the other methods of scanner, we must provide
           one addition nextLine();
           when you use nextLine method after the other methods of scanner
           it is ignore enter key, to avoid ignoring enter key we should add input.nextLine(); before nextline

           nextInt method
           input.nextLine(); (for enter)
           nextline method


 */