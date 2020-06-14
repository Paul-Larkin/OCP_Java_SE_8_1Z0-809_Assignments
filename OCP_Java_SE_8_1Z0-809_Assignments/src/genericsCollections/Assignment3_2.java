package genericsCollections;

import java.util.Set;
import java.util.TreeSet;

public class Assignment3_2 {

	public static void main(String[] args) {
		Set<Book> library = new TreeSet<>((Book bookOne, Book bookTwo) -> {return bookOne.getPrice() - (bookTwo.getPrice());});
		
		Book one = new Book("N or M?", "Crime", "A. Christie", 10);
		library.add(one);
		library.add(new Book("Enjoy the Decline", "Comedy", "A. Cleary", 25));	
		library.add(new Book("Enjoy the Decline", "Comedy", "A. Cleary", 25));	
		library.add(new Book("Game of Thrones", "Fiction", "G.R Martin", 20));
		
		library.forEach(System.out :: println);
	}// main
}// class

class Book {
	private String title;
	private String genre;
	private String author;
	private int price;
	
	public Book(String title, String genre, String author, int price) {
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Title: " + title + ", Genre: " + genre + ", Author: " + author + ", Price: " + price;
	}
}// class