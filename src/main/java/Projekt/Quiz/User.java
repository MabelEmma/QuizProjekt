package Projekt.Quiz;

import java.util.Objects;
import java.util.Scanner;

public class User {

	//INKAPSLING
	private String username;
	private int points = 0;
	private String house;
	private int hashCode;
	private Scanner scanner;
	
	
	//Konstruktor
	public User() {
		//Scanner är med i konstruktorn för att inte behöva återupprepas
		//Säkerställer att varje User-objekt har sin egen Scanner-instans för inmatning, viktigt då varje användare förväntas göra egen inmatning.
		scanner = new Scanner(System.in);  
		}

	
	public void setHashCode(int hashCode) {
		this.hashCode = hashCode;
		}
	
	public int getHashCode() {
		return this.hashCode;
		}


	public void setUsername(String username) {
		//Kontrollera om användaren skrivit ogiltiga tecken
		try {
			if (username.matches(".*\\d+.*")) {
			 throw new IllegalArgumentException("Username can only contain letters.");
			}
		
		this.username = username;
		
		} 	catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				System.out.println("Please enter a username with only letters:");
				//Läs in ett nytt användarnamn från användaren och försök igen
				String newUsername = scanner.nextLine();
				setUsername(newUsername); //Anrop för att försöka sätta användarnamnet igen
	    	}
	}

	public String getUsername() {
		return username;
		}
	
	
	public void setPoints(int points) {
		if(points>= 0) {
			this.points = points;
			}	
	}
	
	public int getPoints() {
		return points;
		}
	
	public int increasePoints() {
		points += 10;
		return points;
		}
	

	public void setHouse(String house) {
		this.house = house;
		}

	public String getHouse() {
		return house;
		}

	
	//Skriv ut username, house och points
	public void printUsernameHousePoints() {
		
		System.out.println("Please enter your username: ");
		
		String username = scanner.nextLine(); 
		setUsername(username);
		
		//Anropar metoden nedanför där användaren väljer hus
		chooseHouse();
		
		//Sätter hashcode utifrån min hashcode metod.
		setHashCode(hashCode());
	}
	
	
	//Metod som Hämtar och skriver ut hur många rätt användaren fick
    public void calculatePoints() {
    	System.out.println("---------------------------------------------------------------------------");
    	System.out.println("You got " + this.points + " points, out of 50 points!");
    	System.out.println("---------------------------------------------------------------------------");
    	}
	
    
    
	//Metod där användaren får välja hus
	public void chooseHouse() {
		
		while(true) {	
			System.out.print("Which house do you join?");
			System.out.print("\n1. Gryffindor \n2. HufflePuff \n3. Ravenclaw \n4. Slytherin \n");
			String houseChoice = scanner.nextLine();
		
			switch (houseChoice) {
             case "1":
                 house = "Gryffindor";
                 return;
             case "2":
                 house = "Hufflepuff";
                 return;
             case "3":
                 house = "Ravenclaw";
                 return;
             case "4":
                 house = "Slytherin";
                 return;
             default:
                 System.out.println("You have to write a number between 1 - 4");
         }
		}
	}


	//Polymorfism
	//Skriver över default hashCode metoden med min egna hashCode metod.
	@Override
    public int hashCode() {
		int result = 17; //Startvärde för hashkoden
			result = 31 * result + username.hashCode(); //Lägger till användarnamnets hashkod
			result = 31 * result + house.hashCode(); //Lägger till husets hashkod
		return result;
    	}


	//Polymorfism
	//Skriver över default equals metoden med min egna equal metod.
	@Override
	public boolean equals(Object obj) {
	    //Kontrollera om objektet är en instans av User-klassen
	    if (this == obj) {
	        return true; //Om objekten är samma objekt i minnet, är de lika
	    	}
	    
	    if (!(obj instanceof User)) {
	        return false; //Om objektet inte är en instans av User-klassen, är de inte lika
	    	}
	    //Om objektet är en instans av User-klassen, jämför användarnamnen för likhet
	    User otherUser = (User) obj;
	    //&& används för att se till att både username och house måste stämma.
	    return Objects.equals(this.username, otherUser.username)
	            && Objects.equals(this.house, otherUser.house);
	}
	
	
	
}
	

