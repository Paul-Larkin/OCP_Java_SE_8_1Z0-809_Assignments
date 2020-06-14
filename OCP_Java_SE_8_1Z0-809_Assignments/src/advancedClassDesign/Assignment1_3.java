package advancedClassDesign;

public class Assignment1_3 {
	
	public void makeMeal() {
		Blender blender = new Blender() {
			@Override
			public void blend() {
				System.out.println("Dinner being prepared...liquidizing food.");
			}// method
		};// anon class
		blender.blend();
	}// method

	public static void main(String[] args) {
		Assignment1_3 obj = new Assignment1_3();
		obj.makeMeal();
	}// main
} //class

interface Blender {
	public void blend();
}// interface

/*
class Blender {
	public void blend() {
		System.out.println("Generic Blending");
	}// method
}// class
*/