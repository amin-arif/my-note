package collection;
import java.util.*;

public class ArrayListNote {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		// LinkedList same as ArrayList. All method works in both list
		// List<String> list = new LinkedList<>();
		
		list.add("Arif"); // Add element in list
		list.add("Al Amin");
		
		list.add(1, "Kanon"); // Add element with index wise
		
		System.out.println(list);
		
		List<String> fruit = new ArrayList<>();
		
		fruit.add("Apple");
		list.addAll(fruit); // Merge list into another list
		
		System.out.println(list);
		System.out.println(list.get(0)); // Get element by index
		
		list.remove(1); // remove value using index
		System.out.println(list);
		
		list.set(2, "Hamza"); // replace or updated value
		System.out.println(list);
		
		System.out.println(list.contains("Arif")); // Check value is exist(true) or not(false)
		
		System.out.println("List size: " + list.size()); // Size of list
		
		// value print by Foreach loop
		for(String element : list) {
			System.out.println(element);
		}
		
		// value print by Iterator
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
	