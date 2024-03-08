package org.collectionlist;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
public static void main(String[] args) {
	Set <Integer> se = new HashSet <Integer>();
	se.add(10);
	se.add(20);
	se.add(30);
	se.add(40);
	se.add(50);
	se.add(50);
	System.out.println(se);
}
}