package concurrency;

public class Assignment7_4 {

	public static void main(String[] args) {
		CountUp cUp = new CountUp();
		Thread t1 = new Thread(cUp, "Counting Up");
		t1.start();
	}
}

class CountUp implements Runnable {
	public void run() {
		for(int x = 1; x <= 10; x++) {
			System.out.println(Thread.currentThread().getName() + " number: " + x);
			if(x == 5) {
				CountDown cDw = new CountDown();
				Thread t2 = new Thread(cDw, "Counting Down");
				t2.start();
				try {
					t2.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class CountDown implements Runnable {
	public void run() {
		for(int x = 10; x > 0; x--) {
			System.out.println(Thread.currentThread().getName() + " number: " + x);
		}
	}
}