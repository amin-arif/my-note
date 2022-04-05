package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetNote {
	
	public static void main(String[] args) {
		// Set doesn't allow duplicate value
		// HahsSet doesn't maintain the orders of its elements
		Set<Integer> mySet = new HashSet<>();
		
		// LinkedHashSet also same as HashSet but it maintains the order of its elements
		// Set<Integer> linkedHashSet = new LinkedHashSet<>();
		
		mySet.add(5);
		mySet.add(24);
		mySet.add(5); // It not include in list (because it already exists)
		mySet.add(11);
		mySet.add(20);
		
		System.out.println(mySet);
		
		mySet.remove(11);
		System.out.println(mySet);
		
		System.out.println(mySet.contains(50)); // check value exists or not
		
		mySet.clear(); // remove all value from list and make it empty
		System.out.println(mySet);
	}
}
