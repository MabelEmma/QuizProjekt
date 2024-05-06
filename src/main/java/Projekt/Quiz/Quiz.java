package Projekt.Quiz;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
import java.util.Scanner;

//Importera för att json fil ska fungera
//Hur vet man vad som behövs här?
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Quiz {
	
	public static void main(String[] args) {

		//Test att läsa in en json fil
		try {
            // Läs innehållet i JSON-filen som en sträng
            String content = new String(Files.readAllBytes(Paths.get("src/main/java/Projekt/Quiz/Questions.json")));

            // Skapa ett JSON-objekt från den inlästa strängen
            JSONObject jsonObject = new JSONObject(content);

            // Hämta och skriv ut attributen från JSON-objektet
            String name = jsonObject.getString("name");
            int age = jsonObject.getInt("age");
            String city = jsonObject.getString("city");

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("City: " + city);
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
//Nedanför börja riktiga quizet, innan är det bara test med json fil		
//---------------------------	
		
		
		//Grafik
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
