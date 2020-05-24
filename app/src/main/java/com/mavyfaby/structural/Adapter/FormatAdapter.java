package com.mavyfaby.structural.Adapter;

public class FormatAdapter implements MediaPlayer {
	private MediaPackage media;
	
	public FormatAdapter(MediaPackage m) {
		this.media = m;
	}
	
	@Override
	public void play(String filename) {
		System.out.print("Using Adpater --> ");
		
		media.playFile(filename);
	}
}
