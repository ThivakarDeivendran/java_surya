package org.polymorphism;

public class Method_Overloading {
	
public void emp_details() {
System.out.println("Employee survey");
}
public void emp_details(String name) {
System.out.println("Employee name:" +name);
}
public void emp_details1(String i, int empid) {
System.out.println(i + empid);
}
public void emp_details2(String a, int age) {
System.out.println(a + age);
}
public void emp_details(String m, int mblno) {
System.out.println(m + mblno);
}
public static void main(String[] args) {
	Method_Overloading a = new Method_Overloading();
	a.emp_details();
	a.emp_details("surya");
	a.emp_details1("Emp id:", 14828);
	a.emp_details1("Emp age:", 20);
	a.emp_details1("Emp mblno:", 93247);
}
	
}