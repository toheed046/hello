package hello;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(getRandomNumber());
		System.out.println(Math.random() + " " + Math.random());
		
		
		System.out.println(new Hello("Hello, Everyone how are you?"));
	}
	
	private static int getRandomNumber() {
		return new Random().nextInt();
	}
	
	static {
		System.out.println("Class loader");
	}
}
