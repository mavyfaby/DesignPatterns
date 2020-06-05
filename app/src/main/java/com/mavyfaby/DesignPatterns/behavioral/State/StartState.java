package com.mavyfaby.DesignPatterns.behavioral.State;

public class StartState implements IState {
	public void doAction(Context context) {
		System.out.println("Player is in start state");
		
		context.setState(this);
	}
	
	public String toString() {
		return "Start State";
	}
}
