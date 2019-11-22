package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo{
    public static void main(String[] args) {
        List <Book> bookList = new ArrayList<>();
        bookList.add(new Book("Alchemist", "Paulo Coelho", 2019));
        bookList.add(new Book("Sapians", "Yuval Noah Harari", 2014));
        bookList.add(new Book("MindSet", "Carol Dweck", 2008));
        bookList.add(new Book("Badsha Namdar", "Humayun Ahmed", 2019));

        System.out.println("Print before sorting");

        for (Book book : bookList){
            System.out.println(book);
        }

        System.out.println("Print after sorting");
        Collections.sort(bookList, new SortByYear());

        for (Book book : bookList){
            System.out.println(book);
        }

    }
}

class SortByYear implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
        System.out.println("o1 "+o1);
        System.out.println("o2 "+o2);
        System.out.println("Debug***  "+(o1.getYear() - o2.getYear()));
		return o1.getYear() - o2.getYear();
	}
    
}

class Book{
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", name=" + name + ", year=" + year + "]";
    }

}