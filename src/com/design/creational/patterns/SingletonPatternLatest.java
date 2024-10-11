package com.design.creational.patterns;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonPatternLatest implements Serializable{

	private static final long serialVersionUID = 1L;
	private static SingletonPatternLatest instance; // Static instance variable
	
	// Private constructor to prevent instantiation
	private SingletonPatternLatest() {
		 
	}
	
	public static SingletonPatternLatest getInstance() {
      if (instance == null) {
        instance = new SingletonPatternLatest ();
      }
      return instance;
    }
	
	protected Object readResolve() throws ObjectStreamException{
		return instance;
	}
	
	public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
