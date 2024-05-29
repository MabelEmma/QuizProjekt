package Projekt.Quiz;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//En generics klass med typparameter T. 
//T är en subklass av User och kan vara vilken typ som helst som ärver från User.

public class UserManager<T extends User> {	
	
	//Hashmap som innehåller hashCodes för de användare som läggs till i listan.
	private HashMap<Integer, T> hashmap = new HashMap<>();

	    //Tar in parametern user av typen T och lägger till user i hashmap om hashkoden inte redan finns.
		public boolean addUser(T user) {
			if (!hashmap.containsKey(user.getHashCode())) {
	            hashmap.put(user.getHashCode(), user);
	            return true;
	        } else { //Skriver ut detta om hashkoden redan finns.
	            System.out.println("Username: " + user.getUsername() + " is already in: " + user.getHouse());
	            System.out.println("Pick a different name or a different house!");
				System.out.println("---------------------------------------------------------------------------");
	            return false;
	        }
	    }

		
	    //Metod som returnerar hela listan hashmap.
		public List<T> getAllUsers() {
	        return (List<T>) hashmap.values();
		}

		
	    //Metod som skriver ut all information om användarna i listan hashmap.
		public void printAllUsers() {
			for (T user : hashmap.values()) {
	            //Skriver ut namn, hus, poäng och hashcode
				System.out.println("Username: " + user.getUsername() + ", House: " + user.getHouse() + ", Points: " + user.getPoints() + ", Hashcode: " + user.getHashCode());
				}
	    }

}



