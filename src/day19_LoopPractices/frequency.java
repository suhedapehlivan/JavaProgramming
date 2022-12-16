package day19_LoopPractices;

public class frequency {
    public static void main(String[] args) {

        String str= "aaaabbbccccccc";
        char ch = 'a';  // each character from string
        int count =0; //how many time this character in string
        for (int i = 0; i < str.length(); i++) {  //to find the frequency of each character
            char each = str.charAt(i); // each characters of str
            if (ch== each){
                count++;
            }
        }
        System.out.println(count);
    }
}
