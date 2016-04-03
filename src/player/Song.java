package player;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Song {
	private MediaPlayer player;
	
	public Song(String filename, SongQueue parent){
		player = new MediaPlayer(new Media(filename));
		player.setOnEndOfMedia(parent);
	}
	
	public void play(){
		player.play();
	}
	
	public void pause(){
		player.pause();
	}
	
	public void stop(){
		player.stop();
	}
}
