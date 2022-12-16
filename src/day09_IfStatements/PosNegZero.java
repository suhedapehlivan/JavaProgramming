package day09_IfStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int n = 100;
        if (n>0) {
            System.out.println("Positive");
        } else if (n<0) {
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }




        // bu şekilde ayırarak iki bağımsız statement olur =BUG 100 e hem pozirif hem negatif der.

        if (n>0){
            System.out.println("Positive");
        }

        if (n<0){
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }

        // if & else statement we can NEVER apply for the tasks that requires more than two conditions
    }
}
/*
multi-branch if: when there are three or more option/possibilities

if(condition1){
    StatementA
    }else if(Condition2){
    statementB
    }else{
    statementC
    }


    Only one block gets executed.

 */

//5 conditions
// if
// else if
// else if
// else if
// else