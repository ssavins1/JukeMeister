package utils;

import player.SongQueue;

/**
 * Class with static operations for basic Jukebox functionality
 */
public class ApplicationSettings {
	private static SongQueue queue;
	
	public static SongQueue getQueueInstance(){
		if(queue == null) queue = new SongQueue();
		
		return queue;
	}
}
