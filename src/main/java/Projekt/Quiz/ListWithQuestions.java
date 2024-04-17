package Projekt.Quiz;
//import java.util.ArrayList;
//import java.util.List;

//Här samlas alla frågor

//Skapa en array med frågorna.
//När jag skapar arrayen kan jag anropa konstruktorn i Questions.

public class ListWithQuestions {

	public void printQuestionsEasy() {
	
	String[]questionsEasy = new String[2]; {
	
		questionsEasy[0] = ("Which platform does the Hogwarts Express leave from?");
		questionsEasy[1] = ("Who stopped Harry and Ron from going through platform nine and three-quarters?");
	
	for (int i = 0; i < questionsEasy.length; i++) {
		System.out.println("Fråga " + i + ": " + questionsEasy[i]);
	}
	}
	}
	
	public void printQuestionsMedium() {
		
		String[]questionsMedium = new String[2]; {
		
			questionsMedium[0] = ("In which movie do dementors board the Hogwarts Express?");
			questionsMedium[1] = ("Where did Harry and Ron crash the flying car?");
		
		for (int i = 0; i < questionsMedium.length; i++) {
			System.out.println("Fråga " + i + ": " + questionsMedium[i]);
		}
		}

}
	
	public void printQuestionsHard() {
		
		String[]questionsHard = new String[2]; {
		
			questionsHard[0] = ("Who in the movies turned out to be a werewolf?");
			questionsHard[1] = ("Who killes Neville Longbottoms parents?");
		
		for (int i = 0; i < questionsHard.length; i++) {
			System.out.println("Fråga " + i + ": " + questionsHard[i]);
		}
		}

}
}