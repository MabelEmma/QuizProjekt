package Projekt.Quiz;
import java.util.Scanner;


public class DifficultyChoice {
	
	int choice = 0;
	boolean validInput = false;	
	Scanner scanner = new Scanner(System.in);

	
public void difficultyChoice(User user) {

	
	while(!validInput) {
		System.out.println("Enter numbers for the difficulty of your choice: ");
		System.out.println("1. Easy \n2. Medium \n3. Hard ");
		String input = scanner.nextLine();
	
	//Kontrollera att användaren skrivit 1, 2 eller 3. 
	try {
         choice = Integer.parseInt(input);
         
         // Kontrollera att valet är 1, 2 eller 3
         if (choice < 1 || choice > 3) {
             throw new NumberFormatException(); // Kasta undantag om valet inte är 1, 2 eller 3
         }
         
         validInput = true; // Om inmatningen är giltig, sätt validInput till true
     } catch (NumberFormatException e) {
         System.out.println("Invalid input. Please enter 1, 2, or 3.");
     }
	
	// Lätta frågorna
	if (input.equals("1")) {
		System.out.println("-----------------------------------");
		System.out.println("EASY"
				+ "\n- For each question you will get three options: 1, 2 and 3. Write the number that you think has the correct option. For each correct answer you will get 10 points :)");

		System.out.println("-----------------------------------");
		
		ListWithQuestions easy = new ListWithQuestions();
		user.setPoints(easy.choiceEasy(user));
	}

	// Medel frågor
	else if (input.equals("2")) {
		System.out.println("-----------------------------------");
		System.out.println("MEDIUM"
				+ "\n- For each question you will get three options: 1, 2 and 3. Write the number that you think has the correct option. For each correct answer you will get 10 points :)");

		System.out.println("-----------------------------------");
		
		ListWithQuestions medium = new ListWithQuestions();
		user.setPoints(medium.choiceMedium(user));
	}

	// Svåra frågor
	else if (input.equals("3")) {
		System.out.println("-----------------------------------");
		System.out.println("HARD"
				+ "\n- For each question you will get three options: 1, 2 and 3. Write the number that you think has the correct option. For each correct answer you will get 10 points :)");

		System.out.println("-----------------------------------");
		
		ListWithQuestions hard = new ListWithQuestions();
		user.setPoints(hard.choiceHard(user));
	}
	
	}

}
}
