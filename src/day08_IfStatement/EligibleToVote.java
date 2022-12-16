package day08_IfStatement;

import java.io.StringReader;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA";

        //Eligible
        if(isEligible){    //True
            System.out.println("Eligible");
        }


        //Not Eligible
        if(!isEligible){    //   !True: false
            System.out.println("Not Eligible");
        }

    }
}
