package org.collectionlist;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {
	public static void main(String[] args) {
		Set <Integer> a = new LinkedHashSet <Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(50);
		System.out.println(a);
	}

}
