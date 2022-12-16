package day19_LoopPractices;

public class LoopsWithoutCurlyBraces {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Cydeo");
            System.out.println("Batch 10");
        }

        for (int i = 0; i < 5; i++)
            System.out.println("Cydeo");


    }
}
/*
Curly braces {} = it is mandatory if there is more than one statements
if we have one statement repeating in loop curly braces are NOT mandatory
but in order to make it readable we can use {}
 */