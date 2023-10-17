/*
 * package com.training.adi;
 * 
 * public class MyClass { public static void main(String[] args) {
 * 
 * 
 * //Parent class ref can point to child class object Person emp = new
 * Employee();
 * 
 * Bank bank1 = new SBI(); // Do it in factory design pattern
 * 
 * bank1.getInterestRate();
 * 
 * emp.getDetails();
 * 
 * Employee emp1 = new Employee(); emp1.setEmpName("David"); emp1.setEmpId(101);
 * emp1.setDeptName("Sales"); emp1.setSalary(200000);
 * 
 * Employee emp2 = new Employee("Kevin", 102, "Accounts", 125000);
 * 
 * //System.out.println(emp1);
 * 
 * String s1 = "hello"; String s2 = "hello"; String s3 = new String("hello");
 * String s4 = new String("hello"); s1=s1.concat(" world");
 * System.out.println(s1); //System.out.println(s1==s2);
 * //System.out.println(s3==s4); //System.out.println(s3.equals(s4));
 * 
 * int[] marks = new int[10]; marks[0] = 12; marks[1] = 24;
 * 
 * System.out.println(marks[1]); int x = 0; try { getValue(x); if(marks[1]>50) {
 * throw new MyException("Value cannot be less than 50"); } } catch(Exception e)
 * { System.out.println("Exception occurred"); }
 * 
 * System.out.println("program continues");
 * 
 * }
 * 
 * static void getValue(int a) throws Exception{ int y = 5/a; }
 * 
 * static void increment(int b) { b = b+10; }
 * 
 * }
 * 
 * //
 */