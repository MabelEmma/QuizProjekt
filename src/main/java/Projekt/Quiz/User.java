package Projekt.Quiz;

import java.util.Scanner;

public class User {

	//INKAPSLING
	private String username;
	private int points;
	private String house;
	private Scanner scanner;
	
	//Konstruktor
	public User(String username) {
		this.username = username;
		this.points = 0;
		//Scanner är med i konstruktorn för att inte behöva återupprepas
		scanner = new Scanner(System.in);
	}
	
	//INKAPSLING genom att instasvariablen username är privat och endast nås genom dessa get och set metoder.
	//Här nedan finns en funktion för att kunna hämta ett användnamn och placera det i variablen username.
	public void setUsername(String username) {
		this.username = username;
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
		
		System.out.println("-----------------------------------");	
	System.out.println("Hello " + this.username + "!" + " You have joined " +  this.house + ", and you have " + this.getPoints() + " points!");
		System.out.println("-----------------------------------");

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
	
	


}
	

