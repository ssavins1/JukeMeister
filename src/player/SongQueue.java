package player;

import java.util.Stack;

import utils.ApplicationSettings;

public class SongQueue implements Runnable {
	private Stack<Song> queue;
	
	private Song current;
	
	public SongQueue(){
		queue = new Stack<Song>();
	}
	
	public void addSong(Song s){
		queue.add(s);
	}
	
	private void playNextSong(){
		current = queue.pop();
		
		play();
	}
	
	public void play(){
		current.play();
	}
	
	public void pause(){
		current.pause();
	}
	
	public void stop(){
		current.stop();
	}

	@Override
	public void run() {
		if(!ApplicationSettings.paused) playNextSong();
	}
}
