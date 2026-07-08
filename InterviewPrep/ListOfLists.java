package InterviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfLists {
	public static void main(String[] args) {
		
		//question Array :
//		int[][] question= {{1,2},{3,4,5},{6}};
//		
//		List<Integer> resultList = new ArrayList<>();
//		
//		for(int i=0; i<question.length;i++) {
//			for(int j=0; j<question[i].length;j++) {
//				resultList.add(question[i][j]);
//			}
//		}
//		
//		System.out.println(resultList);
//		
//		question List<List>
//		List<List<Integer>> questionList = new ArrayList<>();
//		List<Integer> list1 = Arrays.asList(1,2,3);
//		List<Integer> list2 = Arrays.asList(4,5);
//		List<Integer> list3 = Arrays.asList(6);
//		
//		questionList.add(list1);
//		questionList.add(list2);
//		questionList.add(list3);
//		
//		System.out.println("Question : " +questionList);
//		
//		List<Integer> resultList = new ArrayList<>();
//		
//		for(int i=0; i< questionList.size(); i++) {
//			for(int j=0; j<questionList.get(i).size();j++) {
//				resultList.add(questionList.get(i).get(j));
//			}
//		}
//		
//		System.out.println("Answer : "+ resultList);
		
		//question List<List> (Cleanest Way)
		 
//		List<List<Integer>> questionList = List.of(List.of(1,2,3),List.of(4,5),List.of(6));
//		
//		System.out.println("Question using List.of() : "+ questionList);
//		
//		List<Integer> resultList = new ArrayList<>();
		
		//for Each
//		for(List<Integer> outerList : questionList) {
//			for(Integer num : outerList) {
//				resultList.add(num);
//			}
//		}
		
		//using built in addAll() with single loop
//		for(List<Integer> outer : questionList) {
//			resultList.addAll(outer);
//		}
//		
//		System.out.println("Result : " + resultList);
		
		//using Streams 
	List<List<String>> questionList = List.of(List.of("Aswin","Surya","Shinu"),List.of("Gokul"),List.of("Jai","Srihari"));
		
		
		System.out.println("Question : " + questionList);
		
		List<String> result = questionList.stream().flatMap((List<String> resultList)-> resultList.stream()).toList();
		//flatMap -> it expects you to give it a function that takes an item and turns it into a Stream.
		
		System.out.println(result);
	}
}


