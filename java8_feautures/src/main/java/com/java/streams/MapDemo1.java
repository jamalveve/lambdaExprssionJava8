package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 25));

		for (Integer nums : numbers) {
			System.out.println(nums += nums);
			System.out.println(nums = nums + 5);
		}
		numbers.stream().map(num -> num + 5).forEach(res -> System.out.println(res));
		LinkedList<String> names = new LinkedList<>();

		// Add names to the LinkedList
		names.add("Alice Johnson");
		names.add("Bob Smith");
		names.add("Charlie Brown");
		names.add("David Williams");
		names.add("Eva Davis");
		names.add("Eva Davis");
		List<String> UppercaseNames = new LinkedList<>();

		UppercaseNames = names.stream().map(name -> name.toLowerCase()).collect(Collectors.toList());
		System.out.println("names in to Uppercase with duplicates: " + UppercaseNames);

		Set<String> UppercaseNamesnoDuplicates = new HashSet<>();
		UppercaseNamesnoDuplicates = names.stream().map(name -> name.toLowerCase()).collect(Collectors.toSet());
		System.out.println("names in to Uppercase without duplicates: " + UppercaseNamesnoDuplicates);

		for (String str : UppercaseNamesnoDuplicates) {
			System.out.println(str.length());
		}

		UppercaseNamesnoDuplicates.stream().map(str -> str.length()).forEach(length -> System.out.println(length));
//with Object

		List<ProductClass> ProductClassList = new ArrayList<>();

		// Add ProductClass objects to the list
		ProductClassList.add(new ProductClass("Laptop", 999.99, 10));
		ProductClassList.add(new ProductClass("Smartphone", 699.99, 25));
		ProductClassList.add(new ProductClass("Headphones", 199.99, 15));
		ProductClassList.add(new ProductClass("Keyboard", 49.99, 30));
		ProductClassList.add(new ProductClass("Mouse", 29.99, 50));

		ProductClassList.stream().filter(product -> product.price > 200).map(product ->{
	        // Directly modify the price of the existing product
	        product.price -= 100;
	        		return product;
		})	
				.forEach(product -> {

					System.out.println("Product Name: " + product.name);
					System.out.println("Price after discount: $" + product.price);
					System.out.println("Quantity: " + product.quantity);
					System.out.println();

				});

	}
}
