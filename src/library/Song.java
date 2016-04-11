package library;

public class Song {
	private String artist;
	private String name;
	
	public Song(String artist, String name){
		this.artist = artist;
		this.name = name;
	}
	
	public String getArtist(){
		return artist;
	}
	
	public String getName(){
		return name;
	}
	
	public String getFilename(){
		return artist + "-" + name + ".mp3";
	}
	
	public String getImageFileName(){
		return artist + "-" + name + ".jpg";
	}
}
