package Projekt.Quiz;

public class Difficulty {


	//Ta bort klassen och lägg in detta i tex main direkt
	public void printDifficultyList() {
		String[] difficultys = {"1. Lätt", "2. Medel", "3. Svår"};
		for (String difficulty : difficultys) {
			System.out.println(difficulty);
		}
		
	}

	String difficultyChoice;
	public void setDifficultyChoice(String difficultyChoice) {
		this.difficultyChoice = difficultyChoice;
	}

}
