package Projekt.Quiz;
import java.util.List;
import java.util.Scanner;


public class DifficultyChoice {
	
	public enum Difficulty {
        EASY,
        MEDIUM,
        HARD
    }

	private int choice = 0;
	private boolean validInput = false;	
	
	Scanner scanner = new Scanner(System.in);

	
	public void difficultyChoice(User user, List<SingleChoiceQuestion> questions) {
	
		while(!validInput) {
			System.out.println("Enter numbers for the difficulty of your choice: ");
			System.out.println("1. Easy \n2. Medium \n3. Hard ");
			String input = scanner.nextLine();
	
			//Kontroll att användaren skrivit 1, 2 eller 3. 
			try {
				choice = Integer.parseInt(input);
         
				if (choice < 1 || choice > 3) {
					throw new NumberFormatException(); //Kasta undantag om valet inte är 1, 2 eller 3
					}
         
				validInput = true; //Om inmatningen är giltig, sätt validInput till true
				} 	
			
			//Vid fel skriv ut följande
			catch (NumberFormatException e) {
				System.out.println("Invalid input, please enter 1, 2, or 3.");
			}
	
	
	ListWithQuestions allQuestions = new ListWithQuestions(questions);
	
	
	//Deklarerar varibaeln difficulty av typen Difficulty (enum)
	Difficulty difficulty;
    
	//Hämta svårighetsgraden baserat på användarens val
	switch (input) {
        case "1":
            difficulty = Difficulty.EASY;
            System.out.println("---------------------------------------------------------------------------");
        	System.out.println(difficulty);
            System.out.println("For each question you will get three options: 1, 2 and 3. Write the number that you think has the correct option. \nIf you choose the correct answer you will get 10 points :)");
    		
    		allQuestions.choiceEasy(user);
            break;
            
        case "2":
            difficulty = Difficulty.MEDIUM;
            System.out.println("---------------------------------------------------------------------------");
        	System.out.println(difficulty);
            System.out.println("For each question you will get three options: 1, 2 and 3. Write the number that you think has the correct option. \nIf you choose the correct answer you will get 10 points :)");

    		
    		allQuestions.choiceMedium(user);
            break;
            
        case "3":
            difficulty = Difficulty.HARD;
            System.out.println("---------------------------------------------------------------------------");
        	System.out.println(difficulty);
            System.out.println("For each question you will get three options: 1, 2 and 3. Write the number that you think has the correct option. \nIf you choose the correct answer you will get 10 points :)");

    		
    		allQuestions.choiceHard(user);
            break;
            
        default:
            break;
            }
    
    
	}

}
}
