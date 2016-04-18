package utils;

import library.SongLibrary;
import player.SongQueue;

/**
 * Class with static operations for basic Jukebox functionality
 */
public class ApplicationSettings {
	private static SongQueue queue;
	private static SongLibrary library;
	
	public static SongQueue getQueueInstance(){
		if(queue == null) queue = new SongQueue();
		
		return queue;
	}
	
	public static SongLibrary getLibraryInstance(){
		if(library == null) library = new SongLibrary();
		
		return library;
	}
}
