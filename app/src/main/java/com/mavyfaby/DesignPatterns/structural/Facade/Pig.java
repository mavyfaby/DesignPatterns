package com.mavyfaby.DesignPatterns.structural.Facade;

public class Pig implements Animal {
	@Override
	public void makeSound() {
		System.out.println("Oink! Oink!");
	}
}
