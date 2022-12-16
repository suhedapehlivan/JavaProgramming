package day17_While_DoWhile;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AABBCC";
        String result = ""; // skip the charachter if contains another time

        for (int i = 0; i < str.length(); i++) {
            String ch = ""+ str.charAt(i); //"A""A""B""B""C""C"  (string kullanmalıyız cunku contains sadece string oluyor)
            if (result.contains(ch)){ //if the result already contains character
                continue; //skip
            }
            result += ch;
        }
        System.out.println(result);
    }
}
