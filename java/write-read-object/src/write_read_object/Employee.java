package write_read_object;

import java.io.Serializable;

public class Employee implements Serializable {

	// Final serialVersion id
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String gender;
	private int age;
	
	public Employee(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return new StringBuffer("Name: ").append(this.name).append("\nGender: ").append(this.gender).append("\nAge : ").append(this.age).toString();
	}
    
}



























