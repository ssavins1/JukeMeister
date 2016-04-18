package player;

import java.util.ArrayDeque;
import java.util.Deque;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import library.Song;

public class SongQueue implements Runnable {
	private Deque<Song> queue;
	
	private MediaPlayer current;
	private boolean paused;
	
	public SongQueue(){
		queue = new ArrayDeque<Song>();
	}
	
	public void addSongToEndOfQueue(Song s){
		queue.addLast(s);
	}
	
	public void addSongToBeginningOfQueue(Song s){
		queue.addFirst(s);
	}
	
	private void playNextSong(){
		current = new MediaPlayer(
				new Media(queue.removeFirst().getFilename()));
		
		// TODO access MainMenu and modify now playing
		// mainMenu.setCurrentSong(current);
		
		play();
	}
	
	public void skip(){
		stop();
		
		playNextSong();
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
	
	public boolean isEmpty(){
		return queue.isEmpty();
	}
	
	public boolean isPaused(){
		return paused;
	}
	
	public boolean togglePaused(){
		if(paused == false){
			pause();
			paused = true;
		} else {
			play();
			paused = false;
		}
		
		return paused;
	}
	
	public void stopPlaying(){
		stop();
		paused = true;
	}

	@Override
	public void run() {
		if (!paused) playNextSong();
	}
}
