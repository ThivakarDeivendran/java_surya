package org.Interface;

public class childcls implements parentcls1, parentcls2{

	@Override
	public void person1() {
    System.out.println("dell");		
	}

	@Override
	public void person2() {
    System.out.println("hp");		
	}
	private void person3() {
	System.out.println("lenovo");
	}
	private void person4() {
    System.out.println("apple");
	}
	public static void main(String[] args) {
		childcls i = new childcls();
		i.person1();
		i.person2();
		i.person3();
		i.person4();
	}

	
	
}
