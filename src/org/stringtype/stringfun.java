package org.stringtype;

public class stringfun {
	public static void main(String[] args) {
		String s = "Welcome to java";
		System.out.println(s.length());
		boolean equs = s.equals("Welcome to java");
		System.out.println(equs);
		boolean equal = s.equalsIgnoreCase("welcome To java");
		System.out.println(equal);
		String upper = s.toUpperCase();
		System.out.println(upper);
		String lower = s.toLowerCase();
		System.out.println(lower);
		boolean start = s.startsWith("welcome");
		System.out.println(start);
		boolean ends = s.endsWith("java");
		System.out.println(ends);
		boolean con = s.contains("java");
		System.out.println(con);
		int index = s.indexOf("W");
		System.out.println(index);
		int last = s.lastIndexOf("j");
		
		System.out.println(last);
		char chars = s.charAt(1);
		System.out.println(chars);
		String replace = s.replace("java", "selinium");
		System.out.println(replace);
		String str = s.substring(10);
		System.out.println(str);
		boolean empty = s.isEmpty();
		System.out.println(empty);
		String[] split = s.split("Welcomejava");
		System.out.println(split);
		String trim = s.trim();
		System.out.println(trim);
		String concat = s.concat("surya");
		System.out.println(concat);
		
		
		
		
		
		
	}
	
}
