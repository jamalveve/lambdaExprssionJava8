package com.supplier.FI;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<Date> supp=()->new Date();
		System.out.println(supp.get());
		
		 BiSupplier<String, Integer, String> createMessage = (name, age) -> 
         "Name: " + name + ", Age: " + age;

     // Test the BiSupplier with different values
     String message1 = createMessage.get("Alice", 30);
     String message2 = createMessage.get("Bob", 25);
     String message3 = createMessage.get("Charlie", 35);

     // Print the results
     System.out.println(message1);
     System.out.println(message2);
     System.out.println(message3);
	}

}
//Example of using custom Bisupplier	
@FunctionalInterface
interface BiSupplier<T, U, R> {
    R get(T t, U u);
}

