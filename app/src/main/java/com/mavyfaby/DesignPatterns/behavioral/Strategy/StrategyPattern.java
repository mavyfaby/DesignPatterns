package com.mavyfaby.DesignPatterns.behavioral.Strategy;

public class StrategyPattern {
	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		
		System.out.println("Add: " + context.executeOperation(15, 10));
		
		context = new Context(new OperationSubtract());
		
		System.out.println("Subtract: " + context.executeOperation(15, 10));
		
		context = new Context(new OperationMultiply());
		
		System.out.println("Multiply: " + context.executeOperation(15, 10));
	}
}
