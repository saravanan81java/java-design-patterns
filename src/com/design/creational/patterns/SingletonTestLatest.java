package com.design.creational.patterns;

public class SingletonTestLatest {
	public static void main(String[] args) {
		// Get the singleton instance
		SingletonPatternLatestSynchronized singleton1 = SingletonPatternLatestSynchronized.getInstance();

		// Show message
		singleton1.showMessage(); 
   }

}
