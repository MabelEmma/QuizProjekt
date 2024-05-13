package Projekt.Quiz;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
import java.util.Scanner;

//import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
//Importera för att json fil ska fungera
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.List;


public class Quiz {

	public static void main(String[] args) {
		
		List<Questions> questions;
		
		//En try och catch för att försöka läsa in en json fil
		try {
	            // Skapa en ObjectMapper för att läsa in JSON-filen
	            ObjectMapper objectMapper = new ObjectMapper();
	            objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

	            // Läs in JSON-filen och konvertera den till en lista av frågor
	            questions = objectMapper.readValue(new File("./src/main/java/Projekt/Quiz/Questions.json"),
	                    objectMapper.getTypeFactory().constructCollectionType(List.class, Questions.class));
	        } catch (Exception e) {
	            e.printStackTrace();
	            return;
	        }


		
//Nedanför börja quizet, innan läses bara filen ut		
		
		//Grafik
		Art art = new Art();
		art.harryPotter();
		
		Scanner scanner = new Scanner(System.in);
	
		
		//Loop så att användaren kan börja om spelet om hen vill
		while(true) {
			User user = new User(null);
			System.out.println("\nHello and welcome to this Harry Potter quiz!");

		//Användaren fyller i sitt användarnamn och väljer vilket hus den vill tillhöra. Metoden skriver ut det.
		
			user.printUsernameHousePoints();

		//Användaren väljer svårighetsgrad. Metoden skriver ut olika val och skriver ut frågorna för tillhörande val.
		DifficultyChoice difficultychoice = new DifficultyChoice ();
		difficultychoice.difficultyChoice(user, questions);

		//Räknar ut användarens slutpoäng och skriver ut.
		user.calculatePoints();
		
		//Grafik
		art.dobby();
		
		//Frågar om användaren vill spela igen.
		System.out.println("Do you want to try again?");
		System.out.println("1. Yes \n2. No");
		
		//läser in användarens svar. Om svaret är 2.Nej skickas använder tillbaka upp i loopen.
		String tryAgain = scanner.nextLine(); 
		if (tryAgain.endsWith("2")) {
			break;
		}
		
	}
		//Avslutar spelet
		System.out.println("Thanks for playing!");
		
		//Close måste placeras utanför loopen så att den går att loopa om.
		scanner.close();
	}


}
