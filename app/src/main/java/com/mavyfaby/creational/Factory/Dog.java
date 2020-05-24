package com.mavyfaby.creational.Factory;

public class Dog implements Animal {
	@Override
	public void makeSound() {
		System.out.println("Woof! Woof! Woof!");
	}
}
