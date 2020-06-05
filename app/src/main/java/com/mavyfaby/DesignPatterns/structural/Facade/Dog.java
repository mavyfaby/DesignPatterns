package com.mavyfaby.DesignPatterns.structural.Facade;

public class Dog implements Animal {
	@Override
	public void makeSound() {
		System.out.println("Woof! Woof!");
	}
}
