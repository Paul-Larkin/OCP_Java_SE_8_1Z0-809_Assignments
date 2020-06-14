package concurrency;

public class Assignment7_5 {

	public static void main(String[] args) {
		VoteCounter job = new VoteCounter();
		Thread t1 = new Thread(job, "Monica");
		Thread t2 = new Thread(job, "Joey");
		t1.start();
		t2.start();
	}
}

class VoteCounter implements Runnable {
	private static int vote_counter = 0; 
	
	public void run() {
		for(int i=0; i<5; i++){
			synchronized(this) {
				increment_voteCounter();
				System.out.print("Vote recorded by " + Thread.currentThread().getName());
				try {
					Thread.sleep(2000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println(" current count is: " + getVoteCounter());
			}
		}
	}
	public static void increment_voteCounter(){
		  vote_counter++;
	}
		 
	public static int getVoteCounter(){
		  return vote_counter;
	}
}
