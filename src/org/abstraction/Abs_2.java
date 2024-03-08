package org.abstraction;

public class Abs_2 extends Abs_1{
	@Override
	public void statement() {
System.out.println("Last 3 month statement");		
	}
	@Override
	public void carloan() {
System.out.println("20 lac");		
	}
	public static void main(String[] args) {
		Abs_2 c = new Abs_2();
		c.bank();
		c.statement();
		c.carloan();
	
	}
}
