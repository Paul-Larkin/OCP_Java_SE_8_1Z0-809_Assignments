package assignment2;

public class Assignment2_4B {
	public static void main(String[] args) {
		Human baby = new Baby();
		baby.eat();
		// baby.playWithToys(); 
		// The method playWithToys() is undefined for the type Human
		((Baby) baby).playWithToys(); 
		// Down Cast to fix
		baby.sleep();
	}// main
}// class

class Human {
	public void eat() {
		System.out.println("A human can eat without supervision.");  
	}
	public void sleep() {
		System.out.println("Sleeping..");   
	}
}// class

class Baby extends Human {
	@Override 
	public final void eat() { 
		System.out.println("A baby cannot eat without supervision.");  
	}
	public void playWithToys() {
		System.out.println("Baby playing with toys.");
	}
}// class

