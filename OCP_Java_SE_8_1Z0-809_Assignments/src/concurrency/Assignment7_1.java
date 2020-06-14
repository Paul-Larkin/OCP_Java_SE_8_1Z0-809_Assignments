package concurrency;

public class Assignment7_1 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(() -> {
			for(int x = 0; x <= 20; x++) {
				if(x % 2 != 0) {
					System.out.print("Run by: " + Thread.currentThread().getName() + " found the even number: ");
					System.out.println(x);
				}
			}
		} ,"George");
		
		Thread t2 = new Thread (() -> {
			for(int x = 0; x <= 20; x++) {
				if(x % 2 == 0) {
					System.out.print("Run by: " + Thread.currentThread().getName() + " found the odd number: ");
					System.out.println(x);
				}
			}
		} ,"Jimmy");
		
		t1.start();
		t2.start();
	}
}// class
