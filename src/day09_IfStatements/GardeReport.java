package day09_IfStatements;

public class GardeReport {

    public static void main(String[] args) {

        int grade = 65;
        String finalGrade;

        if (grade >= 90 && grade <= 100){
            finalGrade = "A";
        } else if (grade >= 80 && grade <= 89) {
            finalGrade = "B";
        } else if (grade >= 70 && grade <= 79) {
            finalGrade = "C";
        } else if (grade >= 60 && grade <= 69) {
            finalGrade = "D";
        }else {
            finalGrade = "F";
        }

        System.out.println("grade = " + finalGrade);


    }
}
