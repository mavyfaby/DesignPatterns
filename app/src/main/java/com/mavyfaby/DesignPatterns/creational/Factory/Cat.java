package com.mavyfaby.DesignPatterns.creational.Factory;

public class Cat implements IAnimal {
	@Override
	public void makeSound() {
		System.out.println("Meow! Meow! Meow!");
	}
}
