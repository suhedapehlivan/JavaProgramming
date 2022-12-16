package day20_Arrays;

public class MinNumberArray {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 4, 20, 1, 0}; //we should compare with the others element to find min

        int min= numbers[0];   //10

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < min){
                min=numbers[i];
            }
        }

        System.out.println(min);
    }
}
