package generics;

// This class only allows Number type values (Integer, Double etc).
public class GenericBoundedType<T extends Number> {
	
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	@SuppressWarnings("unchecked")
	public <A> A makeValue() {
		return (A)"Bangladesh is beautiful";
	}
	
}
