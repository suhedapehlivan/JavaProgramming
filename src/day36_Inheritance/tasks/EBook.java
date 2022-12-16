package day36_Inheritance.tasks;

public class EBook extends Book{
    public double size;
    public int pages;

    public void readBook(){
        System.out.println("I read "+ title );
    }

    public void setInfo(double size, int pages) {
        this.size = size;
        this.pages = pages;
    }

    public String toString() {
        return "EBook{" +
                "size=" + size +
                ", pages=" + pages +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
	3.2 Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size, pages

			Methods:
				setInfo()
				readBook()
				toString()


 */