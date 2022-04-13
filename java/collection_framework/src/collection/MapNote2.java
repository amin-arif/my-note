import java.util.*;
import java.lang.*;

public class MapNote {
	public static void main(String[] args) {
		// Default Map initialization
		Map<String, Integer> hm = new HashMap<>();
		// Map initialization with Generics
		Map<Integer, String> hm2 = new HashMap<Integer, String>();
		
		// Adding Elements using put() method
		hm.put("Hello", 10);
		hm.put("World", 20);
		hm.put("Happy", 30);
		hm.put("Coding", 40);
		System.out.println("Adding Elements : " + hm);

		// Update Elements 
		hm.put("Hello", 111);
		hm.put("World", 222);
		System.out.println("Value Update : " + hm);

		// Remove Element from Map
		hm.remove("Happy");
		System.out.println(hm.remove("Coding")); // It returns remove key's value
		System.out.println(hm.remove("Demo")); // It returns null value (Since Demo is not present in Map)
		System.out.println("After Remove : " + hm);

		hm2.put(2, "Arif");
		hm2.put(3, "Kanon");
		hm2.put(1, "Al Amin");

		System.out.println(hm2.size()); // Size of the Map
		System.out.println("Map Keys: " + hm2.keySet()); // Returns Keys Set of the Map
		System.out.println("Map values: " + hm2.values()); // Returns Values Set of the Map
		System.out.println("Set of keys and map: " + hm2.entrySet()); // Returns a Set of keys and values of Map
		
		// Show Map contents using for-each loop
		for (Map.Entry mapElement : hm2.entrySet()) {
			int key = (int)mapElement.getKey(); // Object type to integer
			String value = (String)mapElement.getValue(); // Object type to String
			System.out.println("Map key: " + key + "  Value: " + value);
		}

		Map<Integer, String> hm3 = new HashMap<>();
		System.out.println("Is empty? " + hm3.isEmpty()); // Check the Map is empty or not

		hm3.put(11, "John");
		hm3.put(22, "Smith");
		System.out.println("Value of id 11 is:" + hm3.get(22)); // Get value using specific key

		// putAll() method
		hm2.putAll(hm3);
		System.out.println("Merged hm2 is: " + hm2);

		System.out.println("hm3 Map: " + hm3);
		hm3.clear(); // To clear all elements from the Map
		System.out.println("hm3 Map after clear: " + hm3);

		// Some Methods
		//  hm2.containsKey(1); // Returns True if the key is present in Map else return False
		//  hm2.containsValue("Arif"); // Returns True if the value is present in Map else return False
		//  hm2.equals(hm3); // Returns True if both maps are equal else return False
	  
	}
}
