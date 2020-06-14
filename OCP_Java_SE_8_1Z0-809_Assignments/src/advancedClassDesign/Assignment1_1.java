package advancedClassDesign;

public class Assignment1_1 {
	
	public class PopcornMaker {
		void makePopCorn() {
			float poppingSpeed = 2.0f;
			System.out.println("Popcorn is popping at a speed of: " + poppingSpeed);
			System.out.println("Popcorn is now ready");
		}// method
	}// inner class
	
	public static void main(String[] args) {
		/* Two line approach
		Assignment1_1 a = new Assignment1_1();
		PopcornMaker p = a.new PopcornMaker();
		*/
		
		// One line approach
		PopcornMaker p = new Assignment1_1().new PopcornMaker();
		p.makePopCorn();
	}// main
}// class
