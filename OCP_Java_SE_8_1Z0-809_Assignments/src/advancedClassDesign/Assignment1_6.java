package advancedClassDesign;

public class Assignment1_6 {

	public static void main(String[] args) {
		
		IceCream small = IceCream.SMALL;
		IceCream large = IceCream.LARGE;
		IceCream jumbo = IceCream.valueOf("JUMBO");
		
		System.out.println(small);
		System.out.println(large);
		System.out.println(jumbo);
	}// main
}// class

enum IceCream{
	
	SMALL(500), LARGE(1000), JUMBO(2000){
		public String getTubColour() {
			return "Green";
		};// method
	};
	
	float ounces;	
	String colour = "red";
	
	IceCream(float size) {
		this.ounces = size;
	}// constructor
	
	public float getOunces(){
		return ounces;
	}// method
		 
	public String getTubColour(){
		return colour;
	}// method

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Size: " + ounces +"oz " + "Colour: " + colour;
	}// method
}// enum
