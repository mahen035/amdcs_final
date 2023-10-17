package com.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10,12,15,17,21,28);
		
		//Stream<Integer> numStream = numbers.stream();
		
		//numbers.stream().filter(x->x > 15).map(n->n*n).forEach(System.out::println);
		List<Integer> filteredNos = numbers.stream().filter(x->x > 15).map(n->n*n).collect(Collectors.toList());

	}
}
