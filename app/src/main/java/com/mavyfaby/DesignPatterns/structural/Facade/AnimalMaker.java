package com.mavyfaby.DesignPatterns.structural.Facade;

public class AnimalMaker {
	private IAnimal cat;
	private IAnimal dog;
	private IAnimal pig;
	
	public AnimalMaker() {
		this.cat = new Cat();
		this.dog = new Dog();
		this.pig = new Pig();
	}
	
	public void soundCat() {
		cat.makeSound();
	}
	
	public void soundDog() {
		dog.makeSound();
	}
	
	public void soundPig() {
		pig.makeSound();
	}
}
