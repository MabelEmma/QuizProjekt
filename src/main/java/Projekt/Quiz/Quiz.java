package Projekt.Quiz;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {

		System.out.println("Hello and welcome to this Harry Potter quiz!");

		// Användaren fyller i sitt användarnamn
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your username: ");
		
		 String username = scanner.nextLine(); User user = new User();
		 user.setUsername(username); System.out.println("Hello " + username + "!" );
		 
		 
		 //Användaren får fylla i svårighetsgrad av quizet
		 System.out.println("There are three levels of difficulty: "); 
		 Difficulty difficulty = new Difficulty(); 
		 difficulty.printDifficultyList();
		 

			
	while(true) {
		System.out.println("Enter numbers for the difficulty of your choice: ");
		int choice = scanner.nextInt();
		scanner.nextLine();
		
		// Lätta frågorna
		if (choice == 1) {
			System.out.println("-----------------------------------");
			System.out.println("EASY"
					+ "\n- For each question you will get three options: 1, 2 and 3. Write the number that you think has the correct option :)");

			System.out.println("-----------------------------------");
			
			ListWithQuestions easy = new ListWithQuestions();
			easy.choiceEasy();
			break;
		}

		// Medel frågor
		else if (choice == 2) {
			System.out.println("-----------------------------------");
			System.out.println("MEDIUM"
					+ "\n- For each question you will get three options: 1, 2 and 3. Write the number that you think has the correct option :)");

			System.out.println("-----------------------------------");
			
			ListWithQuestions medium = new ListWithQuestions();
			medium.choiceMedium();
			break;
		}

		// Svåra frågor
		else if (choice == 3) {
			System.out.println("-----------------------------------");
			System.out.println("HARD"
					+ "\n- For each question you will get three options: 1, 2 and 3. Write the number that you think has the correct option :)");

			System.out.println("-----------------------------------");
			
			ListWithQuestions hard = new ListWithQuestions();
			hard.choiceHard();
			break;
		}

		// Om användaren skriver in något annat än 1, 2 eller 3.
		else {
			System.out.println("You have to write the number 1, 2 or 3. Try again.");
		}
	}

		//Här lägger du in det som händer efter användaren svarat på alla frågor
		
		
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
