package day09_IfStatements;

public class LeapYear { //IF ELSE

    public static void main(String[] args) {

        int year = 2000;

        boolean leapYear = year % 4 == 0;

        if (leapYear){
            System.out.println("Year "+ year+ " is leap year");
        }

        if (!leapYear){
            System.out.println("Year "+ year+ " is NOT leap year");
        }

        System.out.println("--------------------");

        if (leapYear){
            System.out.println("Year "+ year+ " is leap year");
        }else{
            System.out.println("Year "+ year+ " is NOT leap year");
        }

// iki single if statement kullanacağına bir if else statement kullanmak daha iyi
        // compiler için bir yazmak daha kolay, less work ->using one statement

    }
}
