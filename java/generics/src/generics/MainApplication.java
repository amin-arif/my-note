package generics;

public class MainApplication {
	
	// Generic work with different types of data (objects). 
	// It does not work with primitive data types (int, float etc).
	
	// A Generics Method
	public <K> void genericMethod(K value) {
		System.out.println("Value from Generics method: " + value);
	}
	
	public static void main(String[] args) {
		
		GenericsClass<String> strObj = new GenericsClass<>("Generics");
		GenericsClass<Integer> intObj = new GenericsClass<Integer>(999);
		
		System.out.println("String data: " + strObj.getData());
		System.out.println("Integer data: " + intObj.getData());
		
		MainApplication obj = new MainApplication();
		
		obj.<String>genericMethod("Hello World");
		// compiler match the type based on value
		obj.genericMethod(3.1416);
		
		GenericBoundedType<Double> boundedObj = new GenericBoundedType<>();
		boundedObj.setValue(123.001);
		System.out.println("Generics Bounded Type: " + boundedObj.getValue());
		String val = boundedObj.makeValue();
		System.out.println("Return type generic method: " + val);
	}
}







