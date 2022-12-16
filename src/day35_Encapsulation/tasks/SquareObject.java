package day35_Encapsulation.tasks;

import day35_Encapsulation.encapsulation.Person;

public class SquareObject {
    public static void main(String[] args) {

        Square p1 = new Square(5);
        p1.setSide(6);
p1.calcPerimeter();
p1.calcArea();
        System.out.println(p1.getSide() + " is side. Perimeter of square is: "+ p1.calcPerimeter()+". Area of square is: "+ p1.calcArea());
    }
}
