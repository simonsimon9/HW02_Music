package main;
/**
 * This class represents an Album which is composed of a song
 * @author simon
 *
 */
public class Album {
	private String title;
	private String artist;
	private String genre;
	private Song favoriteTrack;
	private int trackNumber;
	private static final int DEFAULT_VALUE = 1;
	public static int numAlbums = 0;
	
	/**
	 * Class constructor specifying the album's title, artist, genre, favorite track, and favorite track number. 
	 * @param title		title to set the album's title
	 * @param favoriteTrack		favorite track to set the album's artist and genre
	 * @param trackNumber		track number to set the album's favorite track number. 
	 */
	public Album(String title, Song favoriteTrack, int trackNumber) {
		this.title = title;
		this.artist = favoriteTrack.getArtist();
		this.genre = favoriteTrack.getGenre();
		this.favoriteTrack = favoriteTrack;
		this.trackNumber = trackNumber;
		Album.numAlbums++;
	}
	
	
	/**
	 * Class constructor specifying the album's title, artist, genre, and favorite track.
	 * The album's favorite track number will be default value of 1. 
	 * @param title		title to set the album's title
	 * @param favoriteTrack		favorite track to set the album's artist and genre
	 */
	public Album(String title, Song favoriteTrack) {
		this(title,favoriteTrack,DEFAULT_VALUE);
	}
	
	/**
	 * Gets the album's title
	 * @return	A string representing the album's title 
	 */
	public String getTitle() {
		return this.title;
	}
	
	/**
	 * Gets the album's favorite track
	 * @return	A string representing the album's favorite track.
	 */
	public Song getFavoriteTrack() {
		return this.favoriteTrack;
	}
	
	/**
	 * Gets the album's favorite track number
	 * @return  An integer representing the album's favorite track's number
	 */
	public int getTrackNumber() {
		return this.trackNumber;
	}
	
	/**
	 * Sets the album's title
	 * @param title	a String containing the album's title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Sets the album's genre
	 * @param genre	a String containing the song's and album's genre
	 */
	public void setGenre(String genre) {
		this.genre = genre;
		favoriteTrack.setGenre(genre);
	}
	
	/**
	 * Sets the album's artist
	 * @param artist  a String containing the song's and album's artist
	 */
	public void setArtist(String artist) {
		this.artist = artist;
		favoriteTrack.setArtist(artist);
	}
	
	
	/**
	 * Sets the album's favorite track number
	 * @param trackNumber	an integer containing the favorite track's number
	 */
	public void setTrackNumber(int trackNumber) {
		this.trackNumber = trackNumber;
	}
	
	/**
	 * Method that returns String representing the title, artist and genre of the album
	 * @return String representation of the album's title, artist and genre
	 */
	public String toString() {
		return "\""+this.title + "\" by " + this.artist + ": " + this.genre;
		
	}
	

}
