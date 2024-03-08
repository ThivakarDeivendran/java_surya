package org.collectionlist;

import java.util.ArrayList;
import java.util.List;

public class get {
	public static void main(String[] args) {
		List<Integer> g = new ArrayList<Integer>();
		g.add(10);
		g.add(20);
		g.add(30);
		g.add(40);
		g.add(50);
		int i = g.get(2);
		System.out.println(i);
	}

}
