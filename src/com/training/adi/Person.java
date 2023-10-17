package com.training.adi;

public class Person {
	
	String name;
	int age;
	String address;
	
	Person(){
		System.out.println("Parent class constructor called::");
	}
	
	public String getDetails() {
		return "Name: "+name+ " Age: "+age;
	}

}
