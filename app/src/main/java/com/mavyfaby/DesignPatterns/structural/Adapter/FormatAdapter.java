package com.mavyfaby.DesignPatterns.structural.Adapter;

public class FormatAdapter implements IMediaPlayer {
	private IMediaPackage media;
	
	public FormatAdapter(IMediaPackage m) {
		this.media = m;
	}
	
	@Override
	public void play(String filename) {
		System.out.print("Using Adpater --> ");
		
		media.playFile(filename);
	}
}
