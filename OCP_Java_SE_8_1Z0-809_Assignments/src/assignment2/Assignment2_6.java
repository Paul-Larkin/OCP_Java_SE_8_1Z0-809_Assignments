package assignment2;

import java.util.ArrayList;
import java.util.List;

public class Assignment2_6 {

	public static void main(String[] args) {
		Printer.addPrintJob("Duke's Dilemmas.pdf");
		Printer.addPrintJob("Duke's Universe.docx");
		Printer.displayPrintQueue();
	}// main
}// class

class Printer {
	private static Printer INSTANCE;
	private List<String> printQueue;
	
	public static Printer getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Printer();
		}
		return INSTANCE;
	}
	private Printer() {
		printQueue = new ArrayList<>();
	}
	public static void addPrintJob(String job) {
		Printer p = Printer.getInstance();
		p.printQueue.add(job);
	}
	public static void displayPrintQueue() {
		Printer p = Printer.getInstance();
		for(String str: p.printQueue) {
			System.out.println(str);
		}
	}
}// class