package com.lambda.practicepgm;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Example6 {
//	Write a Java program to implement a lambda expression to find the average of a list of doubles.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> listofDoubles= Arrays.asList(10.5, 20.75, 30.0, 40.25, 50.0);
		Function<Double,Double> functINt=num->num+=num/ listofDoubles.size();
//		System.out.println(functINt.apply(listofDoubles));
		double average=0.0;
		for(Double doubles:listofDoubles) {
			average=functINt.apply(doubles);
//			System.out.println("average of all the doubles "+average);

		}
		System.out.println("average of all the doubles "+average);
		
		 // Calculate the average using the Stream API and a lambda expression
        double averages = listofDoubles.stream()
                                      .mapToDouble(Double::doubleValue) // Convert Double to double
                                      .average()                         // Calculate average
                                      .orElse(Double.NaN);              // Handle empty list

        // Print the average
        System.out.println("Average: " + averages);

			

	}

}
