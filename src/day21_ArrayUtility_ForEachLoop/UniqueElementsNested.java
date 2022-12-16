package day21_ArrayUtility_ForEachLoop;

public class UniqueElementsNested {
    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};


        for (String each : words) {
            int count =0;

            for (String element : words){
                if (element.equals(each)){
                    count++;
                }
            }
            if (count==1){
                System.out.println(each);
            }
        }





    }
}
