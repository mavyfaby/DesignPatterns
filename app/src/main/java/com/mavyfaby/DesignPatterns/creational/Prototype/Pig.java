package com.mavyfaby.DesignPatterns.creational.Prototype;

public class Pig {
	private String name = null;
	
	public Pig(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Pig clone() {
		return new Pig(this.name);
	}
	
	public void makeSound() {
		System.out.println(name + ": Oink! Oink!");
	}
}
