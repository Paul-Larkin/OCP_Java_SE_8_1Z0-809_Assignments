package advancedClassDesign;

public class Assignment1_5 {

	public static void main(String[] args) {
		
		ShoeSize small = ShoeSize.SMALL;
		ShoeSize medium = ShoeSize.MEDIUM;
		ShoeSize large = ShoeSize.valueOf("LARGE");
		
		System.out.println("My size: " + small);
		System.out.println("Your size: " + medium);
		System.out.println("Big size: " + large);
	}// main
}// class

enum ShoeSize{
	
	SMALL(8), MEDIUM(10), LARGE(16);
	
	private int size;

	ShoeSize(int size) {
		this.size = size;
	}// constructor
	
	public int getSize() {
		return this.size;
	}// method
}// enum
