package io;

import java.io.Console;

public class Assignment8_7 {

	public static void main(String[] args) {
		
		// Write a program that accepts/checks password validity using the Console class
		Console console = System.console();
		System.out.println("Enter");
		char[] passwordEntered = console.readPassword();
		char[] actualPassword = {'P', 'a', 'u', 'l'};
		boolean correctPassword = checkPassword(passwordEntered, actualPassword);
		System.out.println("Is this correct: " + correctPassword);
	}
	
	public static boolean checkPassword(char[] passwordEntered, char[] actualPassword) {
		
		if(passwordEntered.length == actualPassword.length) {
			for(int x = 0; x < passwordEntered.length; x++) {
				if(passwordEntered[x] != actualPassword[x]) {
					return false;
				} 
			}
		} else {
			return false;
		}
		return true;
	}
}

// java.lang.NullPointerException in IDE