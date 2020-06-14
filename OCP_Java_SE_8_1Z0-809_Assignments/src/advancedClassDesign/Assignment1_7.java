package advancedClassDesign;

public class Assignment1_7 {

	public static void main(String[] args) {
		
		Book b1 = new Book("Computer Science", "978-3-16-148410-0");
		Book b2 = new Book("Computer Science", "978-3-16-148410-0");
		
		if(b1.equals(b2)) {
			System.out.println("Same Book");
		} else {
			System.out.println("Different Books");
		}
	}// main
}// class

class Book{
	String title;
	String isbn;
	
	public Book(String title, String isbn) {
		this.title = title;
		this.isbn = isbn;
	}// constructor
	
	public String getIsbn() {
		return isbn;
	}// method

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			return this.getIsbn().equals(((Book) obj).getIsbn());
		} else {
			return false;
		}
	}// method

	@Override
	public String toString() {
		return "Title: " + title + "ISBN: " + isbn;
	}// method
}// class
