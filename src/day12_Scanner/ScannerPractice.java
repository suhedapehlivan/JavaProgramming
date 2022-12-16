package day12_Scanner;

// import java.util.*; //wild import: imports everthing from the package
import java.util.Scanner;  //regular import: imports one class. saedece scanner package alır, daha az yer kaplar böylece

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);   // scan variable tanımladığımız için altta scan.next yapabiliriz

        System.out.println("Enter a number between 1 to 7:");

        int num = scan.nextInt();

        String result = "";

        if (num>=1 && num<= 7){

           result = (num==1)?"Monday" :(num==2)?"Tuesday" :(num==3)?"Wednesday"
                    :(num==4)?"Thursday" :(num==5)?"Friday" :(num==6)?"Saturday" : "Sunday";

        }else {
            result = "Invalid Number";
        }

        System.out.println(result);

        scan.close();







    }
}


/*
import

method
 */