package InterviewPrep;

import java.util.LinkedHashSet;

public class RemoveDuplicateChar_mySolu {
	public static void main(String[] args) {
		String name= "AswinSatheesh";
		
		removeDuplicates(name);
	}
	
	public static void removeDuplicates(String name) {
		char[] myChar = name.toCharArray();
//		System.out.println(myChar);
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(char val : myChar) {
			char lowerVal = Character.toLowerCase(val);
			set.add(lowerVal);
		}
		
//		System.out.println(set);
		StringBuilder str = new StringBuilder();
		
		for(Character result : set) {
			str.append(result);
		}
		
		System.out.println(str);
	}
}
