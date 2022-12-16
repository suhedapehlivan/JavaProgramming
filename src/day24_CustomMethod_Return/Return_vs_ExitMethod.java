package day24_CustomMethod_Return;

public class Return_vs_ExitMethod {
    public static void main(String[] args) {

        nameOfMonth(50);

        System.out.println("Hello World");

    }
/*
branching statements:
	continue: skipping the current iteration - loop
	break: exits the loop or switch
	return: exiting the method (one method, current method)
	System.exit(0): exits the system (EVERY THING WILL BE TERMINATED)
 */


    public static void nameOfMonth(int number){  // 95

        if(number < 1 || number > 12){// if number is invalid
            System.out.println("Invalid");
            // return; // exits nameOfMonth method, remaining code fragments of the method never gets executed
            System.exit(0);
        }

        String name =  (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                :(number==11)?"Nov" : "Dec";

        System.out.println("Month name = " + name);

    }


}
