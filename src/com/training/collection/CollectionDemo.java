package com.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.training.adi.Employee;
import com.training.adi.NameComparator;

public class CollectionDemo {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		
		List<Employee> empSet = new ArrayList<>();
		empSet.add(new Employee("Kevin", 102, "Accounts", 125000));
		empSet.add(new Employee("David", 103, "Sales", 130000));
		empSet.add(new Employee("Adam", 101, "IT", 130000));
		
		Collections.sort(empSet,new NameComparator());
		
		Set<String> names = new TreeSet<>();
		names.add(new String("Rohan"));
		names.add(new String("Priya"));
		names.add(new String("David"));
		
		
		System.out.println("Names in sorted way::");
		for(String name:names) {
			System.out.println(name);
		}
		
		Map<Integer, String> myMap = new HashMap<>();
		
		myMap.put(1, "Mark");
		myMap.put(2, "Pete");
		myMap.put(3, "Clara");
		myMap.put(4, "Sara");
		
		for(Map.Entry<Integer, String> entry : myMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
			
			
		}
		
		myList.add(25);
		myList.add(50);
		myList.add(100);
		
		Iterator<Integer> it = myList.iterator();
		
		while(it.hasNext()) {
			int myNumber = it.next();
			System.out.println(myNumber);
		}
		
		for(Employee emp:empSet) {
			System.out.println(emp.getEmpName());
			
		}
	}

}
