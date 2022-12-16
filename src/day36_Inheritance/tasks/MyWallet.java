package day36_Inheritance.tasks;

public class MyWallet {
    public static void main(String[] args) {

       Bitcoin bitcoin1 = new Bitcoin(22,2,123455,234,543,true);
       Ethereum ethereum1 = new Ethereum(33,3,54323,876,32344,true);

        System.out.println("Total Asset: "+ (bitcoin1.totalPrice()+ethereum1.totalPrice()));

    }
}
