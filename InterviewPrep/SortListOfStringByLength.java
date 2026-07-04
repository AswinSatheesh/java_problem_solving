package InterviewPrep;
//Filter by length ,sort by length first, and then alphabetically for items with the same length
//if two items have the exact same length, they must keep the same relative order they had in the original list.
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfStringByLength {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Elephent","Cat","Banana","hi","day","cal");
		System.out.println("Original : " + list);
		
		//Method1 using streams
		
//		List<String> resultSortedList = list.stream()
//				.sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
//		
//		System.out.println("Sorted using Streams : "+ resultSortedList);
		
		//Method2 - same List modify using Collection.sort()
		
		Collections.sort(list,new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length()- s2.length();
			}
		});
		
		System.out.println("Using Collections sort : ");
		System.out.println(list);
	}
}
