package org.collectionlist;


import java.util.LinkedHashMap;
import java.util.Map;

public class newhashmap {
public static void main(String[] args) {
	Map<Integer,String> h = new LinkedHashMap<Integer, String>();
	h.put(10, "java");
	h.put(20, "string");
	h.put(50, "c++");
	h.put(40, "null");
	h.put(null, "null");
	System.out.println(h);
}
}
