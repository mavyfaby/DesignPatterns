package com.mavyfaby.DesignPatterns.structural.Adapter;

public class VLC implements IMediaPackage {
	@Override
	public void playFile(String filename) {
		System.out.println("Playing VLC File: " + filename);
	}
}
