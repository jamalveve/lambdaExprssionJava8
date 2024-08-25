package com.function.FI;

import java.util.function.Function;

public class FunctionChainingExample {
//functio chaining or function combining can be achived by two methods
//	1)compose()
//	2)andThen()
	public static void main(String[] args) {

		Function<Integer,Integer> func1=num->num*2;//2*2=4
		Function<Integer,Integer> func2=num->num*num;//4*4=16
		
		System.out.println(func1.andThen(func2).apply(2));
		System.out.println(func1.compose(func2).apply(2));//revrse order
//		so forst 2 will ho to funct2->2*2=4
//		them 4 again send to funct1->4*2=8 so 8


		
	}

}
