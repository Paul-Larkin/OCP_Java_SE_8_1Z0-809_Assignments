package assignment3;

import java.util.HashMap;
import java.util.Map;

public class Assignment3_10 {

	public static void main(String[] args) {
		
		Map<String, Double> raceTracks = new HashMap<>();
		raceTracks.put("Cork", 10.0);
		raceTracks.put("Dublin", 8.0);
		raceTracks.put("Limerick", 7.0);
		raceTracks.put("Galway", 6.0);
		
		// A: Display Contents
		raceTracks.forEach((key, value) -> System.out.println("Venue: " + key + "... Distance in Miles: " + value));
	
		// B: Convert to KM
		raceTracks.forEach((key, value) -> raceTracks.replace(key, value, value*1.60934));

		System.out.print("\n");
		// C: Display Updated Contents
		raceTracks.forEach((key, value) -> System.out.println("Venue: " + key + "... Distance in Km: " + value));
	}
}// class
