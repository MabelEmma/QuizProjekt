package Projekt.Quiz;

import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

//Klass som tar in fråga, alternativ och rätt svar från json filen och sätter dessa i olika varibler med samma namn.

public class Questions {

	String question;
	String answer;
	List<String> choices;
	String difficulty;

	public Questions() {}
	
	public Questions(String question, List<String> choices, String answer) {
		this.question = question;
		this.answer = answer;
		this.choices = new ArrayList<>();

		for (String choice : choices) {
			this.choices.add(choice);
		}

	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer() {
		return answer;
	}

	public List<String> getChoices() {
		return choices;
	}
	
	public String getDifficulty() {
		return difficulty;
	}

	//Metod som skriver ut frågan tillsammans med tre alternativ
	public void printQuestion(String questionNumber) {
        System.out.println("---------------------------------------------------------------------------");
		System.out.println(questionNumber + ". " + this.question);
        System.out.println("---------------------------------------------------------------------------");
		for (int i = 0; i < this.choices.size(); i++) {
			System.out.println(i + 1 + ". " + this.choices.get(i));

		}
	}

	//Metod som ser vad användaren skrivit in och jämnför det med rätt svar.
	public void checkAnswer(String questionChoice, User user) {
		if (questionChoice.equalsIgnoreCase(this.answer)) {
			
			
	        System.out.println("---------------------------------------------------------------------------");
			System.out.println("Hurray, 10 points to " + user.getHouse());
			user.increasePoints();
			System.out.println("Your new score is " + user.getPoints());
		} else {
			System.out.println("Wrong answer, your score is still " + user.getPoints());
		}
	}

	
	
	
	
	
	
}
