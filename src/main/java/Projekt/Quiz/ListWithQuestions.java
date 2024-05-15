package Projekt.Quiz;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListWithQuestions {
	
	Scanner scanner = new Scanner(System.in);
	
	//Använder arraylist som en typ av ADT
	List<Questions> easyQuestions = new ArrayList<>();
	List<Questions> mediumQuestions = new ArrayList<>();
	List<Questions> hardQuestions = new ArrayList<>();
	
	//Konstruktor
	public ListWithQuestions(List<Questions> questions) {
		for (Questions question: questions) {
			
			//Använder mig av equals
			if(question.getDifficulty().equalsIgnoreCase("easy")) {
				easyQuestions.add(question);
			}
			else if(question.getDifficulty().equalsIgnoreCase("medium")) {
				mediumQuestions.add(question);
			}
			else if(question.getDifficulty().equalsIgnoreCase("hard")) {
				hardQuestions.add(question);
			}
		}
	}
	
	
	//Metod som skriver ut alla lätta frågor i en specifik ordning. Anropar denna metod i main.
	public void choiceEasy(User user) {
				
		int questionNumber = 1;
		
				//Vad gör denna?
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
				
	
