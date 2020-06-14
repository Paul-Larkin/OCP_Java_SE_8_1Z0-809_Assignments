package genericsCollections;

import java.util.Map;
import java.util.HashMap;

public class Assignment3_9 {

	public static void main(String[] args) {
		
		Map<String, String> brokers = new HashMap<>();
		brokers.put("Best Insurance Ltd", "Dann Walsh");
		brokers.put("Top Insurance Ltd", "Dann Walsh");
		brokers.put("Permier Insurance Ltd", "Jesse Nolan");
		brokers.put("Premium Insurance Ltd", "Linda Martin");
		
		// A: Display Contents
		brokers.forEach((key,value) -> System.out.println("Key: " +key + " Value: " + value));	
		
		// B: Update Dann Walsh
		brokers.forEach((key, value) -> brokers.replace(key, "Dann Walsh", "Linda Martin"));
		
		// C: Display Updated Contents
		brokers.forEach((key, value) -> System.out.println("Key: " +key + " Value: " + value));
	}

}// class