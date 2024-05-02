package Projekt.Quiz;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
import java.util.Scanner;

public class Quiz {
	
	public static void main(String[] args) {

		
		//Fin liten grafik bara
		Art art = new Art();
		art.harryPotter();
		
		Scanner scanner = new Scanner(System.in);
	
		
		//Loop så att användaren kan börja om spelet om hen vill
		while(true) {
			User user = new User(null);
			System.out.println("\nHello and welcome to this Harry Potter quiz!");

		// Användaren fyller i sitt användarnamn och väljer vilket hus den vill tillhöra. Metoden skriver ut det.
		
			user.printUsernameHousePoints();

		//Användaren väljer svårighetsgrad. Metoden skriver ut olika val och skriver ut frågorna för tillhörande val.
		DifficultyChoice difficultychoice = new DifficultyChoice ();
		difficultychoice.difficultyChoice(user);

		//Hämtar och skriver ut hur många rätt användaren fick
		System.out.println("-----------------------------------");
		System.out.println("You got " + user.getPoints() + " points, out of 50 points!");
		System.out.println("-----------------------------------");
		
		//Grafik
		art.dobby();
		
		//Frågar om användaren vill spela igen.
		System.out.println("Do you want to try again?");
		System.out.println("1. Yes \n2. No");
		
		String tryAgain = scanner.nextLine(); 
		if (tryAgain.endsWith("2")) {
			break;
		}
		//Avslutar spelet
		System.out.println("Thanks for playing!");
		
	}
		
		scanner.close();
	}


}
