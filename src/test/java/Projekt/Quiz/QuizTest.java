package Projekt.Quiz;

import static org.junit.Assert.*;

//import java.util.ArrayList;
//import java.util.List;

import org.junit.Test;

public class QuizTest {

	@Test
	//Testa att användaren kan skriva in ett användarnamn
	public void testSetUsername() {
		User user = new User();
		String username = "Emma";
		user.setUsername(username);
		assertEquals(username, user.getUsername());
	}
	
	/*@Test
	Testa att användaren får upp olika alternativ beroende på val av svårighet
	public void testDifficultyOnQuestions() {
		Questions questions = new Questions();
		String[] questionsEasy = {"Which platform does the Hogwarts Express leave from?", "Who stopped Harry and Ron from going through platform nine and three-quarters?"};
		
	}*/
	
}
