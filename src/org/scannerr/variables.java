package org.scannerr;

public class variables {
static int a = 21; //class variable
public static void add() {
   int b = 58; //local variable
   System.out.println(b);
}
public static void multi() {
System.out.println(a);
}
public static void main(String[] args) {
	add();
	multi();
}
}
