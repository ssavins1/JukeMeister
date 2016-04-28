package library;

/**
 * Represents the information for a song.
 */
public class Song {
	/** The artist who wrote the song */
	private String artist;
	/** The name of the song */
	private String name;
	/** The album this song is in */
	private String album;
	/** The year the song was released */
	private int year;
	
	/** The file name of the image for this song */
	private String imageFilename;
	
	/**
	 * Initializes all fields of the song.
	 * 
	 * @param artist the artist who wrote the song
	 * @param name the name of the song
	 * @param album the album the song is in
	 * @param year the year the song was released
	 * @param imageFilename the file name of the image for this song
	 */
	public Song(String artist, String name, String album, 
			int year, String imageFilename){
		this.artist = artist;
		this.name = name;
		this.album = album;
		this.year = year;
		this.imageFilename = imageFilename;
	}
	
	/**
	 * Get the file name of the media file for this song.
	 * 
	 * @return the file name of the media file for this song
	 */
	public String getFilename(){
		return "songs\\" + artist + '-' + name + ".mp3";
	}

	/**
	 * Get the file name of the image for this song.
	 * 
	 * @return the file name of the image for this song
	 */
	public String getImageFilename(){
		return imageFilename;
	}
	
	/**
	 * Set the file name of the image for this song.
	 * 
	 * @param filename the new file name of the image for this song
	 */
	public void setImageFilename(String filename){
		imageFilename = filename;
	}
	
	/**
	 * Get the year this song was released.
	 * 
	 * @return the year this song was released
	 */
	public int getYearReleased(){
		return year;
	}
	
	/**
	 * Get the album name of the album this song is in.
	 * 
	 * @return the album name of the album this song is in
	 */
	public String getAlbum(){
		return album;
	}
	
	/**
	 * Set the year that this song was released.
	 * 
	 * @param year the year this song was released
	 */
	public void setYearReleased(int year){
		this.year = year;
	}
	
	/**
	 * Get the artist that wrote this song
	 * 
	 * @return the artist that wrote this song
	 */
	public String getArtist(){
		return artist;
	}
	
	/**
	 * Get the name of this song
	 * 
	 * @return the name of this song
	 */
	public String getName(){
		return name;
	}
}
