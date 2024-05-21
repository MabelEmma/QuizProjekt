package Projekt.Quiz;

import java.util.ArrayList;
import java.util.List;

//UserManager blir en subklass av klassen User = ARV
//Använder mig av generics

//Skapa en generics klass med typparameter T. T är en subklass av User och kan vara vilken som helst typ som ärver från User.
public class UserManager<T extends User> {

	GenerateHashMap generateHashMap = new GenerateHashMap();
	
	
	//Skapas en privat ArrayList av typen T. Listan heter users och kommer innehålla objekt av typen T.
	private List<T> users = new ArrayList<>();

	    //Metod som tar in parametern user av typen T och lägger till user till listan users.
		public void addUser(T user) {
	        users.add(user);
	    }

	    //Metod som tar in parametern index av typen int. 
		public T getUser(int index) {
	        //returnerar elementet vid den angivna positionen i listan users.
			return users.get(index);
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
				generateHashMap.getHashCode(user);
	        }
	    }
	
	
	
}
