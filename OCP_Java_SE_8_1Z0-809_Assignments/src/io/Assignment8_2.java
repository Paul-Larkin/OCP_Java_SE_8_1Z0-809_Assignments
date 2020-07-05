package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Assignment8_2 {

	public static void main(String[] args) {
		
		// Append to a file using the PrintWriter Class
		File file = new File("HelloWorld.txt");
		
		if(file.exists()) {
			try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));) {
				pw.println();
				pw.append("Hello World but appended!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
