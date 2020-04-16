package assignment1;

public class Assignment1_4 {

	public static void main(String[] args) {
	
		Assignment1_4 obj = new Assignment1_4();
		
		Poppable corn = new Poppable() {
			@Override
			public void pop() {
				System.out.println("Popping Corn...");
			}// method
		};// anon class
		
		obj.popIt(corn);
		
		Poppable bubbleWrap = new Poppable() {
			@Override
			public void pop() {
				System.out.println("Popping BubbleWrap...");
			}// method
		};// anon class
		
		obj.popIt(bubbleWrap);
	}// main
	
	public void popIt(Poppable p) {
		p.pop();
	}// method
	
}// class

interface Poppable {
	public void pop();
}// interface
