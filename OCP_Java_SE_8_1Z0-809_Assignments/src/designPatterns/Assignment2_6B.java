package designPatterns;

import java.util.List;
import java.util.ArrayList;

public class Assignment2_6B {

	public static void main(String[] args) {
		
		List<Wheel> carWheels = new ArrayList<>();
		
		carWheels.add(WheelFactory.createWheel("Hubless"));
		carWheels.add(WheelFactory.createWheel("Alloy"));
		carWheels.add(WheelFactory.createWheel("Mansell"));
		carWheels.add(WheelFactory.createWheel("Mansel"));

		for(Wheel w : carWheels) {
			System.out.println(w);
		}
		
	}// main
}// class

class Wheel {
	private String type = "Generic Wheel";
	private float price = 0.00F;
	
	public Wheel() {}
	
	public Wheel(String type, float price) {
		this.type = type;
		this.price = price;
	}
	public String toString() {
		return ("Wheel Type: " + type + " Price: " + price + "\n");
	}
}// class
class Alloy extends Wheel{
	public Alloy() {
		super("Alloy", 16.50F);
	}
}
class Hubless extends Wheel{
	public Hubless() {
		super("Hubless", 11.50F);
	}
}
class Mansell extends Wheel{
	public Mansell() {
		super("Mansell", 11.50F);
	}
}// class
class WheelFactory {
	
	public static Wheel createWheel(String type) {
		if(type.equals("Alloy")) {
			return new Alloy();
		} 
		else if (type.equals("Hubless")) {
			return new Hubless();
		} 
		else if (type.equals("Mansell")) {
			return new Mansell();
		} 
		else return new Wheel();		
	}
}// class