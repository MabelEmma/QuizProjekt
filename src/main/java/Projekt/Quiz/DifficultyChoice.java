package Projekt.Quiz;
import java.util.List;
import java.util.Scanner;


public class DifficultyChoice {
	
	//Enums
	public enum Difficulty {
        EASY,
        MEDIUM,
        HARD
    }

	//INKAPSLING
	private int choice = 0;
	private boolean validInput = false;	
	
	Scanner scanner = new Scanner(System.in);

	
public void difficultyChoice(User user, List<Questions> questions) {
	
	while(!validInput) {
		System.out.println("Enter numbers for the difficulty of your choice: ");
		System.out.println("1. Easy \n2. Medium \n3. Hard ");
		String input = scanner.nextLine();
	
	//KONTROLL att användaren skrivit 1, 2 eller 3. 
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
	
	ListWithQuestions allQuestions = new ListWithQuestions(questions);
	
	 // Hämta svårighetsgraden baserat på användarens val
    Difficulty difficulty;
    switch (input) {
        case "1":
            difficulty = Difficulty.EASY;
            System.out.println("---------------------------------------------------------------------------");
    		System.out.println("EASY"
    				+ "\n- For each question you will get three options: 1, 2 and 3. Write the number that you think has the correct option. \nFor each correct answer you will get 10 points :)");

    		//System.out.println("-----------------------------------");
    		
    		allQuestions.choiceEasy(user);
            break;
        case "2":
            difficulty = Difficulty.MEDIUM;
            System.out.println("---------------------------------------------------------------------------");
    		System.out.println("MEDIUM"
    				+ "\n- For each question you will get three options: 1, 2 and 3. Write the number that you think has the correct option. \nFor each correct answer you will get 10 points :)");

    		//System.out.println("-----------------------------------");
    		
    		allQuestions.choiceMedium(user);
            break;
        case "3":
            difficulty = Difficulty.HARD;
            System.out.println("---------------------------------------------------------------------------");
    		System.out.println("HARD"
    				+ "\n- For each question you will get three options: 1, 2 and 3. Write the number that you think has the correct option. \nFor each correct answer you will get 10 points :)");

    		//System.out.println("-----------------------------------");
    		
    		allQuestions.choiceHard(user);
            break;
        default:
            difficulty = null; // Om användaren anger något annat än 1, 2 eller 3
            break;
    }
	
	
	
	
	
	
	/*// Lätta frågorna
	if (input.equals("1")) {
		System.out.println("-----------------------------------");
		System.out.println("EASY"
				+ "\n- For each question you will get three options: 1, 2 and 3. Write the number that you think has the correct option. \nFor each correct answer you will get 10 points :)");

		System.out.println("-----------------------------------");
		
		allQuestions.choiceEasy(user);
	}

	// Medel frågor
	else if (input.equals("2")) {
		System.out.println("-----------------------------------");
		System.out.println("MEDIUM"
				+ "\n- For each question you will get three options: 1, 2 and 3. Write the number that you think has the correct option. \nFor each correct answer you will get 10 points :)");

		System.out.println("-----------------------------------");
		
		allQuestions.choiceMedium(user);
	}

	// Svåra frågor
	else if (input.equals("3")) {
		System.out.println("-----------------------------------");
		System.out.println("HARD"
				+ "\n- For each question you will get three options: 1, 2 and 3. Write the number that you think has the correct option. \nFor each correct answer you will get 10 points :)");

		System.out.println("-----------------------------------");
		
		allQuestions.choiceHard(user);
	}*/
	
	}

}
}
