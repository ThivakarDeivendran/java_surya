package org.collectionlist;


import java.util.Hashtable;
import java.util.Map;

public class hashtable {
	public static void main(String[] args) {
		Map<Integer,String> h = new Hashtable<Integer, String>();
		h.put(10, "java");
		h.put(20, "string");
		h.put(30, "c++");
		h.put(40, "javaa");
		h.put(50, "null");
		System.out.println(h);
	}

}
