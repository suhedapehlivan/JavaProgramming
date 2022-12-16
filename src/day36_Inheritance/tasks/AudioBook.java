package day36_Inheritance.tasks;

public class AudioBook extends Book{
    public double length;
    public String narrator;

    public void Listen(){
        System.out.println("I listen "+ title );
    }


    public String toString() {
        return "AudioBook{" +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public void setInfo(double length, String narrator) {
        this.length = length;
        this.narrator = narrator;
    }
}
/*
3.3 Create a sub class of Book named AudioBook:
			variables:
				title, type, author, price, length, narrator

			Methods:
				setInfo()
				listen()
				toString()
 */