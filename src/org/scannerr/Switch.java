package org.scannerr;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("Enter the details");
			int college = sc.nextInt();
			switch (college) {
			case 1:
				System.out.println("BCA");
				break;
			case 2:
				System.out.println("MBA");
				break;
			case 3:
				System.out.println("Bcom");
				break;
				default:
					System.out.println("not in the department");
			}
		}
	}
}
