package Projekt.Quiz;
import java.util.Scanner;

public class Quiz 
{
    public static void main( String[] args )
    {
       
    	System.out.println("Hej och välkommen till Harry potter quiz!");
    	
    	//Användaren fyller i sitt användarnamn
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Vänligen ange ditt användarnamn: ");
    	String username = scanner.nextLine();
    	User user = new User();
    	user.setUsername(username);
    	System.out.println("Hej " + username + ", välkommen till Harry Potter Quiz");
    	
    	
    	//Användaren får fylla i svårighetsgrad av quizet
    	System.out.println("Det finns tre svårighetsgrader: ");
    	Difficulty difficulty = new Difficulty();
		difficulty.printDifficultyList();
		
    	System.out.println("Skriv in siffran för den svårighetsgrad du väljer: ");
    	int choice = scanner.nextInt();
    	
    		if(choice == 1) {
    			System.out.println("Du valde lätt!"); 
    			
    			//Visa lätta frågorna
    			System.out.println("Fråga 1: In which movie do dementors board the Hogwarts Express?");
    			
    			/*Jag vill på något vis skapa en klass som kopplar varje separat fråga till 3 
    			alternativ där bara ett är rätt och om man anropar den frågan här i main blir 
    			det automatiskt dessa alternativ samt rätt svar, hur? Jag vill tex döpa en fråga till question1Easy, questions2Easy och för medel
    			blir det questions1Medium, question2Medium, och för svår blir det question1Hard, question2Hard*/
    			
    		}
    		else if(choice == 2) {
    			System.out.println("Du valde medel!"); 
    		}
    		else if(choice == 3) {
    			System.out.println("Du valde svår!"); 
    		}
    		else {
    			System.out.println("Det måste vara en siffra mellan 1-3. Skriv igen: ");
    		}
    	
    	
		
		
		
		
		
		
    	scanner.close();
    	
    	
    	
    	
    	
    	
    	/*
    	//Lista visas med alla frågor, fixa senare
    	ListWithQuestions questions = new ListWithQuestions();
    	
    	System.out.println("Dessa frågor finns att svara på: ");
    	
    	questions.printQuestions();*/
    	
    }
}
