package day49_Collections;



public class PerfectNumber {
    public static void main(String[] args) {
        perfect(28);
        perfect(57);

    }

    public static void perfect(int number){
        int sum=0;
        for (int j = 1; j < number; j++) {
            if(number%j==0){
                sum+=j;
            }
        }
        if(sum==number){
            System.out.println(number+ " is perfect");
        }else{
            System.out.println(number + " is not perfect");
        }
    }
}