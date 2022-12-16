package day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str = "JavaJavaJava";   //kaç kere Java kelimesi geçiyor
        int frequency = 0;
        for (int i = 0; i <= str.length()-4; i++) {  //kelime 4 olduğu için -4
           String eachSub = str.substring(i, i+4);  //Java kelimesi 4 harf oldugu için 4 ekledik
            // System.out.println("eachSub = " + eachSub);

            if (eachSub.equals("Java")){  //upper lower case sensitivity olsaydı equalsIgnoreCase kullanmalısın
                frequency++;
            }

        }

        System.out.println("frequency = " + frequency);

/*Str = "JavaJava";
           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)
 */


    }
}
/*
2. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3
 */

/*
Str = "Java Java Java Python"

        		Delete 1st Java:
        				" Java Java Python"

				Delete 2d Java:
						" Java Python"

				Delete 3rd Java:
						"  Python"
 */