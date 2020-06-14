package advancedClassDesign;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment1_8 {

	public static void main(String[] args) {
		
		Set<Team> league = new HashSet<>();
		league.add(new Team("Arsenal", "England"));
		league.add(new Team("Man Utd", "England"));
		league.add(new Team("Arsenal", "England"));
		league.add(new Team("Man City", "England"));
		
		Iterator iterator = league.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}// main
}// class

class Team {
	
	String name;
	String country;
	
	public Team(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Team) {
			return this.getName().equals(((Team)obj).getName());
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode(){
		return name.length() * 5;
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + " Country: " + getCountry();
	}
}// class
