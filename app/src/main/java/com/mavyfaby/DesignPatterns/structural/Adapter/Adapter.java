package com.mavyfaby.DesignPatterns.structural.Adapter;

public class Adapter {
	public static void main(String[] args) {
		MediaPlayer player = new MP3();

		player.play("Faded.mp3");

		player = new FormatAdapter(new MP4());

		player.play("The Flash.mp4");

		player = new FormatAdapter(new VLC());

		player.play("Interstellar.avi");
	}
}
