package com.mavyfaby.structural.Facade;

public class Facade {
	public static void main(String[] args) {
		AnimalMaker animalMaker = new AnimalMaker();
		
		animalMaker.soundCat();
		animalMaker.soundDog();
		animalMaker.soundPig();
	}
}
