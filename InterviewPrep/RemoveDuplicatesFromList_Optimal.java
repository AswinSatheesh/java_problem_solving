package InterviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesFromList_Optimal {
	public static void main(String[] args) {
		List list = Arrays.asList(1,3,2,3,1,4,2);
		System.out.println("Question : " + list);
		
		List uniqueVal = new ArrayList<>(new LinkedHashSet<>(list));
		
		System.out.println("Answer in Single line : "+ uniqueVal);
		
	}
}
