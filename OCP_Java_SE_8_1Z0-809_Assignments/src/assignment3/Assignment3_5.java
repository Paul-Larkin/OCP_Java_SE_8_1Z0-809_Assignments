package assignment3;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Assignment3_5 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// I want to preserve FIFO order so I'll use ArrayDeque
		ArrayDeque<String> queue = new ArrayDeque<>();
		System.out.println("***TICKET MASTER***\nEnter 99 to Exit");
		while(true) {
			System.out.print("Enter name: ");
			String name = sc.nextLine();
			// Logic to exit
			if(name.equals("99")) {
				sc.close();
				break;
			}
			// The President Skips the queue
			if(name.equals("Mr President")) {
				queue.addFirst(name);
				continue;
			}
			queue.add(name);
		}
		
		System.out.println("\nThe following people are in line:");
		queue.stream().forEach(System.out::println);
		
		System.out.println("\nThe first in line is:");
		System.out.println(queue.peek());
	}
}
