package day05_Concatenation;

public class CarInfo {

    public static void main(String[] args) {

        String year = "2018",
                make = "Toyota",
                model = "Camry",
                miles = "50000",
                color = "Red",
                price = "$19000";

        //System.out.println(year + " " + make + " " + model + ", " + miles + ", " + color + ", " + price + ".");

        String carInfo = year + " " + make + " " + model + ", " + miles + ", " + color + ", " + price + ".";

        System.out.println("carInfo = " + carInfo);


    }

}
//year make model, miles, color, price.
//2018 Toyota Camry, 50000 miles, Red, $19000.