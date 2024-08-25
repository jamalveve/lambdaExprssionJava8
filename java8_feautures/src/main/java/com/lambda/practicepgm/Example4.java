package com.lambda.practicepgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

public class Example4 {
//	Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listofIntegers = Arrays.asList(7, 45, 4, 3, 78, 20, 44, 65, 32, 90, 100, 31, 15);
//		listofIntegers.contains(nums->nums%2==0);
//		listofIntegers.forEach(nums->nums%2==0);

		Predicate<Integer> predforeven = num -> num % 2 == 0;
		for (Integer nums : listofIntegers) {
			if (predforeven.test(nums)) {
				System.out.println(nums);
			}
		}
		Iterator<Integer> iterator = listofIntegers.iterator();
		System.out.println("printing even");
		while (iterator.hasNext()) {
			int num = iterator.next();
			if (predforeven.test(num)) {
				System.out.println(num);
			}

		}
		System.out.println("printing odd");
        iterator = listofIntegers.listIterator();

		while (iterator.hasNext()) {
			int num = iterator.next();
			if (!predforeven.test(num)) {
				System.out.println(num);
			}

		}
		
//		this below way also you can get the odd without writing one more function and collecting it to list
        iterator = listofIntegers.listIterator();

		List<Integer> collectigOdd=new ArrayList<>();
		
		 iterator.forEachRemaining(num -> {
	            if (!predforeven.test(num)) {
	            	collectigOdd.add(num);
	            }
	        });
		 System.out.println("odd umber: "+collectigOdd);

//		List<Integer> even=new ArrayList<Integer>(listofIntegers);
//		even.add(nums);
//		System.out.println(even);

	}

}
