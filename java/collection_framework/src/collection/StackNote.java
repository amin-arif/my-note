package collection;

import java.util.Stack;

public class StackNote {
	public static void main(String[] args) {
		Stack<String> fruits = new Stack<>();
		
		fruits.push("Apple"); // Push value inside stack
		fruits.push("Banana");
		
		System.out.println(fruits);
		
		System.out.println(fruits.peek()); // Check top value
		
		fruits.pop(); // Remove top value
		
		System.out.println(fruits);
	}
}
