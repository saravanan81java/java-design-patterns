package com.design.creational.patterns;

import java.util.Date;

public class ImmutableCustomPerson {
	
	// Step 2: Make all fields private and final
    private final String name;
    private final int age;
    private final Date birthDate;

    // Step 4: Initialize all fields via the constructor
    public ImmutableCustomPerson(String name, int age, Date birthDate) {
        this.name = name;
        this.age = age;
        // Step 5: Return a defensive copy of the mutable object (Date)
        this.birthDate = new Date(birthDate.getTime());
    }

    // Step 3: Provide only getter methods, no setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Return a defensive copy of the mutable Date object
    public Date getBirthDate() {
        return new Date(birthDate.getTime());
    }

    // Optional: Override toString(), equals(), and hashCode() methods for better representation
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", birthDate=" + birthDate + '}';
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + birthDate.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ImmutableCustomPerson person = (ImmutableCustomPerson) obj;
        return age == person.age &&
               name.equals(person.name) &&
               birthDate.equals(person.birthDate);
    }

}
