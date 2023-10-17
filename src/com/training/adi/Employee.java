package com.training.adi;

import java.util.Objects;

public class Employee{
	
	private String empName;    //camelCased
	private int empId;
	private String deptName;
	private double salary;     //instance variables
	
	public Employee() {
		System.out.println("Object Instantiated::");
	}
		
	public Employee(String empName, int empId, String deptName, double salary) {
		this.empName = empName;
		this.empId = empId;
		this.deptName = deptName;
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public String getDetails() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", deptName=" + deptName + ", salary=" + salary
		+ "]";
	}


	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", deptName=" + deptName + ", salary=" + salary
				+ "]";
	}

	@Override
	public int hashCode() {
		return this.empId;
	}

	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		return Objects.equals(deptName, other.deptName) && empId == other.empId
				&& Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	/*
	 * @Override public int compareTo(Employee o) { //return
	 * this.getEmpName().compareTo(o.getEmpName()); if(this.getEmpId() <
	 * o.getEmpId()) return -1; else if(this.getEmpId() > o.getEmpId()) return 1;
	 * else return 0; }
	 */
	
	


}
// getters and setters, constructors(default, parameterized), how to create objects?
// toString method
// Primitive data types : byte, short, int,long, float, double, char, boolean
// Non Primitives: String, Arrays, Class
