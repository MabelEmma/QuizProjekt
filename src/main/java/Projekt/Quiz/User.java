package Projekt.Quiz;

import java.util.Scanner;

//import java.util.Scanner;

public class User {

	private String username;
	private int points;
	private String house;
	
	
	//Konstruktor
	public User(String username) {
		this.username = username;
		points = 0;
	}
	
	//Här nedan finns en funktion för att kunna hämta ett användnamn och placera det i variablen username.
	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}
	
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
	
	
	Scanner scanner = new Scanner(System.in);
	
	//Skriv ut username, house och points¨
	public void printUsernameHousePoints() {
		
		System.out.println("Please enter your username: ");
		
		String username = scanner.nextLine(); 
		setUsername(username); 
		
	while(true) {	
		System.out.print("Which house do you join?");
		System.out.print("\n1. Gryffindor \n2. HufflePuff \n3. Ravenclaw \n4. Slytherin \n");
		String houseChoice = scanner.nextLine();
	
		if (houseChoice.equals("1")) {
			house = "Gryffindor";
			break;
		}
		
		else if (houseChoice.equals("2")) {
			house = "Hufflepuff";
			break;
		}
		
		else if (houseChoice.equals("3")) {
			house = "Ravenclaw";
			break;
		}
		
		else if (houseChoice.equals("4")) {
			house = "Slytherin";
			break;
		}
		
		else {
			System.out.println("You have to write a number between 1 - 4");
			continue;
		}
	}
		
		System.out.println("-----------------------------------");	
	System.out.println("Hello " + this.username + "!" + " You have joined " +  this.house + ", and you have " + this.getPoints() + " points!");
		System.out.println("-----------------------------------");

	}
	
	public void setHouse(String house) {
		this.house = house;
	}

	public String getHouse() {
		return house;
	}
	
	
	/*public void printUsername() {
	Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your username: ");
	
		String username = scanner.nextLine(); 
		this.setUsername(username); 
		System.out.println("Hello " + username + "!" + " You have");
	
	scanner.close();
	}*/


}
	

