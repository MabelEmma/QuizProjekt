package Projekt.Quiz;

import static org.junit.Assert.*;

import java.util.Arrays;

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
	
	
	@Test
	//Testar att poängen är 0 vid start.
	public void testStartPoints() {
		User user = new User();
		assertEquals(0, user.getPoints());
	}
	
	
	@Test
	//Testar att det finns en metod som ökar poängen med 10 poäng.
    public void testIncreasePoints() {
        User user = new User();
        user.increasePoints();
        assertEquals(10, user.getPoints());
    }

	
	@Test
	//Testar att det går att välja ett hus
	public void testSetHouse() {
		User user = new User();
		String house = "Hufflepuff";
		user.setHouse(house);
		assertEquals(house, user.getHouse());
	}
	
	
	@Test
	//Testar att det är rätt sökväg
	public void testReadFile() {
		Quiz quiz = new Quiz();
		assertEquals(Quiz.filePath, quiz.getFilePath());
	}
	
	
	@Test
	//Testar att det är rätt svar då fler svar kan vara rätt samt ökar poängen vid rätt svar
	public void testMultiChoice() {
		MultiChoiceQuestion mcq = new MultiChoiceQuestion();
		User user = new User();
		
			mcq.setAnswers(Arrays.asList("1", "2"));
			mcq.checkAnswer("1", user);
			assertEquals(10, user.getPoints());
			mcq.checkAnswer("2", user);
			assertEquals(20, user.getPoints());
			mcq.checkAnswer("3", user);
			assertEquals(20, user.getPoints());
	}
}
