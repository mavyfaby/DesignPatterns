package com.mavyfaby.DesignPatterns.creational.Factory;

public class Horse implements Animal {
	@Override
	public void makeSound() {
		System.out.println("Neigh! Neigh! Neigh!");
	}
}
