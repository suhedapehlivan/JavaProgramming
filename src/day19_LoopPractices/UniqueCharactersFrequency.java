package day19_LoopPractices;

public class UniqueCharactersFrequency {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";  //bdf

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0; // represents the frequency of the ch. burada store olacak
            for (int i = 0; i < str.length(); i++) { //compares the character that outer loop picked, with each characters of the string
                char each = str.charAt(i);  //each character of str
                if (ch==each){
                    count++;
                }
            }
         /*   if (count == 1){  //if the frequency of the character is 1, then the character is unique
                result += ch;
            }      ya böyle ya da skip ederek continue ile yapılabilir.*/
            if (count != 1){
                continue;
            }

            result += ch;
        }

        System.out.println(result);




    }
}
//day 16 da index lastindex ile çözümü de var
//burada önce frequency bul ve frequency=1 olan unique olur
/*
2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
 */