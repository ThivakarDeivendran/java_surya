package org.stringtype;

public class immutable {
public static void main(String[] args) {
	String s = "surya";
	String s1 = "surya";
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));
	String s2 = s.concat(s1);
	System.out.println(s2);
	System.out.println(System.identityHashCode(s2));
}
}
