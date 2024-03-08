package org.scannerr;

import java.util.Scanner;

public class Scanner_demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name");
		String s= sc.nextLine();
		System.out.println(s);
		
		System.out.println("Names");
		String s1= sc.next();
		System.out.println(s1);
		
		System.out.println("charat");
		char c= sc.next().charAt(3);
		System.out.println(c);
		
		System.out.println("number");
		int i= sc.nextInt();
		System.out.println(i);
		
		System.out.println("numbers");
		float f= sc.nextFloat();
		System.out.println(f);
		
		
	}

}
