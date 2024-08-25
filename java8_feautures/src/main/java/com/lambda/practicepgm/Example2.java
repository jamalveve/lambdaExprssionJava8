package com.lambda.practicepgm;

import java.util.function.Predicate;

public class Example2 {
//	2. Write a Java program to implement a lambda expression to check if a given string is empty.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> p1=str->str.isEmpty();
		System.out.println(p1.test(" "));
		System.out.println(p1.test("jaaml"));


	}

}
