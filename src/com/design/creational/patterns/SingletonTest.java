package com.design.creational.patterns;

public class SingletonTest {
	public static void main(String[] args) {
		// Get the singleton instance
		SingletoPattern singleton1 = SingletoPattern.getInstance();
		SingletoPattern singleton2 = SingletoPattern.getInstance();

		// Check if both instances are the same
		System.out.println(singleton1 == singleton2); // Output: true
   }

}
