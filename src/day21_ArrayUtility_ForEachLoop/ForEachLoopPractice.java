package day21_ArrayUtility_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        // print first and last characters for each element
       String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};
       //first get every single elements
        for ( String each : words ){
            System.out.println(each.charAt(0)+ ""+ each.charAt(each.length()-1));
        }
// we should add "" to be string




    }
}
