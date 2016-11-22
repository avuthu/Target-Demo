package com.tek.java8;

import java.util.ArrayList;
import java.util.List;

/*Lamda Expressions*/
/*Collections for each*/
/*Functional referencces*/
public class HelloWorld {

	interface GreetingService {
		void sayMessage(String message);
		default void print() {
			System.out.println("Inside Greeting Service interace default method");
		}
	}

	final static String salutation = "Hello! ";

	public static void main(String args[]) {
		GreetingService greetService1 = message -> System.out.println(salutation + message);
		greetService1.sayMessage("Raja Shekar");
		greetService1.print();
		
		List<String> list = new ArrayList<>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		
		list.forEach(System.out::println);
		
	}

}
