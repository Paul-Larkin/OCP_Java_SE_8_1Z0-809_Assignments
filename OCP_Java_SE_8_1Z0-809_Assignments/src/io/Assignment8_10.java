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

public class Assignment8_10 {

	public static void main(String[] args) {
		
		/* 
		 * Create a class that implements the Serializable interface
		 * then using an object of that class both Serialize the object 
		 * and de-serialize the object. However this time you must also
		 * retrieve data for a non-serializable object
		 */
		Bookv2 b1 = new Bookv2("Enjoy the Decline", "Non-Fiction", new Author("Aaron Clarey"), 20);
		
		File file = new File("Books.ser");
		
		try(FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);) {
			oos.writeObject(b1);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		Bookv2 b2 = null;
		
		try(FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);	
			ObjectInputStream ois = new ObjectInputStream(bis);) {
			b2 = (Bookv2) ois.readObject();
		} catch (IOException| ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(b1);
		System.out.println(b2);
	}
}

class Bookv2 implements Serializable{
	/**
	 * Book class as previously created
	 */
	private static final long serialVersionUID = 1L;
	
	private String title;
	private String genre;
	transient Author author;
	private int price;
	
	public Bookv2(String title, String genre, Author author, int price) {
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

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
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
	
	/*
	 * To allow the transient field to retrieved after de-serialization I wrote the string
	 * fields of the transient field to the .ser file after the defaultWrite() method
	 * then read then and assigned the data to a new object of the non-serializable object
	 */
	private void writeObject(ObjectOutputStream oos)  {
		try {
			oos.defaultWriteObject();
			oos.writeObject(author.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void readObject(ObjectInputStream ois) {
		try {
			ois.defaultReadObject();
			String str = (String) ois.readObject();
			author = new Author(str);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}// class

class Author {
	private String name;
	
	Author(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + "]";
	}	
}
