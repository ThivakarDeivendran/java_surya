package org.scannerr;

public class thiss1 extends thiss{ //class refrence
	int b = 20;
	public void num() {
		int c = 30;
		System.out.println(c);
		System.out.println(this.b);
		System.out.println(super.a);
		

	}
	public static void main(String[] args) {
		thiss1 t = new thiss1();
		t.num();
	}

}
