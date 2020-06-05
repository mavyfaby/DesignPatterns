package com.mavyfaby.DesignPatterns.creational.Singleton;

public class SingletonPattern {
	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();

		object.showMessage();
	}
}
