package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Assignment7_10 {

	public static void main(String[] args) {
		/*
		 * Using ExecutorService send tasks to be processed
		 * Notice that no order of output can be predicted
		 */
		
		ExecutorService e = Executors.newFixedThreadPool(2);
		
		Runnable job1 = () -> { 
			for(int i = 1; i <= 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		};
		
		Runnable job2 = () -> { 
			for(int i = 10; i > 0; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
		};
		
		e.submit(job1);
		e.submit(job2);
		
		/*
		e.submit((Runnable) () -> { 
			for(int i = 1; i <= 10; i++) {
				System.out.print(i);
			}
			System.out.println();
		});
		*/
	}

}
