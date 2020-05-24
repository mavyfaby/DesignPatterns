package com.mavyfaby.creational.Singleton;

public class Singleton {
	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		
		object.showMessage();
	}
}
