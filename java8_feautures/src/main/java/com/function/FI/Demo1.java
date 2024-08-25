package com.function.FI;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo1 {

	public static void main(String[] args) {

		Function<Integer, Integer> f1 = num -> num + num;

		System.out.println(f1.apply(10));
		System.out.println(f1.apply(100));

		Function<String, String> f2 = str -> str.concat("hello");

		System.out.println(f2.apply("jamal "));
		System.out.println(f2.apply("kamal "));

		Function<String, Integer> f3 = str -> str.length();
		System.out.println(f3.apply("jamal "));
		System.out.println(f3.apply("kamalii "));

		String[] arraystr = { "helooo", "camyy", "keela", "kiran" };
		for (String str : arraystr) {
			if (str.contains("e")) {
				System.out.println(f3.apply(str));
				System.out.println(str);
			}
		}
		Function<StudentsExample, String> f4 = studentlist -> {
			double marks = studentlist.percentage;
			if (marks > 80)
				return "more than 80%";
			else if (marks > 40)
				return "more than 30%";
			else
				return "just 10 %";

		};

		Set<StudentsExample> studentsSet = new HashSet<>();
		studentsSet.add(new StudentsExample("abi", 123, 80.40));
		studentsSet.add(new StudentsExample("priya", 343, 60.02));
		studentsSet.add(new StudentsExample("venkat", 987, 25));
		studentsSet.add(new StudentsExample("vasu", 234, 96.5));
		studentsSet.add(new StudentsExample("keelu", 999, 69));
//involve prdicate also
		Predicate<StudentsExample> p1 = stud -> (stud.percentage > 35);

		for (StudentsExample stud : studentsSet) {
			if (p1.test(stud)) {
				String percent = f4.apply(stud);
				System.out.println("the student named " + stud.studentName + " of roll number " + stud.rollnumber
						+ " scored " + percent);
			}else {
				System.out.println("the student named " + stud.studentName + " of roll number " + stud.rollnumber
						+ " failed");
			}
		}

	}

}
