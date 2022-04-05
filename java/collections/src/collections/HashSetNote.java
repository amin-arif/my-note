package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetNote {
	
	public static void main(String[] args) {
		// Set doesn't allow duplicate value
		// HahsSet doesn't maintain the orders of its elements
		Set<Integer> mySet = new HashSet<>();
		
		// LinkedHashSet also same as HashSet but it maintains the order of its elements
		// Set<Integer> linkedHashSet = new LinkedHashSet<>();
		
		// TreeSet implements Set interface that uses a tree for storage
		// The elements of value is sorted in ascending order
		// Set<Integer> mySet = new TreeSet<>();
		
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
