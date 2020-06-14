package genericsCollections;

public class Assignment3_7 {

	public static void main(String[] args) {
		// Creating my own Generic Type
		GenericType<String> myGenericString = new GenericType<>();
		myGenericString.setT(new String("Java"));
		System.out.println(myGenericString.getT());
	
		GenericType<Cat> myGenericCat = new GenericType<>();
		myGenericCat.setT(new Cat("Tibby"));
		System.out.println(myGenericCat.getT());
	}
}// class

class GenericType<T> {
	private T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	@Override
	public String toString() {
		return "GenericType [t=" + t + "]";
	}
}// class

class Cat {
	private String name;

	public Cat(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name;
	}
}// class