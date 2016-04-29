package util;

import library.SongLibrary;
import player.SongQueue;

/**
 * Class with static operations for basic Jukebox functionality.
 */
public class ApplicationSettings {
	/** The queue of songs waiting to be played */
	private static SongQueue queue;
	/** The library of all songs in the jukebox */
	private static SongLibrary library;
	
	/**
	 * Get the queue that songs to be played are stored in.
	 * 
	 * @return the queue that songs to be played are stored in
	 */
	public static SongQueue getQueueInstance(){
		if(queue == null) queue = new SongQueue();
		
		return queue;
	}
	
	/**
	 * Get the song library that stores all songs in the jukebox
	 * 
	 * @return the library of all songs in the jukebox
	 */
	public static SongLibrary getLibraryInstance(){
		if(library == null) library = new SongLibrary();
		
		return library;
	}
}
