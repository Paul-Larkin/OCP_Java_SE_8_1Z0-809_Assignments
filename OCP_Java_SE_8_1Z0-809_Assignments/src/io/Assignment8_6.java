package io;

import java.io.File;

public class Assignment8_6 {

	public static void main(String[] args) {
		
		// List all files and directories in a directory
		File parent = new File("ParentDir");
		
		String[] subDirs = parent.list();
		for(String dir : subDirs) {
			System.out.println(dir);
		}
	}
}
