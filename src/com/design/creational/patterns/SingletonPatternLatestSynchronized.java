package com.design.creational.patterns;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonPatternLatestSynchronized implements Serializable{

	private static final long serialVersionUID = 1L;
	private static SingletonPatternLatestSynchronized instance; // Static instance variable
	
	// Private constructor to prevent instantiation
	private SingletonPatternLatestSynchronized() {
		 
	}
	
	public static SingletonPatternLatestSynchronized getInstance() {
      if (instance == null) {
    	  synchronized (SingletonPatternLatestSynchronized.class) {
    		  instance = new SingletonPatternLatestSynchronized ();
		}
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
