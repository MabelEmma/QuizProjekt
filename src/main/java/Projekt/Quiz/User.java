package Projekt.Quiz;

import java.util.Objects;
import java.util.Scanner;

public class User {

	//INKAPSLING
	private String username;
	private int points;
	private String house;
	private Scanner scanner;
	
	
	private int hashCode; // Lägg till en instansvariabel för hashkoden
	
	
	//Konstruktor
	public User(String username) {
		this.username = username;
		this.points = 0;
		//Scanner är med i konstruktorn för att inte behöva återupprepas
		scanner = new Scanner(System.in);
		
        this.setHashCode(username.hashCode()); // Generera hashkod baserad på användarnamnet
	}
	
	
	@Override
    public int hashCode() {
		int result = 17; // Startvärde för hashkoden
			result = 31 * result + username.hashCode(); // Lägg till användarnamnets hashkod
			result = 31 * result + points; // Lägg till poängens hashkod
			result = 31 * result + house.hashCode(); // Lägg till husets hashkod
	return result;
    }

	public int getHashCode() {
		return hashCode;
	}

	public void setHashCode(int hashCode) {
		this.hashCode = hashCode;
	}
	

	@Override
	public boolean equals(Object obj) {
	    // Kontrollera om objektet är en instans av User-klassen
	    if (this == obj) {
	        return true; // Om objekten är samma objekt i minnet, är de lika
	    }
	    if (!(obj instanceof User)) {
	        return false; // Om objektet inte är en instans av User-klassen, är de inte lika
	    }
	    // Om objektet är en instans av User-klassen, jämför användarnamnen för likhet
	    User otherUser = (User) obj;
	    return Objects.equals(this.username, otherUser.username)
	            && this.points == otherUser.points
	            && Objects.equals(this.house, otherUser.house);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//INKAPSLING genom att instasvariablen username är privat och endast nås genom dessa get och set metoder.
	//Här nedan finns en funktion för att kunna hämta ett användnamn och placera det i variablen username.
	public void setUsername(String username) {
	
	//Kontrollera om användaren skrivit ogiltiga tecken
	try {
		if (username.matches(".*\\d+.*")) { // Kontrollera om namnet innehåller siffror
			 throw new IllegalArgumentException("Username can only contain letters.");
	    }
		
		this.username = username;
		
	} catch (IllegalArgumentException e) {
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
	
	
	//INKAPSLING genom att instasvariablen points är privat och endast nås genom dessa get och set metoder.
	//Funktion för att hämta poäng och placera i variabeln points
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
	
	
	//INKAPSLING genom att instasvariablen house är privat och endast nås genom dessa get och set metoder.
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
		
		//System.out.println("---------------------------------------------------------------------------");
	System.out.println("Hello " + this.username + "!" + " You have joined " +  this.house + ", and you have " + this.points + " points!");
	System.out.println("---------------------------------------------------------------------------");

	}
	
	
	//Metod som Hämtar och skriver ut hur många rätt användaren fick
    public void calculatePoints() {
	System.out.println("---------------------------------------------------------------------------");
	System.out.println("You got " + this.points + " points, out of 50 points!");
    System.out.println("---------------------------------------------------------------------------");
    }
	
    
	//Metod där användaren får välja hus
    //Valde att inte skapa enum av House då det blev mer och onödig kod.
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


	
	


}
	

