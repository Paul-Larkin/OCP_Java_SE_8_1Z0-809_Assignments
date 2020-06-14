package genericsCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Assignment3_1 {

	public static void main(String[] args) {
		
		List<CD> cdCollection = new ArrayList<>();
		cdCollection.add(new CD("Parade", "Spanau Ballet", "Chrysalis"));
		cdCollection.add(new CD("Brothers in Arms", "Dire Straits", "Vertigo"));
		cdCollection.add(new CD("Dedicated to the Moon", "Spagna", "Cherry Pop"));
		
		// sort using anonymous inner class
		Collections.sort(cdCollection, new Comparator<CD>() {
			public int compare(CD one, CD two) {
				return one.getTitle().compareTo(two.getTitle());
			}
		});
		
		// Uses enhanced for loop
		for(CD cd : cdCollection) {
			System.out.println(cd);
		}
		
		System.out.print("\n");
		
		// sort using lambda
		Collections.sort(cdCollection, (cdOne, cdTwo) -> {return cdOne.getArtist().compareTo(cdTwo.getArtist());});
		// uses lambda to print
		cdCollection.forEach(cd -> System.out.println(cd));
		
		System.out.print("\n");
		
		// sort using lambda
		Collections.sort(cdCollection, (cdOne, cdTwo) -> {return cdOne.getLabel().compareTo(cdTwo.getLabel());});
		// uses static method reference to println
		cdCollection.forEach(System.out :: println);
		
	}// main
}// class

class CD {
	private String title;
	private String artist;
	private String label;
	
	public CD(String title, String artist, String label) {
		this.title = title;
		this.artist = artist;
		this.label = label;
	}

	@Override
	public String toString() {
		return "Title: " + title + " - Artist: "+ artist + " - label: " + label; 
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}// class