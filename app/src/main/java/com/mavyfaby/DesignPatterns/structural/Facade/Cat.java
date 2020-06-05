package com.mavyfaby.DesignPatterns.structural.Facade;

public class Cat implements IAnimal {
	@Override
	public void makeSound() {
		System.out.println("Meow! Meow!");
	}
}
