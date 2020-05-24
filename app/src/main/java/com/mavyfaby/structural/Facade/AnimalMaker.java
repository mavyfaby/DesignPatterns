package com.mavyfaby.structural.Facade;

public class AnimalMaker {
	private Animal cat;
	private Animal dog;
	private Animal pig;
	
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
