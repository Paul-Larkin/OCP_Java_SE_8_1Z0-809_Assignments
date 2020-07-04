package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Assignment8_1 {

	public static void main(String[] args) {
		
		File file = new File("HelloWorld.txt");

//		if(!file.exists()) {
//			try {
//				file.createNewFile();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		if(file.exists()) {
			try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));) {
				pw.write("Hello World!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
