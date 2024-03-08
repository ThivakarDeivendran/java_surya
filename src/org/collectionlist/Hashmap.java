package org.collectionlist;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
public static void main(String[] args) {
	Map<Integer,String> h = new HashMap<Integer, String>();
	h.put(10, "java");
	h.put(20, "string");
	h.put(30, "c++");
	h.put(40, "null");
	h.put(null, "null");
	System.out.println(h);
}
}
