package com.design.creational.patterns;

public class SingletonTestLatestSynchronized {
	public static void main(String[] args) {
		// Get the singleton instance
		SingletonPatternLatest singleton1 = SingletonPatternLatest.getInstance();

		// Show message
		singleton1.showMessage(); 
   }

}
