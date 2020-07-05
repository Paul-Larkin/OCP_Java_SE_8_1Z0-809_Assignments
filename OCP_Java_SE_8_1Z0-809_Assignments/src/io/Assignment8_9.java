package io;

import java.io.Serializable;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Assignment8_9 {

	public static void main(String[] args) {
		
		/* 
		 * Create a class that implements the Serializable interface
		 * then using an object of that class both Serialize the object 
		 * and de-serialize the object
		 */
		Book b1 = new Book("Test", "Test", "Test", 10);
		
		File file = new File("Books.ser");
		
		try(FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);) {
			oos.writeObject(b1);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		Book b2 = null;
		
		try(FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);	
			ObjectInputStream ois = new ObjectInputStream(bis);) {
			b2 = (Book) ois.readObject();
		} catch (IOException| ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(b1);
		System.out.println(b2);
	}
}

class Book implements Serializable{
	/**
	 * Book class as previously created
	 */
	private static final long serialVersionUID = 1L;
	
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

