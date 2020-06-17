package concurrency;

import java.util.ArrayList;
import java.util.List;

public class Assignment7_7 {

	public static void main(String[] args) {
		MailDelivery d1 = new MailDelivery("Hello World 1");
		MailDelivery d2 = new MailDelivery("Hello World 2");
		MailDelivery d3 = new MailDelivery("Hello World 3");
		
		MailProcessor p = new MailProcessor();
		
		d1.setProcessor(p);
		d2.setProcessor(p);
		d3.setProcessor(p);
		
		p.start();
		
		d1.start();
		d2.start();
		d3.start();
	}
}

class MailDelivery extends Thread {
	private MailProcessor mailProcessor;
	String message;
	
	public MailDelivery(String message) {
		this.message = message;
	}
	
	public void setProcessor(MailProcessor mailProcessor) {
		this.mailProcessor = mailProcessor;
	}
	
	/* 
	 * While running the thread sleeps for 5 seconds 
	 * then tell the processor to process the new message
	 */
	public void run() {
		try {
			Thread.sleep(5000);
			mailProcessor.process(" Message passed from " + Thread.currentThread().getName() + " " +message);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}

class MailProcessor extends Thread {
	private List<String> mail = new ArrayList<>();
	
	/*
	 *  The process method must be synchronized to avoid 
	 *  java.lang.IllegalMonitorStateException, when mail 
	 *  is added the thread is notified
	 */
	public void process(String message) {
		synchronized(mail) {
			mail.add(message);
			mail.notify();
		}
	}
	
	/* 
	 * While the processor thread is running it puts the mail object
	 * in a waiting state till notified, after notification is received
	 * it prints the first received message then destroys it
	 */
	public void run() {
		synchronized(mail){
			while(mail.isEmpty()) {
				try{
					mail.wait();  
				} catch(InterruptedException e) {
					e.printStackTrace();	  
				}	 
			}
		System.out.println("Message running: " + mail.get(0));
		mail.remove(0);
		} 	 
	}
}