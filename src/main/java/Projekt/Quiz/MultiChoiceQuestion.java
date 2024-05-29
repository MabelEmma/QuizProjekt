package Projekt.Quiz;

import java.util.List;

public class MultiChoiceQuestion extends Question {

	//Denna klass används när det finns flera rätta svar och ärver från klassen Quetions.
	
	protected List<String> answers; 
	
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	public List<String> getAnswers() {
        return answers;
    }
	
	//Metod som ser vad användaren skrivit in och jämnför det med rätt svar.
		public void checkAnswer(String questionChoice, User user) {
			if (this.answers.contains(questionChoice)) {				
		        System.out.println("---------------------------------------------------------------------------");
				System.out.println("Hurray, 10 points to " + user.getHouse());
				user.increasePoints();
				System.out.println("Your new score is " + user.getPoints());
				
			} else {
				System.out.println("Wrong answer, your score is still " + user.getPoints());
				}
		}
	
	
}
