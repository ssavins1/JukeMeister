package utils;

import player.SongQueue;

public class ApplicationSettings {
	private SongQueue queue;
	
	public static boolean paused = true;
	
	public SongQueue getQueueInstance(){
		if(queue == null) queue = new SongQueue();
		
		return queue;
	}
	
	public boolean togglePaused(){
		if(paused == false){
			queue.pause();
			paused = true;
		} else {
			queue.play();
			paused = false;
		}
		
		return paused;
	}
	
	public void stopPlaying(){
		queue.stop();
		paused = true;
	}
}
