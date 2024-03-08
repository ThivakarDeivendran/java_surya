package org.constructor;

public class Message {
	public Message() {
System.out.println("surya");	
}
	public Message(String name) {
		System.out.println("Message:"+name);
	}
	public static void main(String[] args) {
		Message b = new Message();
		Message b1 = new Message("Hai");
		}

}

