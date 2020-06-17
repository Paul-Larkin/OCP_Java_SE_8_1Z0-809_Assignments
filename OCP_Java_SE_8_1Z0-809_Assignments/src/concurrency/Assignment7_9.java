package concurrency;

public class Assignment7_9 {

	public static void main(String[] args) {
		/*
		 * Using a lambda expression create a thread that generates
		 * 100 random numbers. Then execute the thread.
		 */
		Thread t = new Thread(()-> {
			for(int i = 0; i < 100; i++) {
				System.out.println((int)(Math.random() * 100));
			}
		});
		t.start();
	}
}
