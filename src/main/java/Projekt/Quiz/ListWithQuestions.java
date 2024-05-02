package Projekt.Quiz;
//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;
import java.util.Scanner;

//Här samlas alla frågor

//Skapa en array med frågorna.
//När jag skapar arrayen kan jag anropa konstruktorn i Questions.

public class ListWithQuestions {
	
	Scanner scanner = new Scanner(System.in);
	
	//Metod som skriver ut alla lätta frågor i en specifik ordning. Anropar denna metod i main.
	public int choiceEasy(User user) {
				
				// Anropar en metod som skriver ut fråga 1
				Questions question1 = new Questions("Which platform does the Hogwarts Express leave from?",
						Arrays.asList("Nine and three-quarters", "Ten and a half", "Nine and four-quartes"), "1");
				question1.printQuestion("Question 1: ");

				// Kollar vad användaren skrivit in och anropar en metod som ser om det är rätt
				// eller fel.
				String question1Choice = scanner.nextLine();
			
				question1.checkAnswer(question1Choice, user);
				

				System.out.println("-----------------------------------");

				Questions question2 = new Questions("Who stopped Harry and Ron from going through platform nine and three-quarters?",
						Arrays.asList("Duddly", "Dobby", "Malfoy"), "2");
				question2.printQuestion("Question 2: ");

				String question2Choice = scanner.nextLine();
				question2.checkAnswer(question2Choice, user);

				System.out.println("-----------------------------------");

				Questions question3 = new Questions("In which movie do dementors board the Hogwarts Express?",
						Arrays.asList("First movie", "Second movie", "Third movie"), "3");
				question3.printQuestion("Question 3: ");

				String question3Choice = scanner.nextLine();
				question3.checkAnswer(question3Choice, user);
				
				System.out.println("-----------------------------------");

				Questions question4 = new Questions("Where did Harry and Ron crash the flying car?",
						Arrays.asList("The lake", "Whomping Willow", "Forbidden forrest"), "2");
				question4.printQuestion("Question 4: ");

				String question4Choice = scanner.nextLine();
				question4.checkAnswer(question4Choice, user);
				
				System.out.println("-----------------------------------");

				Questions question5 = new Questions("Who in the movies turned out to be a werewolf?",
						Arrays.asList("Remus Lupin", "Sirius Black", "Severus Snape"), "1");
				question5.printQuestion("Question 5: ");

				String question5Choice = scanner.nextLine();
				question5.checkAnswer(question5Choice, user);
				
				return user.getPoints();
	}
	
	
	//Metod som skriver ut alla medium frågor i en specifik ordning. Anropar denna metod i main.
	public int choiceMedium(User user) {
					// Anropar en metod som skriver ut fråga 1
					Questions question1 = new Questions("What are the words that wipe the Marauder's Map blank?",
							Arrays.asList("I solemnly swear I am up to no good", "Mischief managed", "I stuck Mrs. Norris in a suit of armor"), "2");
					question1.printQuestion("Question 1: ");

					// Kollar vad användaren skrivit in och anropar en metod som ser om det är rätt
					// eller fel.
					String question1Choice = scanner.nextLine();
					question1.checkAnswer(question1Choice, user);

					System.out.println("-----------------------------------");

					Questions question2 = new Questions("Who does everyone think harry resembles the most?",
							Arrays.asList("Voldemort", "Hagrid", "His mom"), "3");
					question2.printQuestion("Question 2: ");

					String question2Choice = scanner.nextLine();
					question2.checkAnswer(question2Choice, user);
					
					System.out.println("-----------------------------------");

					Questions question3 = new Questions("What is Gringotts?",
							Arrays.asList("Bank", "Candy store", "a village outside Hogwarts"), "1");
					question3.printQuestion("Question 3: ");

					String question3Choice = scanner.nextLine();
					question3.checkAnswer(question3Choice, user);
					
					System.out.println("-----------------------------------");

					Questions question4 = new Questions("Who is Harry bringing to the Yule Ball?",
							Arrays.asList("Luna Lovegood", "Cho Chang", "Parvati Patil"), "3");
					question4.printQuestion("Question 4: ");

					String question4Choice = scanner.nextLine();
					question4.checkAnswer(question4Choice, user);
					
					System.out.println("-----------------------------------");

					Questions question5 = new Questions("What is the name of Weaslys house?",
							Arrays.asList("Weasly-castle", "The dragon's nest", "The Burrow"), "3");
					question5.printQuestion("Question 5: ");

					String question5Choice = scanner.nextLine();
					question5.checkAnswer(question5Choice, user);
					
					return user.getPoints();
		}
	

	//Metod som skriver ut alla medium frågor i en specifik ordning. Anropar denna metod i main.
		public int choiceHard(User user) {
						// Anropar en metod som skriver ut fråga 1
						Questions question1 = new Questions("What is the name of the wizard newspaper?",
								Arrays.asList("The Daily Prophet", "Wizard news", "The Daily newspaper"), "1");
						question1.printQuestion("Question 1: ");

						// Kollar vad användaren skrivit in och anropar en metod som ser om det är rätt
						// eller fel.
						String question1Choice = scanner.nextLine();
						question1.checkAnswer(question1Choice, user);

						System.out.println("-----------------------------------");

						Questions question2 = new Questions("Which Hogwarts house was Cedric Diggory part of?",
								Arrays.asList("Gryffindor", "HufflePuff", "Slytherin"), "2");
						question2.printQuestion("Question 2: ");

						String question2Choice = scanner.nextLine();
						question2.checkAnswer(question2Choice, user);
						
						System.out.println("-----------------------------------");

						Questions question3 = new Questions("What job do Hermione’s parents have?",
								Arrays.asList("Works at the Ministry of Magic", "Professors at Hogwarts", "Dentists"), "3");
						question3.printQuestion("Question 3: ");

						String question3Choice = scanner.nextLine();
						question3.checkAnswer(question3Choice, user);
						
						System.out.println("-----------------------------------");

						Questions question4 = new Questions("What potion do you drink if you want good luck?",
								Arrays.asList("Aging Potion", "Felix Felicis", "Polyjuice Potion"), "2");
						question4.printQuestion("Question 4: ");

						String question4Choice = scanner.nextLine();
						question4.checkAnswer(question4Choice, user);
						
						System.out.println("-----------------------------------");

						Questions question5 = new Questions("What was in Hermione's hand when she was petrified?",
								Arrays.asList("A photo", "A piece of paper", "A flower"), "2");
						question5.printQuestion("Question 5: ");

						String question5Choice = scanner.nextLine();
						question5.checkAnswer(question5Choice, user);
						
						return user.getPoints();
			}
	
	
	
				
}			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				/*public void printQuestionsEasy() {

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
			}*/

	
