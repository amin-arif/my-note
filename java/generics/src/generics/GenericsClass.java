package generics;

// A Generics Class
public class GenericsClass<T> {
	
	// variable of T type
	private T data;
	
	public GenericsClass(T data) {
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
}
