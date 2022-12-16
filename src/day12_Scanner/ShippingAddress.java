package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();    //JAva ProgrammingEnter

        System.out.println("Enter your building number:");
        String building = scan.next();   //7925A

        scan.nextLine();   //****enter
        System.out.println("Enter your street name:");
        String street = scan.nextLine();  //jones branch driveEnter

        System.out.println("Enter your city name:");
        String city = scan.nextLine();   //McLeanEnter

        System.out.println("Enter your state:");
        String state = scan.next();  //VAEnter

        System.out.println("Enter your zip code:");
        String zipCode = scan.next(); //22012Enter

        scan.nextLine();      //**enter
        System.out.println("Enter your country:");
        String country = scan.nextLine();

        scan.close();








    }
}
/*
1.enter your full name             nextLine
2. enter your building number      next
                                *(baska bir method sonrası nextLine oldugu için buraya input.nextLine ekle
3.enter your street name           nextLine
4. enter your city name            nextLine
5. enter your state                next
6. enter your zip code             next
                                 *nextLine eklenir.
7. enter your country              nextLine

display the shipping address
full name
address
city state zip
country
 */