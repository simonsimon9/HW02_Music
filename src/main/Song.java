package main;
/**
 * This class represents a song 
 * @author simon
 *
 */
public class Song {
	private String title;
	private String artist;
	private String genre;
	private static final String DEFAULT_VALUE = "unknown";
	/**
	 * Class constructor specifying the title, artist, and genre of a song
	 * @param title		title to set song's title
	 * @param artist	artist to set song's artist
	 * @param genre		genre to set song's genre
	 */
	public Song(String title, String artist, String genre) {
		this.title = title;
		this.artist = artist;
		this.genre = genre;
	}
	
	/**
	 * Class constructor specifying the title, artist. Genre will default to Unknown.
	 * @param title		title to set song's title
	 * @param artist	artist to set song's artist
	 */
	public Song(String title, String artist) {
		this(title, artist, DEFAULT_VALUE);
	}
	
	/**
	 * Gets the song's title
	 * @return A string representing the song's title.
	 */
	public String getTitle() {
		return this.title;
	}
	
	/**
	 * Gets the song's artist
	 * @return A string representing the song's artist
	 */
	public String getArtist() {
		return this.artist;
	}
	
	/**
	 * Gets the song's genre
	 * @return A string representing the song's genre
	 */
	public String getGenre() {
		return this.genre;
	}
	
	/**
	 * Sets the song's title
	 * @param title a String containing the song's title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Sets the song's artist
	 * @param artist a String containing the song's artist
	 */
	public void setArtist(String artist) {
		this.artist =artist;
	}
	
	/**
	 * Sets the song's genre
	 * @param genre a String containing the song's genre
	 */
	public void setGenre(String genre) {
		this.genre =genre;
	}
	
	/**
	 * Returns the values of the fields as String
	 * @return A String representing the artist, title, and genre of the song.
	 */
	public String toString() {
		return this.artist + " - " + this.title + ", Genre: " + this.genre ;
	}
}
