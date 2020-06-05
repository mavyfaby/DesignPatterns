package com.mavyfaby.DesignPatterns.creational.Prototype;

public class PrototypePattern {
	public static void main(String[] args) {
		// Instantiate Pig class
		Pig pig = new Pig("Rose Mae");
		
		// Make sound method
		pig.makeSound();
		
		// Clone method
		Pig pig1 = pig.clone();
		
		// Cloned Pig Make sound method
		pig1.makeSound();
	}
}
