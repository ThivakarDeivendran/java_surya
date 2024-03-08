package org.stringtype;

public class mutable {
	public static void main(String[] args) {
		StringBuffer r = new StringBuffer("devi");
		StringBuffer r1 = new StringBuffer("devi");
		System.out.println(System.identityHashCode(r));
		System.out.println(System.identityHashCode(r1));
		r.append(r1);
		System.out.println(r);
		System.out.println(System.identityHashCode(r1));
	}

}
