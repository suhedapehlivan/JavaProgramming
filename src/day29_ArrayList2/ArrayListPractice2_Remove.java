package day29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2_Remove {
    public static void main(String[] args) {

        ArrayList<String> employees =new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));

        employees.retainAll( Arrays.asList("Ahmed", "David") );  //ahmed ve david dışındakileri remove etmek için
//remove starts with M
        System.out.println(employees);

        System.out.println("--------------------------------------------------------------");

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String> list = new ArrayList<>( Arrays.asList(names) );  //arrayi arrayliste dönüştürme

        list.removeIf( p -> p.charAt(0) == 'M' );

        names = list.toArray(new String[0]);   //arraylisti arraye dönüştürme

        System.out.println(Arrays.toString(names));





    }

}
