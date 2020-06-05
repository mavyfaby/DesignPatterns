package com.mavyfaby.DesignPatterns.creational.Factory;

public class Dog implements IAnimal {
	@Override
	public void makeSound() {
		System.out.println("Woof! Woof! Woof!");
	}
}
