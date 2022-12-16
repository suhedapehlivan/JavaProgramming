package day16_ForLoopPractices;

public class RemoveDublicates {
    public static void main(String[] args) {

        String str ="aabbaacc";
        String result ="";
                       // i<len de olur i<=len-1 de
        for (int i =0; i <= str.length()-1; i++){  //i: represents the all the index numbers of str start from 0.(i 0 dan başlar last index olan len-1 e kadar devam ettir)
            String ch = ""+ str.charAt(i); //represents each charachter of str

            if (!result.contains(ch)){ //if the character is not contained in the result
                result += ch;    //the charachter will be added to the result
            }//karakteri içermiyorsa ekle ekle a b c olacak
        }
        System.out.println("result = " + result);

    }
}
/*
2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other
 */