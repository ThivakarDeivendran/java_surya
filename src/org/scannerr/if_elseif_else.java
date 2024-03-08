package org.scannerr;

public class if_elseif_else {
	public static void main(String[] args) {
		int age=35;
		if(age<=18) {
			System.out.println("kids");
		}
		else if(age>18 && age<=35) {
			System.out.println("Adults");
		}
		else {
			System.out.println("legends");
		}
	}

}
