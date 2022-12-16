package day17_While_DoWhile;

public class BranchinStatements2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E' ; i++){
            if (i=='C'){  //C yi skip eder A B D E olur
                continue;
            }
            System.out.println(i);
        }

        System.out.println("--------");
        //print all even numbers between 1-10

        for (int i = 1; i <=10; i++) {
            if (i%2!=0){
                continue;
            }
            System.out.print(i);
        }

        System.out.println();
        System.out.println("--------");
        //print all odd numbers between 1-10

        for (int i = 1; i <=10; i++) {
            if (i%2==0){
                continue;
            }
            System.out.print(i);
        }
    }
}
