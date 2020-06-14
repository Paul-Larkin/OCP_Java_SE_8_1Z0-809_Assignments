package genericsCollections;

import java.util.Map;
import java.util.HashMap;

public class Assignment3_8 {

	public static void main(String[] args) {
		
		Map<String, String> brokers = new HashMap<>();
		brokers.put("Best Insurance Ltd", "Dann Walsh");
		brokers.put("Top Insurance Ltd", null);
		brokers.put("Permier Insurance Ltd", null);
		brokers.put("Premium Insurance Ltd", "Linda Martin");
		
		// A: Display Contents
		//forEach(BiConsumer<? super String, ? super String> action)
		brokers.forEach((key,value) -> System.out.println("Key: " +key + " Value: " + value));	
		
		// Update null Values
		brokers.forEach((key, value) -> brokers.putIfAbsent(key, "Linda"));
		
		// A: Display Contents
		brokers.forEach((key, value) -> System.out.println("Key: " +key + " Value: " + value));
	}

}// class
