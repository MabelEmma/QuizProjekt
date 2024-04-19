package Projekt.Quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {

		System.out.println("Hej och välkommen till Harry potter quiz!");

		// Användaren fyller i sitt användarnamn
		Scanner scanner = new Scanner(System.in);

		System.out.println("Vänligen ange ditt användarnamn: ");
		
		 String username = scanner.nextLine(); User user = new User();
		 user.setUsername(username); System.out.println("Hej " + username +
		 ", välkommen till Harry Potter Quiz");
		 
		 
		 //Användaren får fylla i svårighetsgrad av quizet
		 System.out.println("Det finns tre svårighetsgrader: "); Difficulty difficulty
		 = new Difficulty(); difficulty.printDifficultyList();
		 

		System.out.println("Skriv in siffran för den svårighetsgrad du väljer: ");
		int choice = scanner.nextInt();
		scanner.nextLine();

		// Lätta frågorna
		if (choice == 1) {
			System.out.println("-----------------------------------");
			System.out.println("LÄTT"
					+ "\n- Till varje fråga kommer du få tre alternativ: 1, 2 och 3. Skriv den siffra som du tror har rätt alternativ :)");

			System.out.println("-----------------------------------");
			
			// Anropar en metod som skriver ut fråga 1
			Questions question1 = new Questions("Which platform does the Hogwarts Express leave from?",
					Arrays.asList("Nine and three-quarters", "Ten and a half", "Nine and four-quartes"), "1");
			question1.printQuestion("Fråga 1: ");

			// Kollar vad användaren skrivit in och anropar en metod som ser om det är rätt
			// eller fel.
			String question1Choice = scanner.nextLine();
			question1.checkAnswer(question1Choice);

			System.out.println("-----------------------------------");

			Questions question2 = new Questions(
					"Who stopped Harry and Ron from going through platform nine and three-quarters?",
					Arrays.asList("Duddly", "Dobby", "Malfoy"), "2");
			question2.printQuestion("Fråga 2: ");

			String question2Choice = scanner.nextLine();
			question2.checkAnswer(question2Choice);

			System.out.println("-----------------------------------");

			Questions question3 = new Questions("In which movie do dementors board the Hogwarts Express?",
					Arrays.asList("First movie", "Second movie", "Third movie"), "1");
			question3.printQuestion("Fråga 3: ");

			String question3Choice = scanner.nextLine();
			question3.checkAnswer(question3Choice);
		}

		// Medel frågor
		if (choice == 2) {

		}

		// Svåra frågor
		if (choice == 3) {

		}

		// Om användaren skriver in något annat än 1, 2 eller 3.
		else {

		}

		scanner.close();

		/*
		 * //Lista visas med alla frågor, fixa senare ListWithQuestions questions = new
		 * ListWithQuestions();
		 * 
		 * System.out.println("Dessa frågor finns att svara på: ");
		 * 
		 * questions.printQuestions();
		 */

	}
}
