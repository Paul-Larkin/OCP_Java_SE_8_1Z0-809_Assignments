package io;

import java.io.File;

public class Assignment8_4 {

	public static void main(String[] args) {
		
		// Check if a directory is a file or a directory
		File file = new File("myDir");
		
		if(!file.exists()) {
			file.mkdir();
		}
		
		System.out.println("Is this referencing a file..." + file.isFile());
		System.out.println("Does this directory exist..." + file.exists());
		System.out.println("Is it a directory..." + file.isDirectory());
	}

}
