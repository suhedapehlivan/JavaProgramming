package day15_ForLoop;

public class ForLoopAlphabet {

    public static void main(String[] args) {

        //A-Z   askii table 65-90 for int using of use char
        for (int i = 65; i <=90; i++){
            System.out.print((char) i+" ");
        }
        System.out.println();
        System.out.println("--------------");
    // or
        for (char i = 'A'; i <= 'Z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("--------------");

        for (char i = 'a'; i <= 'z'; i++){  //a-z
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("--------------");

        for (char i = 'Z'; i >= 'A'; i--){   //Z-A
            System.out.print(i +" ");
        }

        System.out.println();
        System.out.println("--------------");

        for (char i = 'z'; i >= 'a'; i--){   //z-a
            System.out.print(i +" ");
        }

        System.out.println();
        System.out.println("--------------");

        for (char i = 1; i <= 40000; i++){  //ilk 40000 char karakteri
            System.out.print(i +" ");
        }

        // char ch = 'ፚ';
    }
}
 /*
        A-Z
        a-z
        Z-A
        z-a

         */