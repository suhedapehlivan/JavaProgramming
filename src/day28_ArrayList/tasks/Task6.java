package day28_ArrayList.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

        int firstDublicated =0;
        for (Integer each: list) {
            if (list.indexOf(each) != list.lastIndexOf(each)){
                firstDublicated=each;
                break;
            }

        }
        System.out.println(firstDublicated);
       /* ArrayList<Integer> result = new ArrayList<>(); //{10, 20}

        for (Integer each : list) {
            if(result.contains(each)){
                continue;
            }

            result.add(each);
        }
        System.out.println(result);

        */
    }
}
/*
7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2

 */