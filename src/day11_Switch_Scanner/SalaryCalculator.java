package day11_Switch_Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        int salary = 75_000;
        boolean isMarried = true;

        double taxRate = 0; //temporary value, altta tax rate bulacağız zaten
        
        if (salary>=130000){ // false. salary <130000 ise
            taxRate = 0.35;
        } else if (salary>=100000) {  //salary 100000 den kucukse false
            taxRate =0.30;
        } else if (salary>= 80000) {//salary 80000 den kucukse false
            taxRate = 0.25;
        }else {
            taxRate = 0.20;
        }

        if (isMarried){
            taxRate -= 0.05;   //if the person is married subtracting 5% from the original tax rate
        }
//tax rate hesaplandıktan sonra bu hesaplama;

        double salaryAfterTax = salary - (salary*taxRate);
        System.out.println("Salary After Tax = " + salaryAfterTax);



    }
}
/*
2. Write a program that can calculate the salary after tax based on the
following requirements
the tax rates are:
35% for salary of 130K or more
30% for salary of 100K to 130k (excluded)
25% for salary of 80K to 100K (excluded)
20% for salary less than 80K
in addition, if the person is married, he/she will pay 5% less tax
 */