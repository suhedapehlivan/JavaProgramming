package day15_ForLoop;

public class Reverse {

    public static void main(String[] args) {

        String input = "Java";
        int len = input.length();
        String result = "";

        for (int i = len-1; i>= 0; i--){
            char ch = input.charAt(i);
            result = result + ch;

        }

        System.out.println(result);
    }
}
/*
1. Write a program that can reverse any given string

			String str = "Java"; ==> avaJ
		 //			      0123
 */