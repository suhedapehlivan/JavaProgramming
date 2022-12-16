package day08_IfStatement;

public class SwapTwoVariables_WithTemporaryVariable {

    public static void main(String[] args) {

        int a = 10;
        int b= 15;

        System.out.println("a = " + a); //15
        System.out.println("b = " + b); //10

        int c = b; //c=15
        b = a; //b yi reassign yaparsan old value gone b=10
        a = c;






    }

}
