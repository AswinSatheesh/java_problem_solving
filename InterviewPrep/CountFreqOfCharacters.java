//Aswin Satheesh - A-2,S-3,w-1,i-1,n-1,t-1,h-2,e-2

package InterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class CountFreqOfCharacters {
	public static void main(String[] args) {
		String question= "Aswin Satheesh";
		
		//step1 - convert string to character array
		//step2 - create hashmap and put each char along with take count
		
		char[] characterArray = question.toCharArray();
//		System.out.println(characterArray);
		
		Map<Character,Integer> myMap = new HashMap<>();
		
		for(int i=0; i<characterArray.length; i++) {
			if(Character.isLetter(characterArray[i])) {
				
				char lowerChar = Character.toLowerCase(characterArray[i]);
				if(!myMap.containsKey(lowerChar)) {
					myMap.put(lowerChar, 1);
				}else {
					myMap.put(lowerChar,(myMap.get(lowerChar) +1));
				}
			}
		}
		
		myMap.forEach((key,value) -> {
			System.out.println("Key: " + key + ", value : " + value);
		});
	}
}
