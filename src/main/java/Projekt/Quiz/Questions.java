package Projekt.Quiz;

import java.util.List;

//Klass som tar in fråga, alternativ och rätt svar från json filen.

public class Questions {

	private String question;
	private String answer;
	private List<String> choices;
	private String difficulty;

	
	/*//Default kontruktor
	public Questions() {}*/

	
	//Finns ingen set då dessa inte ska ändras.
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
		
        //For-loop som skriver ut alla alternativ och lägger till en siffra innan
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
