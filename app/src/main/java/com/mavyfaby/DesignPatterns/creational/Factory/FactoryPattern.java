package com.mavyfaby.DesignPatterns.creational.Factory;

public class FactoryPattern {
	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();
		
		IAnimal a1 = animalFactory.getAnimal("Cat");
		IAnimal a2 = animalFactory.getAnimal("Dog");
		
		a1.makeSound();
		a2.makeSound();
	}
}
