package InterviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelsAndConsonentsCount {
	public static void main(String[] args) {
		String name = "ASWIN SATHEESH";
		//output : Vowels - 5, consonents - 8;
		
//		ArrayList<Character> myList = new ArrayList<>();
//		List<Character> myList = new ArrayList<>(Arrays.asList('A','E','I','O','U')); //resizable list
		List<Character> myList = Arrays.asList('A','e','I','o','U'); //fixed size list
//		myList.add('A');
//		myList.add('E');
//		myList.add('I');
//		myList.add('O');
//		myList.add('U');
		
		//making List values lowercase
//		for(int i=0; i<myList.size();i++) {
//			myList.set(i, Character.toLowerCase(myList.get(i)));
//		}
		
		//simpler using streams
		myList = myList.stream().map(Character::toLowerCase).toList();
		
 		int vowelCount =0;
		int consonentCount =0;
		for(char val : name.toCharArray()) {
			if(Character.isLetter(val)) {				
				if(myList.contains(Character.toLowerCase(val)) ) {
					vowelCount++;
				}else {
					consonentCount++;
					
				}
			}

		}
		
		System.out.println("Vowels Count : "+ vowelCount);
		System.out.println("Consonents Count : " + consonentCount);
		
	}
}
