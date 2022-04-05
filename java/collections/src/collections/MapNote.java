package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapNote {
	public static void main(String[] args) {
		
		// Map contains values on the basis of keys
		Map<String, Integer> weight = new HashMap<>();
		
		// Almost same as HashMap() but it is ordered
		// Map<String, Integer> weight = new TreeMap<>();

		weight.put("Arif", 62);
		weight.put("Mishu", 54);
		weight.put("Labib", 22);
		weight.put("Samia", 15);

		System.out.println(weight);

		weight.put("Arif", 55); // if exists same key, then update the previous value
		weight.putIfAbsent("Mishu", 70); // If key present, don't update the value, otherwise update the value

		System.out.println(weight + "\n");

		for (Map.Entry<String, Integer> m : weight.entrySet()) {
			System.out.println(m + " | " + m.getKey() + ":" + m.getValue());
		}

		System.out.println("\nMap size: " + weight.size() + "\n");
		System.out.println("Is Arif available: " + weight.containsKey("Arif"));
		System.out.println("Is 15kg person available: " + weight.containsValue(15) + "\n");

		System.out.print("Weights: ");
		for (Integer w : weight.values()) {
			System.out.print(w + "");
		}
		
		System.out.println("\n");
		for (String item : weight.keySet()) {
			System.out.println("Name: " + item + " Age: " + weight.get(item));
		}
		
		weight.clear(); // clear map
		System.out.println("\nIs weight list empty: " + weight.isEmpty()); // check map empty or not
	
	}
	
}










