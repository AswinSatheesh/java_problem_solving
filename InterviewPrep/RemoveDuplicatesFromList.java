package InterviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromList {
	public static void main(String[] args) {
		
		//Integer list
		
//		List<Integer> questionList = new ArrayList<>(Arrays.asList(1,3,2,3,1,4,2));
//		
//		System.out.println("Question : " + questionList);
//		
//		List<Integer> newList = new ArrayList<>();
//		
//		for(Integer list : questionList) {
////			System.out.println(list);
//			if(!newList.contains(list)) {
//				newList.add(list);
//			}
//		}
//		
//		System.out.println("Answer : " + newList);
		
		//String list
		
		List<String> questionList = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange"));
		
		System.out.println("Question : " + questionList);
		
		List<String> newList = new ArrayList<>();
		
		for(String list : questionList) {
//			System.out.println(list);
			if(!newList.contains(list)) {
				newList.add(list);
			}
		}
		
		System.out.println("Answer : " + newList);
	}
}
