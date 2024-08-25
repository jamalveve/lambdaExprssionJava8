package com.lambda.practicepgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Example3 {
//	Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String
		Function<String,String> functiontoUpercase=str->str.toUpperCase();
		System.out.println(functiontoUpercase.apply("jamal"));

		Function<String,String> functiontolowyercase=str->str.toLowerCase();
		System.out.println(functiontolowyercase.apply("JAMAL"));
		
//		list of String
		List<String> listofString1= Arrays.asList("jamal","lavanya","madhu");
		listofString1.replaceAll(str->str.toUpperCase());
		System.out.println(listofString1);
		
		List<String> listofString2= Arrays.asList("JAAML","LAVAYNY","AMDHU");

		listofString2.replaceAll(str->str.toLowerCase());
		System.out.println(listofString2);
	}

}
