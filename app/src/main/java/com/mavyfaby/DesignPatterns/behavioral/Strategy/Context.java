package com.mavyfaby.DesignPatterns.behavioral.Strategy;

public class Context {
	public IStrategy strategy;
	
	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeOperation(int num1, int num2) {
		return strategy.doOperation(num1, num2);
	}
}
