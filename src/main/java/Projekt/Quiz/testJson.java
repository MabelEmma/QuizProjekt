
//Vad är meningen med denna klass? Vad har den för nytta? Borde jag ha någon parser?


package Projekt.Quiz;
import java.util.List;

public class testJson {

	    private String question;
	    private List<String> choices;
	    private String answer;
	    
	    //Konstruktor
	    public testJson(String question, List<String> choices, String answer) {
	    	this.question = question;
	    	this.choices = choices;
	    	this.answer = answer;
	    }
	    
	    public testJson() {}
	    
	    // Getter och setter-metoder här
	    
	    public void setQuestion(String question) {
	    	this.question = question;
	    }
	    
	    public String getQuestion() {
	    	return question;
	    }
	    
	    public void setChoices(List<String> choices) {
	    	this.choices = choices;
	    }
	    
	    public List<String> getChoices() {
	    	return choices;
	    }
	    
	    public void setAnswer(String answer) {
	    	this.answer = answer;
	    }
	    
	    public String getAnswer() {
	    	return answer;
	    }
	  
	
	  //Representerar metoden questions en lista av frågor. 
		//Denna metod är avsedd att lagra en samling av frågor som finns i din quizzapplikation.
		public class QuestionList {
		    private List<testJson> questions;

		    // Getter och setter-metoder här
		    public void setQuestions(List<testJson> questions) {
		    	this.questions = questions;
		    }
		    
		    public List<testJson> getQuestions() {
		    	return questions;
		    }
		}

}

	


