package com.mavyfaby.creational.Factory;

public class Factory {
	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();
		
		Animal a1 = animalFactory.getAnimal("Cat");
		Animal a2 = animalFactory.getAnimal("Dog");
		
		a1.makeSound();
		a2.makeSound();
	}
}