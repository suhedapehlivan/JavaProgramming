package day10_NestedIfAndTernaries;

public class NameOfMonth2Ternaries {
    public static void main(String[] args) {

        int n = 5;

        String month1 = (n==1)? "Jan" :(n==2)? "Feb" :(n==3)? "Mar" :(n==4)? "Apr" :(n==5)? "May"
                :(n==6)? "Jun" :(n==7)? "Jul" :(n==8)? "Aug" :(n==9)? "Sep"
                :(n==10)? "Oct" :(n==11)? "Nov" : "Dec";
        System.out.println(month1);

// ? ve : sayısı eşit olmalı bu örnekte 11? ve 11: var.
/*
if:            (Condition)?
else:                    :
else if:      :(Condition)?
 */

        // ternaries te () kullanımı optional ama kullansan iyi olur


        System.out.println("------------");
        int n2 = 5;

        String month2 = n2==1? "Jan" :n2==2? "Feb" :n2==3? "Mar" :n2==4? "Apr" :n2==5? "May"
                :n2==6? "Jun" :n2==7? "Jul" :n2==8? "Aug" :n2==9? "Sep"
                :n2==10? "Oct" :n2==11? "Nov" : "Dec";
        System.out.println(month2);

    }
}
