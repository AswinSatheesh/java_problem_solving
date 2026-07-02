package InterviewPrep;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String input = "aabbccee";
		
		firstNonRepeatingCharacter(input);
	}
	
	public static void firstNonRepeatingCharacter(String input) {
		char[] myChar = input.toCharArray();
		
//		System.out.println(myChar);
		
		LinkedHashMap<Character,Integer> myHashMap = new LinkedHashMap<>();
		for(Character eachChar : myChar) {
			myHashMap.put(eachChar, myHashMap.getOrDefault(eachChar, 0) +1);
		}
		
		System.out.println(myHashMap);
		
		boolean availableOrNot = false;
		for(Map.Entry<Character, Integer> result : myHashMap.entrySet()) {
//			System.out.println(result);
			if(result.getValue() == 1) {
				System.out.println("Key : "+ result.getKey() + " Value : " + result.getValue());
				availableOrNot = true;
				break;
			}
		}
		
		if(!availableOrNot) {
			System.out.println(-1);
		}
	}
}
