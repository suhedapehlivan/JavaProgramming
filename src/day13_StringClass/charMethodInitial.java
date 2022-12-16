package day13_StringClass;

import java.util.Scanner;

public class charMethodInitial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter you first name");
        String firstName = scan.next();  //java

        System.out.println("Enter your last name");
        String lastName = scan.next();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        String initial = " "+ f + "." + l;  //string sayılması için başa boş string koy

        System.out.println("initial = " + initial);

        scan.close();




    }
}


/*
 initial
 firstName = "Wooden Spoon"
 */
