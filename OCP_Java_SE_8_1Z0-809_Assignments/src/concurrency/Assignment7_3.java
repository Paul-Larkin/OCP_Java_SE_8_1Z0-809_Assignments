package concurrency;

public class Assignment7_3 {

	public static void main(String[] args) throws InterruptedException {
		Job job = new Job();
		Thread t1 = new Thread(job, "John");
		Thread t2 = new Thread(job, "Mary");
		
		t1.start();
		t1.join();
		
		t2.start();
	}
}

class Job implements Runnable {
	public void run() {
		for(int x = 1; x <=10; x++) {
			System.out.println(Thread.currentThread().getName() + " has counted to " + x );
		}
		System.out.println("");
	}
}