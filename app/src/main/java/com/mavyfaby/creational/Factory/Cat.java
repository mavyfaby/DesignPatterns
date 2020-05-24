package com.mavyfaby.creational.Factory;

public class Cat implements Animal {
	@Override
	public void makeSound() {
		System.out.println("Meow! Meow! Meow!");
	}
}
