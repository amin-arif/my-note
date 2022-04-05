package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetNote {
	
	public static void main(String[] args) {
		// Set doesn't allow duplicate value
		Set<Integer> mySet = new HashSet<>();
		
		mySet.add(5);
		mySet.add(24);
		mySet.add(5); // It not include in list (because it already exists)
		mySet.add(11);
		
		System.out.println(mySet);
		
		mySet.remove(11);
		System.out.println(mySet);
		
		System.out.println(mySet.contains(50)); // check value exists or not
		
		mySet.clear(); // remove all value from list and make it empty
		System.out.println(mySet);
	}
}
