package library;

import java.util.ArrayList;
import java.util.List;

public class SongLibrary {
	private List<Song> songs;
	
	public SongLibrary(){
		songs = new ArrayList<Song>();
	}
	
	public void addSong(Song s){
		songs.add(s);
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
