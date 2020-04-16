package assignment1;

public class Assignment1_9 {

	public static void main(String[] args) {
		Car hatchback = new HatchBack("HatchBack");
		
		Car morris = new MorrisMinor();
		morris.setName("Morris Minor");
		
		drivingSimulator(hatchback);
		drivingSimulator(morris);
		
		System.out.println(Car.getNoOfCarsBuilt());
	}// main
	
	public static void drivingSimulator(Car c) {
		if(c instanceof Car) {
			c.drive();
			c.handbrake.applyHandBrake();
			c.handbrake.releaseHandBrake();
			System.out.print("\n");
		} else {
			System.out.println("Not a car");
		}
	}// method
}// class

class Car {
	
	static int carsBuilt;
	String name;
	Handbrake handbrake = new Handbrake();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void drive() {
		System.out.println("Driving Car...");
	}
	
	public Handbrake getHandbrake(){
		return handbrake;
	}
	
	public static int getNoOfCarsBuilt(){
		return Car.carsBuilt;
	}
	
	public Car() {
		carsBuilt++;
	}// constructor
	
	public Car(String name) {
		this.name = name;
		carsBuilt++;
	}// overloaded constructor
}// class

class Handbrake {
	public void applyHandBrake() {
		System.out.println("Applied Handbrake...");
	}
	public void releaseHandBrake() {
		System.out.println("Released Handbrake...");
	}
}// class

class HatchBack extends Car {
	@Override
	public void drive() {
		System.out.println("Driving a " + this.getName() + "...");
	}
	
	public HatchBack() {
	} // constructor
	
	public HatchBack(String name) {
		super(name);
	}// overloaded constructor
}// class

class MorrisMinor extends Car {
	@Override
	public void drive() {
		System.out.println("Driving a " + this.getName() + "...");
	}
}// class