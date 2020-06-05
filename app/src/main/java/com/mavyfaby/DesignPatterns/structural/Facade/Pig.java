package com.mavyfaby.DesignPatterns.structural.Facade;

public class Pig implements IAnimal {
	@Override
	public void makeSound() {
		System.out.println("Oink! Oink!");
	}
}
