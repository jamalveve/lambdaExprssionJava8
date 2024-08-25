package com.Consumer.FI;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.function.FI.StudentsExample;

public class ExampleConsumer {

	public static void main(String[] args) {

		Consumer<String> consume=someInput->System.out.println(someInput);
		consume.accept("hello");
		
		Consumer<String> consume1=someInput->System.out.println(someInput+"are playing");
		Consumer<String> consume2=someInput->System.out.println(someInput+"are studying");
		Consumer<String> consume3=someInput->System.out.println(someInput+"are cooking");

		consume1.accept("kids");
		consume2.accept("students");
		consume3.accept("parents");
		
		//chaining
		System.out.println("chaining");
		consume1.andThen(consume2).andThen(consume3).accept("everyone");

//		or
		Consumer<String>consume4=consume1.andThen(consume2).andThen(consume3);
		consume4.accept("people");


		
//		obje example
		Set<StudentDetails> studentsSet = new HashSet<>();
		studentsSet.add(new StudentDetails("abi", 123, 80.40));
		studentsSet.add(new StudentDetails("priya", 343, 60.02));
		studentsSet.add(new StudentDetails("venkat", 987, 25));
		studentsSet.add(new StudentDetails("vasu", 234, 96.5));
		studentsSet.add(new StudentDetails("keelu", 999, 69));
//		function:
		Function<StudentDetails, String> f4 = studentlist -> {
			double marks = studentlist.percentage;
			if (marks > 80)
				return "more than 80%";
			else if (marks > 40)
				return "more than 30%";
			else
				return "just 10 %";

 		};
///      predicate :
		Predicate<StudentDetails> p1 = stud -> (stud.percentage > 35);

//		consumer
		Consumer<StudentDetails> cons=stud->{
			
			System.out.println("The student named "+stud.studentName);
			System.out.println(" of this "+stud.rollnumber);
			System.out.println(" got "+stud.percentage);

		};
		for (StudentDetails stud : studentsSet) {
			if (p1.test(stud)) {
				String percent = f4.apply(stud);
//				System.out.println("the student named " + stud.studentName + " of roll number " + stud.rollnumber
//						+ " scored " + percent);
				cons.accept(stud);
				System.out.println(percent);
			}else {
				System.out.println("the student named " + stud.studentName + " of roll number " + stud.rollnumber
						+ " failed");
			}
		}

	}

}
