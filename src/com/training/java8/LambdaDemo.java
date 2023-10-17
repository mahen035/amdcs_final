package com.training.java8;

public class LambdaDemo {

	public static void main(String[] args) {
		MyInterface obj = (x, y) -> x+y;
		System.out.println(obj.getSum(30, 40));

	}
}

//1. Intermediate Operation(s) -- multiple
//2. Terminal Operation -- one
