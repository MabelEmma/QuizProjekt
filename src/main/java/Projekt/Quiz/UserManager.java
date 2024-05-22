package Projekt.Quiz;

import java.util.ArrayList;
import java.util.List;

//En generics klass med typparameter T. 
//T är en subklass av User och kan vara vilken typ som helst som ärver från User.

public class UserManager<T extends User> {	
	
	//Skapas en privat ArrayList av typen T. Listan heter users och kommer innehålla objekt av typen T.
	private List<T> users = new ArrayList<>();
	
	//Arraylist som innehåller hashCodes för de användare som läggs till i users listan. Sparas som Integer.
	private List<Integer> hashedUsers = new ArrayList<>();
	

	    //Tar in parametern user av typen T och lägger till user i users om hashkoden inte redan finns i listan hashedUsers.
		public boolean addUser(T user) {
			if (!hashedUsers.contains(user.hashCode())) { //Kontroll av hashkoden
	            users.add(user); //Lägger till user i users
	            hashedUsers.add(user.hashCode()); //Lägg till hashkoden i listan hashedUser
	            return true;
	        } else { //Skriver ut detta om hashkoden redan finns.
	            System.out.println("Username: " + user.getUsername() + " is already in: " + user.getHouse());
	            System.out.println("Pick a different name or a different house!");
				System.out.println("---------------------------------------------------------------------------");
	            return false;
	        }
	    }

		
	    //Metod som returnerar hela listan users.
		public List<T> getAllUsers() {
	        return users;
		}

		
	    //Metod som skriver ut all information om användarna i listan users.
		public void printAllUsers() {
	        //for-each loop som ser över varje user i listan users.
			for (T user : users) {
	            //Skriver ut namn, hus, poäng och hashcode
				System.out.println("Username: " + user.getUsername() + ", House: " + user.getHouse() + ", Points: " + user.getPoints() + ", Hashcode: " + user.getHashCode());
				}
	    }

}



