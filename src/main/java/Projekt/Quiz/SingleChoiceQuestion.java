package Projekt.Quiz;

//import java.util.List;

//Klass som tar in fråga, alternativ och rätt svar från json filen.

public class SingleChoiceQuestion extends Question {

	protected String answer;

	public String getAnswer() {
		return answer;
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
