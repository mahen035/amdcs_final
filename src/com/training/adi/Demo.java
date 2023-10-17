package com.training.adi;

public class Demo {

	public static void main(String[] args) {
		int t = 100;
		increment(t);
		System.out.println(t);
		
		Employee emp = new Employee("Kevin", 102, "Accounts", 125000);
		updateEmp(emp);
		System.out.println(emp);

	}
	static void increment(int b) {
		b = b+10;
	}
	
	static void updateEmp(Employee emp) {
		emp.setDeptName("IT");
	}

}
