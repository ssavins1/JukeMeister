package util;

import java.util.List;

import library.Song;
import library.SongLibrary;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Tests the song library class and ensures correct functionality.
 */
public class SongLibraryTester {
	/** The song library to use for testing */
	SongLibrary lib;
	/** The songs used for testing */
	Song testOne, testTwo;
	
	/**
	 * Set up example song data for testing.
	 */
	@BeforeClass
	public void setupFirst(){
		testOne = new Song("Dream Theater", "Pull Me Under", 1992, 
				"songs\\Dream_Theater-Pull_Me_Under.mp3");
		
		testTwo = new Song("Metallica", "One", 1988, 
				"songs\\Metallica-One.mp3");
	}
	
	/**
	 * Before each test, resets the {@link SongLibrary}.
	 */
	@Before
	public void setup(){
		lib = new SongLibrary();
	}
	
	/**
	 * Test adding a song to a {@link SongLibrary}.
	 */
	@Test
	public void testAddSong(){
		lib.addSong(testOne);
		
		assertEquals(1, lib.size());
		
		lib.addSong(null);
		
		assertEquals(1, lib.size());
		
		lib.addSong(testTwo);
		
		assertEquals(2, lib.size());
	}
	
	/**
	 * Test filtering by the first letter in an artist's name.
	 */
	@Test
	public void testFilterByFirstLetterArtist(){
		lib.addSong(testOne);
		lib.addSong(testTwo);
		
		List<Song> filtered = lib.getSongArtistsBeginningWith("D");
		
		assertEquals(testOne, filtered.get(0));
		assertEquals(1, filtered.size());
		
		filtered.add(null);
		
		assertEquals(1, filtered.size());
		
		filtered = lib.getSongArtistsBeginningWith("Muse");
		
		assertEquals(0, filtered.size());
	}
	
	/**
	 * Test filtering by the first letter in a song's name.
	 */
	@Test
	public void testFilterByFirstLetterSong(){
		lib.addSong(testOne);
		lib.addSong(testTwo);
		
		List<Song> filtered = lib.getSongArtistsBeginningWith("O");
		
		assertEquals(testTwo, filtered.get(0));
		assertEquals(1, filtered.size());
		
		filtered.add(null);
		
		assertEquals(1, filtered.size());
		
		filtered = lib.getSongArtistsBeginningWith("Z");
		
		assertEquals(0, filtered.size());
	}
	
	/**
	 * Tests the method that gets the size of the song library (number of songs).
	 */
	@Test
	public void testSize(){
		assertEquals(0, lib.size());
		
		lib.addSong(null);
		
		assertEquals(0, lib.size());
		
		lib.addSong(testOne);
		
		assertEquals(1, lib.size());
		
		lib.addSong(testTwo);
		
		assertEquals(1, lib.size());
	}
}
