package hello;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(getRandomNumber());
		System.out.println(Math.random() + " " + Math.random());
	}
	
	private static int getRandomNumber() {
		return new Random().nextInt();
	}
}
