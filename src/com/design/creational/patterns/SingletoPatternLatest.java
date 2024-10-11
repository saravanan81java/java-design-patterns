package com.design.creational.patterns;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletoPatternLatest implements Serializable{

	private static final long serialVersionUID = 1L;
	private static SingletoPatternLatest instance; // Static instance variable
	
	// Private constructor to prevent instantiation
	private SingletoPatternLatest() {
		 
	}
	
	public static SingletoPatternLatest getInstance() {
      if (instance == null) {
        instance = new SingletoPatternLatest ();
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
