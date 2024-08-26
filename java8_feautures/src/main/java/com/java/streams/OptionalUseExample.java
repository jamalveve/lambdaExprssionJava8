package com.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalUseExample {
public static void main(String[] args) throws IllegalAccessException {
	List<ProductClass> ProductClassList = new ArrayList<>();

	// Add ProductClass objects to the list
	ProductClassList.add(new ProductClass("Laptop", 999.99, 10));
	ProductClassList.add(new ProductClass("Smartphone", 699.99, 25));
	ProductClassList.add(new ProductClass("Headphones", 199.99, 15));
	ProductClassList.add(new ProductClass("Keyboard", 49.99, 30));
	ProductClassList.add(new ProductClass("Mouse", 29.99, 50));

	Optional<Object> emptyObject=Optional.empty();
	System.out.println(emptyObject);
	
	ProductClass prod1=new ProductClass("Laptop", 999.99, 10);
	ProductClass prod2=new ProductClass(null, 699.99, 25);

//	Optional<String> names=Optional.of(prod2.name);
//	System.out.println(names);//it will give nll pointerexcepion
	
	Optional<String> names1=Optional.ofNullable(prod2.name);
	System.out.println(names1);//it will  not  give null pointerexcepion
	
	if(names1.isPresent()) {
		System.out.println(names1.get());//it will  not  give null pointerexcepion
//this if statement wont execute 
	}
	
//	okay if null we nee to return some diff value
	System.out.println(names1.orElse("default value"));
//	System.out.println(names1.orElseThrow(()->new IllegalAccessException()));
	Optional<String> names2=Optional.ofNullable(prod1.name);

	System.out.println(names2.map(str->str.toUpperCase()));


	
	
	
//	Optional<Object> namesofProduct=ProductClassList.stream().filter(str->str.name.contains("mobile")).forEach(res->System.out.println(res));		

}
}
