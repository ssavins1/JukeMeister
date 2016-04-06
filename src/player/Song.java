package player;

import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Song {
	private MediaPlayer player;
	
	private String artist;
	private String songName;
	
	private Image art;
	
	public Song(String filename, SongQueue parent, Image albumArt){
		// Save files as Artist-Song.mp3 so we can get Artist/Song Name
		// to display on jukebox
		int dashIndex = filename.indexOf('-');
		
		artist = filename.substring(0, dashIndex);
		songName = filename.substring(dashIndex + 1, filename.length());
		
		player = new MediaPlayer(new Media(filename));
		player.setOnEndOfMedia(parent);
		
		art = albumArt;
	}
	
	public Image getAlbumArt(){
		return art;
	}
	
	public String getArtist(){
		return artist;
	}
	
	public String getSongName(){
		return songName;
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
