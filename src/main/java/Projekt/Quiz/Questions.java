package Projekt.Quiz;

import java.util.List;

//Här ska det ligga en metod som visar en fråga, dess svarsalternativ och om det är rätt svar.
//Själva frågorna ska inte ligga här.

//Skapa en konstruktor så ListWithQuestions kan skapa instanser av denna klass.

public class Questions {

	String question;
	List<String> choices;
	String answer;

	public void ListWithQuestions(String question, List<String> choices, String answer) {
	    this.question = question;
	    this.choices = choices;
	    this.answer = answer;
}
	
	public String getQuestion() {
		return question;
	}
	
	public List<String> getChoices() {
		return choices;
	}
	
	public String getAnswer() {
		return answer;
	}
	
}
