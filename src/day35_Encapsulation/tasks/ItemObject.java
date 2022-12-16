package day35_Encapsulation.tasks;

public class ItemObject {
    public static void main(String[] args) {

        Item items = new Item("table",15,3);
        Item items2 = new Item("chair9",5,10);

        System.out.println(items);
        System.out.println(items2);

        System.out.println(items.calcCost());


    }
}
