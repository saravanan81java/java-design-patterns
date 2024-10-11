package com.design.creational.patterns;

public class SingletoPattern {

	private static SingletoPattern instance; // Static instance variable
	
	// Private constructor to prevent instantiation
	private SingletoPattern() {
		 
	}
	
	public static SingletoPattern getInstance() {
	      if (instance == null) {
	        instance = new SingletoPattern ();
	      }
	      return instance;
	   }
}
