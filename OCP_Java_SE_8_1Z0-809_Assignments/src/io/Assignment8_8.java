package io;

import java.io.Console;

public class Assignment8_8 {
	
	public static void main(String[] args) {
		
		// Write a program using the Console class that removes non Character elements from input
		Console console = System.console();
		System.out.println("Enter a Word Press ctrl+c to Exit");
		String str = console.readLine();
		while(true) {
			str = removeNonWord(str);
			System.out.println(str);
			str = console.readLine();
		}
	}
	
	public static String removeNonWord(String str) {
		str = str.replaceAll("[^a-zA-Z]", "");
		return str;
	}
}