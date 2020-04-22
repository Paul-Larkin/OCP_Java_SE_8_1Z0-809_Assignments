package assignment2;

import java.util.function.Predicate;

public class Assignment2_3 {
	
	public static void main(String[] args) {
		
		Predicate<Integer> lambda1 = x -> x >= 100; 
		
		Predicate<Integer> lambda2 = (Integer x) -> { return x >= 100; }; 
		
		// Predicate<Integer> lambda3 = () -> x >= 100; 
		// No value in argument
		
		Predicate<Integer> lambda4 = (x) -> { return x >= 100; }; 
		
		// Predicate<Integer> lambda5 = Integer x -> { return x >= 100; }; 
		// No parenthesis around argument
		
		Predicate<Integer> lambda6 = x -> true; 
		
		// Predicate<Integer> lambda7 = x -> { return; };  
		// Must return a boolean value
		
		// Predicate<Integer> lambda8 = (int x) -> { return x >= 100; }; 
		// Expected type Integer
		
	}// main
}// class
