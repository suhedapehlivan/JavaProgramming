package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Suheda Pehlivan",
                buildingNumber = "A7089",
                streetName = "Ziya Gokalp",
                city = "Istanbul",
                state = "Turkey",
                zipCode = "34000";

        // System.out.println( name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode );


        String address = name + "\n" + buildingNumber + " " + streetName
                + "\n" + city + ", " + state + " " + zipCode;

        System.out.println(address);


    }

}
/*
multiple same variable type
variable bitişinde ; yerine , kullan.
 */

/*
Jımmy Joe
7925 Jones Branch Dr
McLean, VA 20125

bu format
 */