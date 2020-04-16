package assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Assignment1_4B {

	public static void main(String[] args) {
		
		List<CD> cdCollection = new ArrayList<>();
		
		cdCollection.add(new CD("Zooropa"));
		cdCollection.add(new CD("Rattle and Hum"));
		cdCollection.add(new CD("Vertigo"));
		/*
		CD.CDComparator cdComparator = new CD.CDComparator();
		Collections.sort(cdCollection, cdComparator);
		*/
		Collections.sort(cdCollection, new Comparator<CD>() {
			@Override
			public int compare(CD one, CD two){
				return one.name.compareTo(two.name);
			}// method
		});// anon class
		
		Iterator<CD> iterator = cdCollection.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}// while
	}// main
}// class

class CD {
	
	String name;
	
	public CD(String name) {
		this.name = name;
	}// constructor

	@Override
	public String toString() {
		return "Name: " + name;
	}// method
	/*
	public static class CDComparator implements Comparator<CD> {
		@Override
		public int compare(CD one, CD two){
			return one.name.compareTo(two.name);
		}// method
	}// class
	*/
}// class
