package io;

import java.io.IOException;
import java.io.File;
import java.io.FileReader;

public class Assignment8_3 {

	public static void main(String[] args) {
		
		// Read file date using the FileReader Class
		File file = new File("HelloWorld.txt");
		char[] buffer = new char[1024];
		
		if(file.exists()) {
			try(FileReader fr = new FileReader(file);) {
				fr.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(buffer);
	}
}
