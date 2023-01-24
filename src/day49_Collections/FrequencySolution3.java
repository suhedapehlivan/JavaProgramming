package day49_Collections;

import java.util.*;

public class FrequencySolution3 {
    public static void main(String[] args) {
        String str = "aaaabbbccdd";
        String result="";
        for (int i = 0; i < str.length(); i++) {
            int count =0;
            char ch = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if(ch==str.charAt(j)){
                    count++;
                }
            }
            if(!result.contains(""+ch)){
                result+=ch;
                System.out.print(ch+""+count);
            }
        }

        System.out.println();

        char [] array = str.toCharArray();
        String result1 = "";
        for (char eachChar : array) {
            int count = 0;
            for (char each2 : array) {
                if(eachChar==each2){
                    count++;
                }
            }
            if(!result1.contains(""+eachChar)){
                result1+=eachChar;
                System.out.print(eachChar+""+count);
            }
        }

        System.out.println();

        //String str = "aaaabbbccdd";
        Set<String> list = new HashSet<>();
        list.addAll(Arrays.asList(str.split(""))); // {"a","b","c","d"}

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(str.split(""))); // {"a","a","a","a","b","b","b","c","c","d","d"}

        for (String eachChar : list) {
            int freq = java.util.Collections.frequency(arrayList,eachChar);
            System.out.print(eachChar+""+freq);
        }

    }
}