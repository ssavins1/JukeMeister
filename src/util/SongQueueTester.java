package util;

import javafx.scene.media.MediaPlayer;
import library.Song;
import library.SongLibrary;

import org.junit.*;

import player.SongQueue;
import static org.junit.Assert.*;

/**
 * Tests the SongQueue object and its methods.
 */
public class SongQueueTester {
	/** The SongQueue we will test */
	private SongQueue queue;
	
	/** The songs used for testing */
	private Song testOne, testTwo;
	
	/**
	 * Set up example song data for testing.
	 */
	@BeforeClass
	public void setupFirst(){
		testOne = new Song("Dream Theater", "Pull Me Under", "Images And Words",
				1992, "songs\\Dream_Theater-Pull_Me_Under.mp3");
		
		testTwo = new Song("Metallica", "One", "...And Justice For All", 
				1988, "songs\\Metallica-One.mp3");
	}
	
	/**
	 * Before each test, resets the {@link SongQueue}.
	 */
	@Before
	public void setup(){
		queue = new SongQueue();
	}
	
	/**
	 * Test the method that adds a song to the end of the queue.
	 */
	@Test
	public void testAddSongToEnd(){
		queue.addSongToEndOfQueue(testOne);
		
		assertEquals(1, queue.size());
		
		queue.addSongToEndOfQueue(testTwo);
		
		assertEquals(2, queue.size());
		
		queue.addSongToEndOfQueue(null);
		
		assertEquals(2, queue.size());
	}
	
	/**
	 * Test the method that adds a song to the beginning of the queue.
	 */
	@Test
	public void testAddSongToBeginning(){
		queue.addSongToBeginningOfQueue(testOne);
		
		assertEquals(1, queue.size());
		
		queue.addSongToBeginningOfQueue(testTwo);
		
		assertEquals(2, queue.size());
		
		queue.addSongToBeginningOfQueue(null);
		
		assertEquals(2, queue.size());
	}
	
	/**
	 * Test the skip song method.
	 */
	@Test
	public void testSkip(){
		// Assume addSongToEndOfQueue() works
		
		queue.addSongToBeginningOfQueue(testOne);
		
		assertEquals(1, queue.size());
		
		queue.skip();
		
		assertTrue(queue.isEmpty());
		
		queue.skip();
		
		assertTrue(queue.isEmpty());
	}
	
	/**
	 * Test playing of the next song in the queue.
	 */
	public void testPlayPauseStop(){
		// Assume getCurrentSongStatus() works
		
		MediaPlayer.Status status = queue.getCurrentSongStatus();
		
		assertEquals(MediaPlayer.Status.READY, status);
		
		queue.addSongToBeginningOfQueue(testOne);
		queue.play();
		
		status = queue.getCurrentSongStatus();
		
		assertEquals(MediaPlayer.Status.PLAYING, status);
		
		queue.pause();
		
		status = queue.getCurrentSongStatus();
		
		assertEquals(MediaPlayer.Status.PAUSED, status);
		
		queue.play();
		queue.stop();
		
		status = queue.getCurrentSongStatus();
		
		assertEquals(MediaPlayer.Status.STOPPED, status);
	}
	
	/**
	 * Test the method that checks if the song queue is empty.
	 */
	@Test
	public void testEmpty(){
		// Assume addSongToBeginningOfQueue() works
		
		assertTrue(queue.isEmpty());
		
		queue.addSongToBeginningOfQueue(testOne);
		
		assertFalse(queue.isEmpty());
	}
}