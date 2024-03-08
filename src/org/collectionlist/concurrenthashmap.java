package org.collectionlist;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class concurrenthashmap {
public static void main(String[] args) {
	Map<Integer,String> h = new ConcurrentHashMap<Integer, String>();
	h.put(10, "java");
	h.put(20, "string");
	h.put(30, "c++");
	h.put(40, "null");
	h.put(70, "null");
	System.out.println(h);
}
}
