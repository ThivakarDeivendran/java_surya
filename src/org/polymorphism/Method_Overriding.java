package org.polymorphism;

public class Method_Overriding extends Method_Overloading{
	@Override
	public void emp_details() {
		super.emp_details("Employee survey");
	}
	public void emp_details(String role) {
		System.out.println("Emp role:" +role);
	}
	@Override
	public void emp_details(String i, int empid) {
		super.emp_details(i, empid);
	}
	
	public static void main(String[] args) {
		Method_Overriding b = new Method_Overriding();
		b.emp_details();
		b.emp_details("emp id+", 14828);
		b.emp_details("developer");
	}

}