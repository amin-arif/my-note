package com.arif.models;

public class Employee {
	private String name;
	
	public String getName() {
		return name;
	}

	// @Loggable
	public void setName(String name) {
		this.name = name;
	}
	
	public void throwException(){
		throw new RuntimeException("Runtime Exception");
	}
}
