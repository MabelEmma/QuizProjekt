package Projekt.Quiz;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Här samlas alla frågor

//Skapa en array med frågorna.
//När jag skapar arrayen kan jag anropa konstruktorn i Questions.

public class ListWithQuestions {
	
	Scanner scanner = new Scanner(System.in);
	
	List<Questions> easyQuestions = new ArrayList<>();
	List<Questions> mediumQuestions = new ArrayList<>();
	List<Questions> hardQuestions = new ArrayList<>();
	
	public ListWithQuestions(List<Questions> questions) {
		for (Questions question: questions) {
			if(question.difficulty.equalsIgnoreCase("easy")) {
				easyQuestions.add(question);
			}
			else if(question.difficulty.equalsIgnoreCase("medium")) {
				mediumQuestions.add(question);
			}
			else if(question.difficulty.equalsIgnoreCase("hard")) {
				hardQuestions.add(question);
			}
		}
	}
	
	
	//Metod som skriver ut alla lätta frågor i en specifik ordning. Anropar denna metod i main.
	public void choiceEasy(User user) {
				
		int questionNumber = 1;
		
				for(Questions question: easyQuestions) {
					//Omvandlar questionsNumber från en int till en String och skickar den sen till printQuestion och skriver ut.
					question.printQuestion(Integer.toString(questionNumber));
					questionNumber++;
					
					String questionChoice = scanner.nextLine();
					question.checkAnswer(questionChoice, user);
				}	

	}
	
	
	//Metod som skriver ut alla medium frågor i en specifik ordning. Anropar denna metod i main.
	public void choiceMedium(User user) {
				
		int questionNumber = 1;
		
				for(Questions question: mediumQuestions) {
					//Omvandlar questionsNumber från en int till en String och skickar den sen till printQuestion och skriver ut.
					question.printQuestion(Integer.toString(questionNumber));
					questionNumber++;
					
					String questionChoice = scanner.nextLine();
					question.checkAnswer(questionChoice, user);
				}	

	}
	
	//Metod som skriver ut alla svåra frågor i en specifik ordning. Anropar denna metod i main.
	public void choiceHard(User user) {
		
		int questionNumber = 1;
		
				for(Questions question: hardQuestions) {
					//Omvandlar questionsNumber från en int till en String och skickar den sen till printQuestion och skriver ut.
					question.printQuestion(Integer.toString(questionNumber));
					questionNumber++;
					
					String questionChoice = scanner.nextLine();
					question.checkAnswer(questionChoice, user);
				}	

	}
				
}			
				
	
