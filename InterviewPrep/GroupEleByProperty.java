package InterviewPrep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

//Input -> String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

/*output ->

 output : {

"aet": ["eat", "tea", "ate"],

"ant": ["tan", "nat"],

"abt": ["bat"]

} 

*/

public class GroupEleByProperty {
	public static void main(String[] args) {
		String[] wordsQues= {"eat","tea","tan","ate","nat","bat"};
		
		Map<String,List<String>> resultMap = new HashMap<>();
		
		for(String word : wordsQues) {
//			System.out.println(word);
			char[] indivdualWordArray = word.toCharArray();
			Arrays.sort(indivdualWordArray);
//			System.out.println(indivdualWordArray);
			
			String backToStringKey = new String(indivdualWordArray);
			
			resultMap.computeIfAbsent(backToStringKey, k -> new ArrayList<>()).add(word);
		}
		
		System.out.println(resultMap);
	}
}
