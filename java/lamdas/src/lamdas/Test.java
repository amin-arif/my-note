package lamdas;

public class Test {
	
	interface Fast {
		int calculate(int x, int y);
	}
	
	public static int calc(int x, int y, Fast obj) {	
		return obj.calculate(x, y);
	}
	
	public static void main(String[] args) {
		Fast f1 = (num1, num2) -> num1 * num2;
		Fast f2 = (num1, num2) -> num1 + num2;
		
		System.out.println("Multiplication: " + calc(10, 6, f1));
		System.out.println("Addition: " + calc(10, 6, f2));
	}

}
