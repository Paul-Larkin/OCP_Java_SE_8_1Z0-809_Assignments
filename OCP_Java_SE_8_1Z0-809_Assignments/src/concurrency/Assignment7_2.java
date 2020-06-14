package concurrency;

public class Assignment7_2 {

	public static void main(String[] args) throws InterruptedException {
		RelayThread julian = new RelayThread("Julian");
		RelayThread ann =new RelayThread("Ann");
		RelayThread george =new RelayThread("George");
		RelayThread dick = new RelayThread("Dick");
		RelayThread tim =	new RelayThread("Timmy");
	
		// main Thread calls j.start() then j.join() so when j is finished main will continue
		julian.start();
		julian.join();
		
		ann.start();
		ann.join();
		
		george.start();
		george.join();
		
		dick.start();
		dick.join();
		
		tim.start();
		tim.join();
	}
}

class RelayThread extends Thread{
	float distance = 1.0f;
	
	RelayThread(String name) {
		super(name);
	}

	public void run() {
		while(distance <= 2) {
			try {
				Thread.sleep(1000);
				System.out.println(this.getName() + " has run " + distance + " mile(s).");

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			distance += 1;
		}
		System.out.println(this.getName() + " has finished");
	}
}