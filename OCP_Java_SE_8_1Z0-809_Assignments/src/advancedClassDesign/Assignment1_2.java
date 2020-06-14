package advancedClassDesign;

public class Assignment1_2 {
	
	public void preparePopcorn() {
		float poppingSpeed = 2.0f;
		class PopcornMaker {
			public void makePopcorn() {
				System.out.println("Popcorn is popping at a speed of: " + poppingSpeed);
				System.out.println("Popcorn is now ready");
			}// method
		}// local class
		PopcornMaker p = new PopcornMaker();
		p.makePopcorn();
	}// method
	
	public static void main(String[] args) {
		Assignment1_2 a = new Assignment1_2();
		a.preparePopcorn();
	}// main
}// class
