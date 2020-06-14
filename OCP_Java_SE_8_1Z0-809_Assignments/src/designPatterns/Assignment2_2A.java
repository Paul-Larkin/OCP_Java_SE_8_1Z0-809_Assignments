package designPatterns;

public class Assignment2_2A {

	public static void main(String[] args) {
		
		Student one = new Student("Anne", "Wilson");
		Student two = new Student("Gary", "Davis");
		Student three = new Student("Jill", "Adams");
		
		//printDetails(one);
		Printable p = s -> System.out.println(s + "\n");
		
		printDetails(one, p);
		printDetails(two, p);
		printDetails(three, p);
	}// main

	public static void printDetails(Student s, Printable<Student> p) {
		p.print(s);
	}
}// class

class Student {
	private String firstName;
	private String lastName;
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "First Name: " + getFirstName() +"\nLast Name: " + getLastName();
	}	
}// class

@FunctionalInterface
interface Printable<Student> {
	public void print(Student s);
}// interface
