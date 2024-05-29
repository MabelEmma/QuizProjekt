package Projekt.Quiz;

import java.util.List;

public class Question {

	protected String question;
	protected String answer;
	protected List<String> choices;
	protected String difficulty;

	
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
	
	
}
