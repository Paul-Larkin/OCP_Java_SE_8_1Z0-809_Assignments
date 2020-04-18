package assignment2;

public class Assignment2_2B{

	public static void main(String[] args){
		int number = 100;
		
	    MathOperation opAddition = (x, y) -> x + y;
		number += opAddition.operation(10, 20);
		System.out.println(number); 
		
		MathOperation opSubtraction = (x, y) -> x - y;
		number += opSubtraction.operation(20, 10);
		System.out.println(number); 
		
		MathOperation opMultiplication = (x, y) -> x * y;
		number += opMultiplication.operation(10, 200);
		System.out.println(number);
		
		MathOperation opDivision = (x, y) -> x / y;
		number += opDivision.operation(200, 10);
		System.out.println(number); 
		
	  }// main
}// class

@FunctionalInterface
interface MathOperation {
	public int operation(int x, int y);
}// interface
