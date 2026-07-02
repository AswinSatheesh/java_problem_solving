package InterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class CountFreqOfCharactersShorter {
	public static void main(String[] args) {
		String name = "Aswin Satheesh";
		
		 char[] convertedCharArray = name.toCharArray();
		 
		 Map<Character,Integer> storeVal = new HashMap<Character,Integer>();
		 
		 for(int i=0; i<convertedCharArray.length;i++) {
			 
			 if(Character.isLetter(convertedCharArray[i])) {
				 
				 char lowerCaseVal = Character.toLowerCase(convertedCharArray[i]);
				 
				 //if lowerCaseVal exists then take its value or temporary set 0 and then while we put to map add +1, if already exists means add count one more.
				 storeVal.put(lowerCaseVal, storeVal.getOrDefault(lowerCaseVal, 0) +1);
			 }
		 }
		 
		 storeVal.forEach((key,value)->{
			 System.out.println("Key : "+ key + " ->  value : " + value);
		 });
	}
}



// using merge method

//for(char charName : convertedCharArray) {
//	 storeVal.merge(charName,1, (oldvalue,newvalue) -> oldvalue+newvalue);
//}
//
//System.out.println(storeVal);