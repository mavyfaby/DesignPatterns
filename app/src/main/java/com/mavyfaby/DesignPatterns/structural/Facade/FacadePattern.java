package com.mavyfaby.DesignPatterns.structural.Facade;

public class FacadePattern {
	public static void main(String[] args) {
		AnimalMaker animalMaker = new AnimalMaker();
		
		animalMaker.soundCat();
		animalMaker.soundDog();
		animalMaker.soundPig();
	}
}
