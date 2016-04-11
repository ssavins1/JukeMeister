package library;

import java.util.ArrayList;
import java.util.List;

public class SongLibrary {
	private List<Song> songs;
	
	public SongLibrary(){
		songs = new ArrayList<Song>();
	}
	
	public void addSong(String filename){
		// Save files as Artist-Song.mp3 so we can get Artist/Song Name
		// to display on jukebox
		int dashIndex = filename.indexOf('-');
				
		String artist = filename.substring(0, dashIndex);
		String name = filename.substring(dashIndex + 1, filename.length());
		
		songs.add(new Song(artist, name));
	}
	
	public List<Song> getSongNamesBeginningWith(char c){
		List<Song> result = new ArrayList<Song>();
		
		for(Song s : songs){
			if(s.getName().startsWith(c + "")) result.add(s);
		}
		
		return result;
	}
	
	public List<Song> getSongArtistsBeginningWith(char c){
		List<Song> result = new ArrayList<Song>();
		
		for(Song s : songs)
			if(s.getArtist().startsWith(c + "")) result.add(s);
		
		return result;
	}
}
