package com.Java8.java8_feautures;

public class App {
	public static void main(String[] args) {
		System.out.println("calling cab");
//    Ola ola=new Ola();
//    ola.bookCab();
//    
//    CabExample olacab=new Ola();
//    olacab.bookCab();
//    

//    
		CabExample cab = () -> System.out.println("ola cab is booked");
		cab.bookCab();

//    Uber uber=new Uber();
//    uber.bookCabs("hostel", "shoppingmall");
//    
		CabExample2 cab2 = (source, destination) -> System.out
				.println("booking cab from " + source + " to " + destination);
		cab2.bookCabs("hostel", "shoppingmall");

		CabExample3 cab3 = (source, destination) -> {
			System.out.println("booking cab from " + source + " to " + destination);
			return "45 rupees";
		};
		cab3.bookingCabs("hyd", "somewere");
		System.out.println(cab3.bookingCabs("hyd", "somewere"));
	}
}
