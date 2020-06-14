package genericsCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Assignment3_3 {

	public static void main(String[] args) {
		Peach spanish = new Peach("Spain", 20.5f);
		Peach ecuadorian1 = new Peach("Ecuador", 20.5f);
		Peach ecuadorian2 = new Peach("Ecuador", 18.5f);
		Peach honduran = new Peach("Honduras", 19.5f);
		
		List<Peach> peaches = Arrays.asList(spanish, ecuadorian1, ecuadorian2, honduran);
		
		// Task one sort by origin
		Comparator<Peach> sortByOrigin = (Peach p1, Peach p2) -> p1.getOrigin().compareTo(p2.getOrigin());
		Collections.sort(peaches, sortByOrigin);
		peaches.stream().forEach(System.out::println);
		
		// Task two sort by weight (note weight field is a float)
		Comparator<Peach> sortByWeight = (Peach p1, Peach p2) -> (int)(p1.getWeight() - (p2.getWeight()));
		Collections.sort(peaches, sortByWeight);
		peaches.stream().forEach(System.out::println);
	}

}// class

class Peach {
	private String origin;
	private float weight;
	
	public Peach(String origin, float weight) {
		this.origin = origin;
		this.weight = weight;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Peach [origin=" + origin + ", weight=" + weight + ", toString()=" + super.toString() + "]";
	}
	
}// class