package player;

import java.util.ArrayDeque;
import java.util.Deque;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import library.Song;

/**
 * An ordered collection of songs that are to be played by the jukebox.
 */
public class SongQueue implements Runnable {
	/** The songs in the queue */
	private Deque<Song> queue;
	
	/** The song currently being played */
	private MediaPlayer current;
	
	/**
	 * Creates a new SongQueue and initializes fields.
	 */
	public SongQueue(){
		queue = new ArrayDeque<Song>();
		current = null;
	}
	
	/**
	 * Add a song to the end of the list of songs to play.
	 * 
	 * @param s the song to add
	 */
	public void addSongToEndOfQueue(Song s){
		if(s != null) queue.addLast(s);
	}
	
	/**
	 * Add a song to the beginning of the list of songs to play.
	 * 
	 * @param s the song to add
	 */
	public void addSongToBeginningOfQueue(Song s){
		if(s != null) queue.addFirst(s);
	}
	
	/**
	 * Moves to the next song and starts playing it.
	 */
	private void playNextSong(){
		current = new MediaPlayer(
				new Media(queue.removeFirst().getFilename()));
		
		// TODO access MainMenu and modify now playing
		// mainMenu.setCurrentSong(current);
		
		play();
	}
	
	/**
	 * Skips the currently playing song and starts playing the next song.
	 */
	public void skip(){
		stop();
		
		if(!queue.isEmpty()) playNextSong();
	}
	
	/**
	 * Plays the current song.
	 */
	public void play(){
		current.play();
	}
	
	/**
	 * Pauses the currently playing song.
	 */
	public void pause(){
		current.pause();
	}
	
	/**
	 * Stops the currently playing song.
	 */
	public void stop(){
		current.stop();
	}
	
	/**
	 * Gets the playing status of the current song.
	 * 
	 * @return the status of the current song
	 */
	public MediaPlayer.Status getCurrentSongStatus(){
		return current.getStatus();
	}
	
	/**
	 * Checks if any songs are in the queue.
	 * 
	 * @return true if no songs are in the queue
	 */
	public boolean isEmpty(){
		return queue.isEmpty();
	}

	/**
	 * Called when this class is used as a runnable, plays the next song in the queue.
	 */
	@Override
	public void run() {
		playNextSong();
	}
	
	/**
	 * Gets how many songs are in the queue.
	 * 
	 * @return how many songs are in the queue
	 */
	public int size() {
		return queue.size();
	}
}
