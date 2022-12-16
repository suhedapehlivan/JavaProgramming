package day21_ArrayUtility_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {


        int[] numbers = {10, 5, 4, 20, 1, 0}; //we should compare with the others element to find max

        int max = numbers[0];   //10

    /*    for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {  //if there is an element in the array that's greater than the current max number
                max = numbers[i];  //assignin greater number to variable max
            }
        }

 */

        for (int number : numbers) {
            if (number>max){
                max= number;
            }
        }

        System.out.println(max);
    }
}