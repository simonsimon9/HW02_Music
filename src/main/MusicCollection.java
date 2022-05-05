package main;

import java.util.Scanner;
/**
 * This class contains the main method and album Options method
 * This is the 
 * @author simon
 *
 */
public class MusicCollection {
	private static Scanner scannerObj;
	private static int userInput;
	private static int methodInput;
	
	/**
	 * This method will display the options of the chosen album.
	 * Options are get favorite track, change genre, and return to main menu. 
	 * For favorite track option, the program displays the favorite track's number, artist, title, and genre.
	 * For change genre, the program will prompt user to input the new genre.
	 * For return option, the program will return to the main menu with the Album collection names.
	 * @param variableName  Album object used for further track information and change genre.
	 */
	public static void albumOptions(Album variableName) {
		System.out.println("\n"+variableName.toString());
		do {
			
			System.out.println("\nAlbum options: \n[1] Get Favorite Track"+
								"\n[2] Change genre\n[0] return\n");
			System.out.print("Selection: ");
			

			boolean intCheck = true;
			while(intCheck) {
				if(scannerObj.hasNextInt()) {
					methodInput = scannerObj.nextInt();
					scannerObj.nextLine();
				}else {
					scannerObj.next();
					System.out.print("Incorrect Input, input here: ");
					continue;
				}
				intCheck = false;
			}
			
			if(methodInput == 1) {
				String trackNum = "Track No. "+ variableName.getTrackNumber()+": ";
				String favTrack = variableName.getFavoriteTrack().toString();
				System.out.println(trackNum + favTrack);
			}else if(methodInput ==2) {
				System.out.print("New genre: ");
				String genreInput = scannerObj.next();
				variableName.setGenre(genreInput);
			}
		}while(methodInput != 0);
	}
	
	/**
	 * Main method that displays the albums in the music collection. 
	 * Prompts for the user's choice of album for further options. 
	 * If user inputs 0, the program will exit. 
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song1 = new Song("Jesus is Here", "Mark","Christian Rock");
		Song song2 = new Song("Tiger on a Prow", "Matt");
		Song song3 = new Song("Redemption","Chris","Rap");
		
		Album album1 = new Album("Christ's Story", song1, 4);
		Album album2 = new Album("Animal Kingdom", song2);
		Album album3 = new Album("Struggles of a Rapper", song3, 2);
		Album[] albumArray = {album1, album2, album3};
		
		scannerObj = new Scanner(System.in);
		
		do{
			System.out.println("Music Collection");
			
			for(int i = 0; i<Album.numAlbums;i++) {
				System.out.println("["+(i+1) + "] " + albumArray[i].getTitle());
			}
			
			System.out.print("Select an Album (0 to quit): ");
			boolean intCheck = true;
			while(intCheck) {
				if(scannerObj.hasNextInt()) {
					userInput = scannerObj.nextInt();
					
				}else {
					scannerObj.next();
					System.out.print("Incorrect Input, input here: ");
					continue;
				}
				intCheck = false;
			}
			
			
			if(userInput > 0 && userInput < albumArray.length+1 ) {
			
				albumOptions(albumArray[userInput-1]);
			}
		}while(userInput != 0);
		System.out.println("\n\n\n---------------------------------------\n(program exited with code: 0)");
		scannerObj.close();
		
		
	}

}
