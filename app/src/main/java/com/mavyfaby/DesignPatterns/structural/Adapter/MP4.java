package com.mavyfaby.DesignPatterns.structural.Adapter;

public class MP4 implements IMediaPackage {
	@Override
	public void playFile(String filename) {
		System.out.println("Playing MP4 File: " + filename);
	}
}
