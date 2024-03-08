package org.exception;

public class Exception_handling {
public static void main(String[] args) {
	System.out.println("start");
	System.out.println("1");
	System.out.println("2");
	System.out.println("3");
	System.out.println("4");
	try {
		System.out.println(10/0);
	}
	catch(ArithmeticException s) {
		System.out.println("Not possiblee 10/0");
	}
	
	System.out.println("5");
	

	
}
}
