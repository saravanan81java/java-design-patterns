package com.design.creational.patterns;

import java.util.Date;

public class ImmutableCustomTest {

	public static void main(String[] args) {
		// Create a Person object
        Date birthDate = new Date();
        ImmutableCustomPerson person = new ImmutableCustomPerson("James", 30, birthDate);

        // Print the person details
        System.out.println(person);

        // Try to modify birthDate externally
        birthDate.setTime(0); // Modifying the original Date object

        // Check if the Person's birthDate was affected
        System.out.println(person.getBirthDate()); // This will print the original birthDate, not the modified one
	}

}
