package org.collectionlist;


import java.util.Map;
import java.util.TreeMap;

public class Treemap {
public static void main(String[] args) {
	Map<Integer,String> h = new TreeMap<Integer, String>();
	h.put(10, "java");
	h.put(60, "string");
	h.put(30, "c++");
	h.put(40, "null");
	h.put(50, "null");
	System.out.println(h);
}
}
