package Projekt.Quiz;

import static org.junit.Assert.*;

//import java.util.ArrayList;
//import java.util.List;

import org.junit.Test;

public class QuizTest {

	@Test
	//Testa att användaren kan skriva in ett användarnamn
	public void testSetUsername() {
		User user = new User("testUser");
		String username = "Emma";
		user.setUsername(username);
		assertEquals(username, user.getUsername());
	}
	
	
	@Test
	//Testar att poängen är 0 vid start.
	public void testStartPoints() {
		User user = new User("testGubbe");
		assertEquals(0, user.getPoints());
	}
	
	@Test
	//Testar att det finns en metod som ökar poängen med 10 poäng.
    public void testIncreasePoints() {
        User user = new User("testUser");
        user.increasePoints();
        assertEquals(10, user.getPoints());
    }

	@Test
	//Testar att det går att välja ett hus
	public void testSetHouse() {
		User user = new User("testUser");
		String house = "Hufflepuff";
		user.setHouse(house);
		assertEquals(house, user.getHouse());
	}
	
	@Test
	//Testar så att det är rätt sökväg
	public void testReadFile() {
		Quiz quiz = new Quiz();
		assertEquals("./src/main/java/Projekt/Quiz/Questions.json", quiz.getFilePath());

	}
	
}
