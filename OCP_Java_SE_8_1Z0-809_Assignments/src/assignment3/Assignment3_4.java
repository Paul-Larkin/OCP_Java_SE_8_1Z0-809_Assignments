package assignment3;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Comparator;

public class Assignment3_4 {

	public static void main(String[] args) {
		
		// Don't need sorting, so I'll choose HastSet
		Set<Actor> actorHashSet = new HashSet<>();
		Actor jamesD = new Actor("James Dean", "Rebel Without a Cause");
		Actor caryG = new Actor("Cary Grant", "To Catch a Thief");
		Actor tonyC = new Actor("Tony Curtis", "Operation Petticoat");
		
		actorHashSet.add(jamesD);
		actorHashSet.add(caryG);
		actorHashSet.add(tonyC);
		
		// Print using method referencing (best way)
		actorHashSet.stream().forEach(System.out::println);
		
		/*
		Print using consumer and stream	
		Consumer<Actor> consume = (actor) -> System.out.println(actor);	
		actorHashSet.stream().forEach(consume);
		
		Print using consumer and enhanced loop
		for(Actor a:actorHashSet) {
			consume.accept(a);
		}
		*/
		
		System.out.print("\n");
		
		// Now I do need sorting so I'll use TreeSet, then I'll add the HashSet elements
		Comparator<Actor> sortByName = (Actor a1, Actor a2) -> a1.getName().compareTo(a2.getName());
		Set<Actor> actorTreeSet = new TreeSet<>(sortByName);
		actorTreeSet.addAll(actorHashSet);
		actorTreeSet.stream().forEach(System.out::println);
	}
} // class

class Actor {
	private String name;
	private String favMovie;
	
	public Actor(String name, String favMovie) {
		this.name = name;
		this.favMovie = favMovie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavMovie() {
		return favMovie;
	}

	public void setFavMovie(String favMovie) {
		this.favMovie = favMovie;
	}

	@Override
	public String toString() {
		return "Actor [actor=" + name + ", favMovie=" + favMovie + ", toString()=" + super.toString() + "]";
	}
} // class