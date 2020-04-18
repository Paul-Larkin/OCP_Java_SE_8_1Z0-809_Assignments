package assignment2;

public class Assignment2_1A {

	public static void main(String[] args) {
		
		Child child1 = new Child("Jamie", "Davis", false);
		Child child2 = new Child("Hillary","Walsh", true);
		Child child3 = new Child("Danny","Cookson", false);
		
		checkSwimAbility(child1, child -> child.isCanSwim());
		checkSwimAbility(child2, child -> child.isCanSwim());
		checkSwimAbility(child3, child -> child.isCanSwim());
	}// main
	
	public static void checkSwimAbility(Child c, CheckSwimTrait cs) {
		if(! cs.testSwimmable(c)) {
			System.out.println("This Childn needs to take swimming lessons.\n");
			System.out.println(c);
		}
	}// method
}// class

class Child {
	private String firstName;
	private String lastName;
	private boolean canSwim;
	
	public Child(String firstName, String lastName, boolean canSwim) {
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

@FunctionalInterface
interface CheckSwimTrait {
	public boolean testSwimmable(Child c);
}// interface
