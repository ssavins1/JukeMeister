package library;

import java.util.ArrayList;
import java.util.List;

/**
 * Stores information on every song in the jukebox's library.
 */
public class SongLibrary {
	/** The songs contained in the library */
	private List<Song> songs;
	
	/**
	 * Creates a new, empty library.
	 */
	public SongLibrary(){
		songs = new ArrayList<Song>();
	}
	
	/**
	 * Adds a song to the library.
	 * 
	 * @param s the song to add
	 */
	public void addSong(Song s){
		if(s != null) songs.add(s);
	}
	
	/**
	 * Get all songs beginning with a certain letter or string.
	 * 
	 * @param str the string that the song name should begin with
	 * @return a list of songs beginning with the specified string
	 */
	public List<Song> getSongNamesBeginningWith(String str){
		List<Song> result = new ArrayList<Song>();
		
		if(str == null) return result;
		
		for(Song s : songs)
			if(s.getName().startsWith(str)) result.add(s);
		
		return result;
	}
	
	/**
	 * Get the songs in this library with an artist whose name begins
	 * with a certain string.
	 * 
	 * @param s the string that the artist's name should start with
	 * @return the artists whose name begins with s
	 */
	public List<Song> getSongArtistsBeginningWith(String str){
		List<Song> result = new ArrayList<Song>();
		
		if(str == null) return result;
		
		for(Song s : songs)
			if(s.getArtist().startsWith(str)) result.add(s);
		
		return result;
	}
	
	/**
	 * Returns how many songs are in the library.
	 * 
	 * @return the number of songs in this library
	 */
	public int size(){
		return songs.size();
	}
}
