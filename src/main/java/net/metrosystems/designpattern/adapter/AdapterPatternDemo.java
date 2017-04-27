package net.metrosystems.designpattern.adapter;

public class AdapterPatternDemo {
	public static void main(String[] args){
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "horizon.mp3");
		audioPlayer.play("mp33", "lala.mp3");
	}
}
