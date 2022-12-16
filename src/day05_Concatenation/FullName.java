package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Suheda";
        String lastName = "Pehlivan";
        int age = 31;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

        // Full name of the person is _____.

        System.out.println("Full name of the person is " + fullName + ".");

        // ___ is __ years old.

        System.out.println(fullName + " is " + age + " years old." );

        // Full name is jobTitle + at + companyname, and Fullname' salary is salary.

        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName
                + " and " + fullName + "'s salary is " + salary + ".");

    }

}
