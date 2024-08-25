package com.lambda.practicepgm;

import java.util.function.BiFunction;

public class Example1 {
//	1. Write a Java program to implement a lambda expression to find the sum of two integers.


	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Integer> fn=(num1,num2)->num1+num2;
		System.out.println(fn.apply(5, 4));

	}

}
