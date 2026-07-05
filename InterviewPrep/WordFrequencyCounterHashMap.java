package InterviewPrep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounterHashMap {
	public static void main(String[] args) {
		String question = "The cat chased the mouse, and the mouse ran away.";
		
//		String[] words = question.split(" ");
		String[] words = question.split("[^a-zA-Z0-9]+");
		
		System.out.println(Arrays.toString(words));
		
		Map<String,Integer> myMap = new HashMap<>();
		
		for(String word : words) {
			String lowercase = word.toLowerCase();
			myMap.put(lowercase, myMap.getOrDefault(lowercase, 0)+1);
		}
		System.out.println("Hashmap : " +myMap);
	}
}
