package day41_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

        int[] arr = {1,2,3};

        try {
            System.out.println(arr[10]);
            System.out.println("Try Block");
        }catch (RuntimeException e){
            System.out.println("Catch Block");
            e.printStackTrace();
            System.exit(0);
        }finally {
            System.out.println("Finally Block");
        }


        /*
        Interview Question:
Difference between final vs finally vs finalize.

final: is a KEYWORD for variables, methods, classes. and make them unchangeable.

finally: is a BLOCK. optional for try§catch (last block)  in exception handling. It always get executed, if we manually not terminate the program.

finalize: is a METHOD that the garbage collector calls it to destroy the object. It comes from Object class, and every object has finalize method.
         */

    }
}
