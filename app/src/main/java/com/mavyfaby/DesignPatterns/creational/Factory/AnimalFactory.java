package com.mavyfaby.DesignPatterns.creational.Factory;

public class AnimalFactory {
	public Animal getAnimal(String animal) {
		if (animal == null) {
			return null;
		}
		
		if (animal.equalsIgnoreCase("CAT")) {
			return new Cat();
		}
			else if (animal.equalsIgnoreCase("DOG")) {
				return new Dog();
			}
			
			else if (animal.equalsIgnoreCase("HORSE")) {
				return new Horse();
			}
			
		return null;
	}
}