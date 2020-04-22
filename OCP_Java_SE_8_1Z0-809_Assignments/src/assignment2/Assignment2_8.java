package assignment2;

public class Assignment2_8 {

	public static void main(String[] args) {
		
		PrinterCombo printer = new PrinterCombo();
		printer.scan();
		printer.sendFax();
		printer.print();
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
	public void sendFax() {
		fax.sendFax();
	}
	@Override
	public void scan() {
		scan.scan();
	}
	@Override
	public void print() {
		System.out.println("Printing");
	}
}// class

class Scanner implements Scan{
	@Override
	public void scan() {
		System.out.println("Scanning");
	}
}// class

class FaxMachine implements Fax{
	@Override
	public void sendFax() {
		System.out.println("Faxing");
	}
}// class

interface Print{
	public void print();
}

interface Scan{
	public void scan();
}

interface Fax{
	public void sendFax();
}
