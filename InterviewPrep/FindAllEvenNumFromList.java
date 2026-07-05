package InterviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllEvenNumFromList {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(6,5,7,3,10,2);
		
		System.out.println("Question : "+ myList);
		
		List<Integer> resultList = findAllEvenFromList(myList);
		
		System.out.println("Using IF condition Result : "+ resultList);
		
		List<Integer> streamResult = findAllEvenUsingStreams(myList);
		System.out.println("Using Stream Result : "+ streamResult);	
	}
	
	public static List<Integer> findAllEvenFromList(List<Integer> myList) {
		List<Integer> returnList = new ArrayList<>();
		for(Integer res : myList) {
			if(res%2==0) {
				returnList.add(res);
			}
		}
		return returnList;
	}
	
	public static List<Integer> findAllEvenUsingStreams(List<Integer> myList){
		List<Integer> storeStreamResult = myList.stream().filter(val -> val %2 ==0).collect(Collectors.toList());
		return storeStreamResult;
	}
}
