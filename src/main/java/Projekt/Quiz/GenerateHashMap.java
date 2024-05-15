package Projekt.Quiz;

import java.util.HashMap;

public class GenerateHashMap {

public void getHashCode(User user) {
		
		HashMap<Integer, String> userMap = new HashMap<>();

		int userHashCode = user.hashCode();
		
		//Lägger till användarens hashkod och användarnamn i HashMap
		userMap.put(userHashCode, user.getUsername());
		
		//Sök efter användarens användarnamn genom att använda dess hashkod
		String username = userMap.get(userHashCode);
		
		//Skriver ut användarens namn och hashcode
		System.out.println(username + "´s Hashcode is: " + userHashCode);
	}
}
	
	
	

