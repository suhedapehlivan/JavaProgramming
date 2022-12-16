package day19_LoopPractices;

public class InterviewQuestionFrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabcccd";
        String result = ""; //a2b1c3d1

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);  // each character from string
            int count =0; //how many time this character in string
            for (int i = 0; i < str.length(); i++) {  //to find the frequency of each character
                char each = str.charAt(i); // each characters of str
                if (ch== each){
                    count++;
                }
            }

            if (result.contains("" +ch)){
                continue;
            }

            result += ch;
            result += count;
        }

        System.out.println(result);

    }
}
/*
1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

 */