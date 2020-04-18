package assignment2;

import java.util.function.Predicate;

public class Assignment2_1B {

	public static void main(String[] args) {
		
		Childx child1 = new Childx("Jamie", "Davis", false);
		Childx child2 = new Childx("Hillary","Walsh", true);
		Childx child3 = new Childx("Danny","Cookson", false);
		
		checkSwimAbility(child1, Childx -> Childx.isCanSwim());
		checkSwimAbility(child2, Childx -> Childx.isCanSwim());
		checkSwimAbility(child3, Childx -> Childx.isCanSwim());
	}// main
	
	public static void checkSwimAbility(Childx c, Predicate<Childx> predicate) {
		if(! predicate.test(c)) {
			System.out.println("This Child needs to take swimming lessons.\n");
			System.out.println(c);
			System.out.print("\n");
		}
	}// method
}// class

class Childx {
	private String firstName;
	private String lastName;
	private boolean canSwim;
	
	public Childx(String firstName, String lastName, boolean canSwim) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.canSwim = canSwim;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "First Name: " + getFirstName() + "\nSecond Name: " + getLastName() + "\nCan Swim: " + isCanSwim();
	}	
}// class
