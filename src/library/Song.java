package library;


public class Song {
	private String artist;
	private String name;
	private int year;
	
	private String imageFilename;
	
	public Song(String artist, String name, int year, String imageFilename){
		this.artist = artist;
		this.name = name;
		this.year = year;
		this.imageFilename = imageFilename;
	}

	public String getImageFilename(){
		return imageFilename;
	}
	
	public void setImageFilename(String filename){
		imageFilename = filename;
	}
	
	public int getYearReleased(){
		return year;
	}
	
	public void setYearReleased(int year){
		this.year = year;
	}
	
	public String getArtist(){
		return artist;
	}
	
	public String getName(){
		return name;
	}
}
