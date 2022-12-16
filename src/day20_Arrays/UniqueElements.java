package day20_Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "Python", "Python"};

        //find frequency for one element
        //after we found the frequency of one element, than we check all them so nested loop

        for (int j = 0; j < words.length; j++) {  //for all elements
            String element = words[j]; //"Java"
            int frequency =0;
            for (int i = 0; i < words.length; i++) {  //finds frequency of element from array,for one element
                if (words[i].equals(element)){   //compare elements
                    frequency++;
                }
            }
            if (frequency==1){   //if frequency is 1 it is unique
                System.out.println(element);
            }

        }
        









    }
}
