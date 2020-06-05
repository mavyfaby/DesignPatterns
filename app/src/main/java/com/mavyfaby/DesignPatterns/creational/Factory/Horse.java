package com.mavyfaby.DesignPatterns.creational.Factory;

public class Horse implements IAnimal {
	@Override
	public void makeSound() {
		System.out.println("Neigh! Neigh! Neigh!");
	}
}
