package designPatterns;

public class Assignment2_8 {

	public static void main(String[] args) {
		
		PrinterCombo printer = new PrinterCombo();
		printer.scan("Sample.jpeg");
		printer.sendFax("Sample.pdf");
		printer.print("Sample.docx");
	}// main
}// class

class PrinterCombo implements Print, Scan, Fax{
	private Scanner scan;
	private FaxMachine fax; 
	
	PrinterCombo() {
		this.scan = new Scanner();
		this.fax = new FaxMachine();
	}
	
	@Override
	public void sendFax(String str) {
		fax.sendFax(str);
	}
	@Override
	public void scan(String str) {
		scan.scan(str);
	}
	@Override
	public void print(String str) {
		System.out.println("-------------------");
		System.out.println("Printing.... " + str);
		System.out.println("-------------------\n");
	}
}// class

class Scanner implements Scan{
	@Override
	public void scan(String str) {
		System.out.println("-------------------");
		System.out.println("Scanning.... " + str);
		System.out.println("-------------------\n");
	}
}// class

class FaxMachine implements Fax{
	@Override
	public void sendFax(String str) {
		System.out.println("-------------------");
		System.out.println("Faxing.... " + str);
		System.out.println("-------------------\n");
	}
}// class

interface Print{
	public void print(String str);
}

interface Scan{
	public void scan(String str);
}

interface Fax{
	public void sendFax(String str);
}
