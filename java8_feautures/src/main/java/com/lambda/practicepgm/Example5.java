package com.lambda.practicepgm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Example5 {
//	Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listofString1= Arrays.asList("madhu","lavanya","jamal");
		
        BiFunction<String, String, Integer> alphabeticalComparator = (s1, s2) -> s1.compareTo(s2);

        Comparator<String> comparator = (s1, s2) -> alphabeticalComparator.apply(s1, s2);
		System.out.println("sorted strings way1");

        listofString1.sort(comparator);
        System.out.println(listofString1);
		
		
		
		listofString1.sort((str1, str2) -> str1.compareToIgnoreCase(str2));
		System.out.println("sorted strings way 2");
        System.out.println(listofString1);
//      iterate		
		for(String str:listofString1) {
			System.out.println(str+", ");

			}

	}

}
