package lamdas;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Student st = new Student(); 
		// show(st);

		makePrintable(() -> System.out.println("Hello Mr"));

		makeShowable((name, age) -> {
			System.out.println("Name: " + name + "\nAge: " + age);

			return "Ok!";
		});
		
		Calculator calc = (val1, val2) -> {
			return val1 * val2;
		};
		
		int result = calc.calculate(5, 7);
		System.out.println("Calclation result:" + result);
		
		
		
		ArrayList<Integer> ageList = new ArrayList<>();
		
		ageList.add(5);
		ageList.add(20);
		ageList.add(55);
		
		ageList.forEach(item -> System.out.println("Item: " + item));
		
		
	}

	
	
	public static void makePrintable(Printable pt) {
		pt.print();
	}

	public static void makeShowable(Showable sh) {
		sh.show("John", 25);
	}
}
