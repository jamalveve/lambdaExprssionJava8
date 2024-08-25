package com.predicate.FI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class DemocClassForObj {
	//emp obj->return the name of the employee whose salary more that 5 k and xperience is 2 or more than
	public static void main(String[] args) {
		Employee emp1 = new Employee("jamal", 1000000000, 5);
//		Employee emp2 = new Employee("jam", 1400000, 3);
//		Employee emp3 = new Employee("kamal", 60000, 1);
//		Employee emp4 = new Employee("kishore", 500000, 1);
		
		ArrayList<Employee> empList=new ArrayList<>();
		empList.add(new Employee("jamal", 1000000000, 5));
		empList.add(new Employee("kishore", 500000, 1));
		empList.add( new Employee("kamal", 60000, 1));
		empList.add(new Employee("jam", 1400000, 3));

		
		

		Predicate<Employee> pr=emp->(emp.salary >500000 && emp.experience>2);
			System.out.println(pr.test(emp1));
//			System.out.println(empdetails.test(emp2));
//			System.out.println(empdetails.test(emp3));
//			System.out.println(empdetails.test(emp4));

			
		
//			for(Employee obj:empList){
//				if(pr.test(obj)) {
//					System.out.println(obj.name+obj.salary);
//				} 
//			}
//			
			Iterator<Employee>itr=empList.iterator();
			while(itr.hasNext()) {
				if(pr.test(emp1)) {
					System.out.println(emp1.name);
				}
			}
	}

}

class Employee {
	String name;
	int salary;
	int experience;

	Employee(String ename, int sal, int exp) {
		ename = name;
		sal = salary;
		exp = experience;

	}
}