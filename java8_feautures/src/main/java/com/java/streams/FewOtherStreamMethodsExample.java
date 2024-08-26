package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FewOtherStreamMethodsExample {
//   sorted
//	anyMatch
//  almatch
//	noneMatch
//	findAny
//	findFirst
//	findLast
//	concatmultiple streams
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(27,2,89,4,56,13,90));
//		for(Integer nums:numbers) {
//			Collections.sort(nums);
//		}
		List<Integer> sortedList = new ArrayList<>();
		sortedList=numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		System.out.println("printing it in reverse order: ");
		System.out.println("**********************************");

		numbers.stream().sorted(Comparator.reverseOrder()).forEach(res->System.out.println(res));

		LinkedList<String> names = new LinkedList<>();

		// Add names to the LinkedList
		names.add("Charlie Brown");
		names.add("Eva Davis");
		names.add("Bob Smith");
		names.add("Eva Davis");
		names.add("David Williams");
		names.add("Bob Smith");
		names.add("Alice Johnson");
		System.out.println("printing strings in ascending order: ");
		System.out.println("***************************************");

		names.stream().sorted().forEach(res->System.out.println(res));
		System.out.println("printing it in reverse order: ");
		System.out.println("*******************************");

		names.stream().sorted(Comparator.reverseOrder()).forEach(res->System.out.println(res));


		
		boolean resultforAnyMatch=names.stream().anyMatch(val->{
			return val.startsWith("hari");
		
		});
		System.out.println(resultforAnyMatch);
		
		boolean resultforAllMatch=names.stream().allMatch(val->{
			return val.startsWith("hari");
		
		});
		System.out.println(resultforAllMatch);
		
		boolean resultforNoneMatch=names.stream().noneMatch(val->{
			return val.startsWith("Eva");
		
		});
		//if nothging no such element exceptin will come for below methods
		System.out.println(resultforNoneMatch);
		System.out.println("find any from string: ");
		System.out.println("************************");
		Optional<String> ele=names.stream().findAny();
		System.out.println(ele.get());
		
		System.out.println("find First from string: ");
		System.out.println("************************");
		Optional<String> elem=names.stream().findFirst().map(str->str+"jam");
		System.out.println(elem.get());
//		
//		Optional<String> element=names.stream().findFirst().filter(str->str.contains("z")).map(str->str+"jam");
//		System.out.println(element.get());
//		how to handle the above method
		
		//there is no find last method
		
		
		List<String> namesnew = Arrays.asList("Alice", null, "Bob", "Charlie", null, "David");
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);

		Stream <String> stream1=names.stream();
		Stream <String> stream2=namesnew.stream();
		Stream <Integer> stream3=numbers1.stream();
		
		List <String> concatnames=Stream.concat(stream1,stream2).collect(Collectors.toList());		
	System.out.println(concatnames);
//	npt possible
//	List <String> concatnamesandNums=Stream.concat(stream1,stream3).collect(Collectors.toList());		
//	System.out.println(concatnamesandNums);
//	
//    Stream<Integer> stream3 = Stream.of(1, 2, 3);

//	 Stream<String> stringStreamFromNumbers = stream3.map(String::valueOf);

     // Concatenate both streams
     List<String> concatNamesAndNums = Stream.concat(stream1, numbers1.stream().map(String::valueOf))
                                            .collect(Collectors.toList());

     // Print the result
     System.out.println(concatNamesAndNums);
//		Stream.concat(stream1,stream3).forEach(res->System.out.println(res));		

		

	}

}
