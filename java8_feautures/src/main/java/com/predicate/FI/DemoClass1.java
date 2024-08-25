package com.predicate.FI;

import java.util.ArrayList;
import java.util.function.Predicate;

public class DemoClass1 {

	public static void main(String[] args) {

		Predicate<Integer> p = integer -> (integer > 10);
		System.out.println(p.test(20));

		Predicate<String> p1 = str -> (str.length() > 5);
		System.out.println(p1.test("jamaltt"));

		Predicate<String> p2 = str -> (str.contains("h"));
		System.out.println(p2.test("harish"));
		System.out.println(p2.test("janu"));
		System.out.println(p2.test("alice"));

		String[] names = { "jamla", "shriya", "bobyyy", "scott" };
		// invoking in array itertion
		for (String namesArray : names) {
			if (p1.test(namesArray)) {
				System.out.println(namesArray);
			}
		}
//    	   if(names.length>5) {
//    		   System.out.println(names);
//    	   } y cant we do this bcz what if we need to check 10 conditions
//    	   in that case we have to write all the condition here and it will ietarte for all the condition
//    	   instead we can wrote all multple conition in labda only and then we can invoke it one time to iterate

		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee("jamal", 20000, 5));
		empList.add(new Employee("kishore", 3000, 1));
		empList.add(new Employee("kamal", 2000, 1));
		empList.add(new Employee("jam", 14000, 3));

		Predicate<Employee> pr = emp -> (emp.salary > 5000 && emp.experience > 2);
//			System.out.println(empdetails.test(emp1));
//			System.out.println(empdetails.test(emp2));
//			System.out.println(empdetails.test(emp3));
//			System.out.println(empdetails.test(emp4));

		for (Employee obj : empList) {
			if (pr.test(obj)) {
				System.out.println(obj.name + obj.salary);
			}
		}
	}

}
