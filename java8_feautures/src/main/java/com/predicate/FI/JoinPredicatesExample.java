package com.predicate.FI;

import java.util.function.Predicate;

public class JoinPredicatesExample {
//joining predicates 
//	->and
//	->or
//	->negate

	public static void main(String[] args) {

		int[] intArray = { 20, 23, 7, 87, 34, 22, 6, 45, 12, 9, 11, 3, 7 };

		Predicate<Integer> p1 = arr -> arr % 2 == 0;
		Predicate<Integer> p2 = arr -> arr > 20;

		// and
		System.out.println("using and ");
		for (int nums : intArray) {
//			if(p1.and(p2).test(nums)) {
			if (p1.test(nums) && p2.test(nums)) {
				System.out.println(nums);
			}
		}
		// or
		System.out.println("using or ");
		for (int nums : intArray) {
			if (p1.or(p2).test(nums)) {

				System.out.println(nums);
			}
		}
		
		System.out.println("using negate foe p1 ");

		for (int nums : intArray) {
			if (p1.negate().test(nums)) {

				System.out.println(nums);
			}
		}
		System.out.println("using negate foe p2 ");

		for (int nums : intArray) {
			if (p2.negate().test(nums)) {

				System.out.println(nums);
			}
		}

	}

}
