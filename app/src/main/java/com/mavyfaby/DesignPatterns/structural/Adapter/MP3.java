package com.mavyfaby.DesignPatterns.structural.Adapter;

public class MP3 implements IMediaPlayer {
	@Override
	public void play(String filename) {
		System.out.println("Playing MP3 File: " + filename);
	}
}
