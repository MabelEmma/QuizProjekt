package Projekt.Quiz;

public class Difficulty {


	//Ta bort klassen och lägg in detta i tex main direkt
	public void printDifficultyList() {
		String[] difficultys = {"1. Easy", "2. Medium", "3. Hard"};
		for (String difficulty : difficultys) {
			System.out.println(difficulty);
		}
		
	}

	String difficultyChoice;
	public void setDifficultyChoice(String difficultyChoice) {
		this.difficultyChoice = difficultyChoice;
	}

}
