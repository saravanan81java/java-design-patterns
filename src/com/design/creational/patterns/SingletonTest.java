package com.design.creational.patterns;

public class SingletonTest {
	public static void main(String[] args) {
		// Get the singleton instance
		SingletonPattern singleton1 = SingletonPattern.getInstance();
		SingletonPattern singleton2 = SingletonPattern.getInstance();

		// Check if both instances are the same
		System.out.println(singleton1 == singleton2); // Output: true
   }

}
