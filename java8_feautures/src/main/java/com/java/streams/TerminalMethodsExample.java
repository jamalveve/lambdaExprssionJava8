package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalMethodsExample {
//     Terminal Methods:-
//	  1)collect
//	  2)ForEach
//	  3)count
//	  4)min
//	  5)max
//	  6)toArray
//	  7)reduce
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 25));

		numbers.stream().map(num -> num + 5).forEach(res -> System.out.println(res));
		Long evenNUmber = numbers.stream().filter(num -> num % 2 == 0).count();
		System.out.println("count of even numbers in the list: " + evenNUmber);
//				Terminal max,min
		 Optional<Integer> maxvalue=numbers.stream().max((val1, val2) -> {
			return val1.compareTo(val2);
		});

		System.out.println(maxvalue.get());

		Optional<Integer> minuNumber = numbers.stream().min((val1, val2) -> {
			return val1.compareTo(val2);
		});
		

		System.out.println(minuNumber.get());

//				TerminalToARray()
		Object[] arrays = numbers.stream().toArray();
		System.out.println("length of array: "+arrays.length);
		for (Object arr : arrays) {
			System.out.println("element in the array: "+arr);
		}
		System.out.println("printing the array in string way: "+Arrays.toString(arrays));

		System.out.println("printing and coverting list to array and array to string"+Arrays.toString(numbers.stream().toArray()));

//              Terminal Reduce->
		Optional<Integer> reducedNum = numbers.stream().reduce((value, combined) -> {
			return combined + value;
		});
		System.out.println("reduced num: " + reducedNum);
		LinkedList<String> names = new LinkedList<>();

		// Add names to the LinkedList
		names.add("Alice Johnson");
		names.add("Bob Smith");
		names.add("Charlie Brown");
		names.add("David Williams");
		names.add("Eva Davis");
		names.add("Eva Davis");
		names.add("Bob Smith");

//				Terminal Reduce->with string
//				basicall reduce will collection teh collectin of list  inn to_.one single stream of object
		Optional<String> reducedString = names.stream().reduce((value, combined) -> {
			return combined + value;
		});
		System.out.println("reduced String : " + reducedString + "");
		List<String> UppercaseNames = new LinkedList<>();
//          Terminal collector
		UppercaseNames = names.stream().map(name -> name.toLowerCase()).collect(Collectors.toList());
		System.out.println("names in to Uppercase with duplicates: " + UppercaseNames);

//	        Terminal distinct->unique
//				Integer countofEname=
		List<String> distinctList = new LinkedList<>();

		distinctList = UppercaseNames.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctList);

		UppercaseNames.stream().distinct().forEach(res -> System.out.println(res));

//			Terminal count
		Long countOfDistince = UppercaseNames.stream().distinct().count();
		System.out.println("count of distinct names: " + countOfDistince);

		Long namesContainsE = UppercaseNames.stream().filter(str -> str.contains("e")).count();
		System.out.println("count of  names which has (e) in its name: " + namesContainsE);

		// with Object

		List<ProductClass> ProductClassList = new ArrayList<>();

		// Add ProductClass objects to the list
		ProductClassList.add(new ProductClass("Laptop", 999.99, 10));
		ProductClassList.add(new ProductClass("Smartphone", 699.99, 25));
		ProductClassList.add(new ProductClass("Headphones", 199.99, 15));
		ProductClassList.add(new ProductClass("Keyboard", 49.99, 30));
		ProductClassList.add(new ProductClass("Mouse", 29.99, 50));

		System.out.println("printing first 3 products");
		ProductClassList.stream().limit(3).forEach(product -> {

			System.out.println("Product Name: " + product.name);
			System.out.println("Price after discount: $" + product.price);
			System.out.println("Quantity: " + product.quantity);
			System.out.println();

		});

		
		
		
	}

}
