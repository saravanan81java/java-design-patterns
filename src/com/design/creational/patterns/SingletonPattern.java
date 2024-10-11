package com.design.creational.patterns;

public class SingletonPattern {

	private static SingletonPattern instance; // Static instance variable
	
	// Private constructor to prevent instantiation
	private SingletonPattern() {
		 
	}
	
	public static SingletonPattern getInstance() {
	      if (instance == null) {
	        instance = new SingletonPattern ();
	      }
	      return instance;
	   }
}
