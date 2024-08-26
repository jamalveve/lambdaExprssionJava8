package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) {

//		ArrayList<Integer> numbers = new ArrayList<>();	
//
//	 // Add numbers to the ArrayList
//    numbers.add(5);
//    numbers.add(10);
//    numbers.add(15);
//    numbers.add(20);
//    numbers.add(25);

		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 25));
		// want to filter even num from collection and store in new list

		List<Integer> evennumberList = new ArrayList<>();

		for (Integer nums : numbers) {
			if (nums % 2 == 0) {
				evennumberList.add(nums);
			}
		}
		System.out.println(evennumberList);

		// with streams
		// storing in collection
		evennumberList = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evennumberList);

		// just print
		numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		numbers.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

//    Set<String> ListofString = new LinkedList<>(Arrays.asS("jamal","jam","krish","akil","Venu"));
		// Create a LinkedList to hold String values (person names)
		LinkedList<String> names = new LinkedList<>();

		// Add names to the LinkedList
		names.add("Alice Johnson");
		names.add("Bob Smith");
		names.add("Charlie Brown");
		names.add("David Williams");
		names.add("Eva Davis");

		List<String> longnames = new LinkedList<>();
		longnames = names.stream().filter(str -> str.length() > 10 && str.length() < 17).collect(Collectors.toList());

		System.out.println(longnames);
		names.stream().filter(str -> str.length() > 10 && str.length() < 17).forEach(str -> System.out.println(str));

		List<String> namesnew = Arrays.asList("Alice", null, "Bob", "Charlie", null, "David");

		namesnew.stream().filter(str -> str != null).forEach(str -> System.out.println(str));

		// with object

		List<ProductClass> ProductClassList = new ArrayList<>();

		// Add ProductClass objects to the list
		ProductClassList.add(new ProductClass("Laptop", 999.99, 10));
		ProductClassList.add(new ProductClass("Smartphone", 699.99, 25));
		ProductClassList.add(new ProductClass("Headphones", 199.99, 15));
		ProductClassList.add(new ProductClass("Keyboard", 49.99, 30));
		ProductClassList.add(new ProductClass("Mouse", 29.99, 50));


		ProductClassList.stream().filter(p -> p.price > 200).forEach(product -> System.out.println(product));
		// if i try here to print the syso->it will print just the adress not the
		// objects
		ProductClassList.stream().filter(p -> p.price > 200).forEach(product -> System.out.println(product.price));
		List<ProductClass> ProductHighPrice = new ArrayList<>();

		ProductHighPrice = ProductClassList.stream().filter(p -> p.price > 200).collect(Collectors.toList());
		System.out.println(ProductHighPrice);// now also it prints the object only I want to print the entire product
												// details

//so either you have to print it using for each by calling the variables
		System.out.println("Products with price higher than $200 using direct variables:");

		ProductClassList.stream().filter(product -> product.price > 200).forEach(product -> {
			System.out.println("Product Name: " + product.name);
			System.out.println("Price: $" + product.price);
			System.out.println("Quantity: " + product.quantity);
			System.out.println();
		});
		
//		or calling the getter methods
//		System.out.println("Products with price higher than $200 using getter from lombok:");
//		ProductClassList.stream()
//                .filter(product -> product.ge > 200)
//                .forEach(product -> {
//                    System.out.println("Product Name: " + product.getName());
//                    System.out.println("Price: $" + product.getPrice());
//                    System.out.println("Quantity: " + product.getQuantity());
//                    System.out.println();
//                });

		ProductClassList.stream().filter(product -> product.price > 200).forEach(ProductClass::displayProduct);
		
		List<ProductClass> filteredProducts=new ArrayList<>();
		System.out.println("way throght another list");
		filteredProducts=ProductClassList.stream().filter(product -> product.price > 200).collect(Collectors.toList());
		filteredProducts.forEach(ProductClass::displayProduct);
		
	
	}
	
}
