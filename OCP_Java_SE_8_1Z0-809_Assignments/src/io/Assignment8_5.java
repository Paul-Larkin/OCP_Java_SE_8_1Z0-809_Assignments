package io;

import java.io.File;
import java.io.IOException;

public class Assignment8_5 {

	public static void main(String[] args) throws IOException {
		
		// Create a hierarchy of directory using mkdirs() method
		File parent = new File("ParentDir\\ChildDir");
		File child = new File(parent, "Childfile.txt");
		
		System.out.println(parent.exists());
		System.out.println(child.exists());

		child.createNewFile();

		System.out.println(parent.exists());
		System.out.println(child.exists());
	}
}
