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
import java.util.HashMap;
import java.util.List;


public class Quiz {
	
	private static String filePath = "./src/main/java/Projekt/Quiz/Questions.json";

	public String getFilePath() {
		return filePath;
	}
	
	public static void main(String[] args) {
		
		//Information från Json filen lagras i denna varibeln.
		List<Questions> questions;
		
		//En try och catch för att försöka läsa in en json fil
		//Hantering av undantag
		try {
	            //Skapa en ObjectMapper för att läsa in JSON-filen
				//Objectmapper är en klass från Jackson-biblioteket som används för att mappa mellan JSON-datat och Java-objekt.
	            ObjectMapper objectMapper = new ObjectMapper();
	            //Aktiverar en funktion i ObjectMapper som tillåter att ett enskilt JSON-objekt tolkas som en array.
	            objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

	            // Läs in JSON-filen och konvertera den till en lista av frågor
	            questions = objectMapper.readValue(new File(filePath),
	                    objectMapper.getTypeFactory().constructCollectionType(List.class, Questions.class));
	    //Om ett undantag fångas skrivs det ut och sen avslutas programmet. Om allt i try fungerar fortsätter programmet som vanligt.  
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
			User user = new User("");
			System.out.println("\nHello and welcome to this Harry Potter quiz!");

			//Användaren fyller i sitt användarnamn och väljer vilket hus den vill tillhöra. Metoden skriver ut det.
		
			user.printUsernameHousePoints();

			//Användaren väljer svårighetsgrad. Metoden skriver ut olika val och skriver ut frågorna för tillhörande val.
			//Frågorna skriv ut.
			DifficultyChoice difficultychoice = new DifficultyChoice ();
			difficultychoice.difficultyChoice(user, questions);

			//Räknar ut användarens slutpoäng och skriver ut.
			user.calculatePoints();
		
			//Grafik
			art.dobby();
			
			//Skriver ut en unik hashcode för användaren.
			GenerateHashMap generateHashMap = new GenerateHashMap();
			generateHashMap.getHashCode(user);
			
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
