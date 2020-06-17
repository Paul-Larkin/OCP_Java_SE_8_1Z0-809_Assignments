package concurrency;

public class Assignment7_6 {

	public static void main(String[] args) {
		ConsumerThread t1 = new ConsumerThread();
		ConsumerThread t2 = new ConsumerThread();
		ConsumerThread t3 = new ConsumerThread();
		ConsumerThread t4 = new ConsumerThread();
		
		ProducerThread p = new ProducerThread();
		
		t1.setProducer(p);
		t2.setProducer(p);
		t3.setProducer(p);
		t4.setProducer(p);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	
		p.start();
	}
}

class ConsumerThread extends Thread {
	private ProducerThread p;
	
	public void run() {
		synchronized(p) {
			try {
				System.out.println(Thread.currentThread().getName() + " started and waiting....");
				p.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " returned " + p.getSum());
	}
	
	public void setProducer(ProducerThread p) {
		this.p = p;
	}
}

class ProducerThread extends Thread {
	private int sum = 0;
	
	public void run() {
		synchronized(this) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for(int x = 0; x <=100; x++) {
				sum += x;
			}
		
			notifyAll();
		}
	}
	
	public int getSum() {
		return sum;
	}
}