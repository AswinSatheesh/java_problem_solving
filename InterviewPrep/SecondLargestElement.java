package InterviewPrep;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class SecondLargestElement {
	public static void main(String[] args) {
		Integer[] arr = {10};
		
		//method1 : Using buit in method
//		Arrays.sort(arr);
//		
//		System.out.println("Second Largest element : "+ arr[arr.length-2]);
		
		
		//Method2 :
		//using bubble sort -but if we have last number duplicate then second last ele will show same(not correct).
//		for(int i=0; i<arr.length; i++) {
//			for(int j= i+1; j< arr.length; j++) {
//				if(arr[i] > arr[j]) {
//					int temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}
		
//		System.out.println("SeondLargest : " + arr[arr.length-2]);
		
		
		
		//{10,6,2,4,30,2,17, 30}; this condition will fail because after sort we have two 30 it will print 30 as second largest but 17 is largest.
		//use TreeSet 
		//first hashset add all these (not using put -> directly put values inside hashset) then bubble sort
		
		//Method2 : We use TreeSet
		
		
		
		//rather than using add each time inside forloop - use either 'Collections.addAll(setname,arrayname)' or Using Constructor (Arrays.asList())
		
		//Method1 = primitive arrays it will not work -int[], use Integer[]
//		TreeSet<Integer> myTreeSet = new TreeSet<>();
//		Collections.addAll(myTreeSet, arr);
//		
//		System.out.println(myTreeSet);
//		
		//Method2
		TreeSet<Integer> myTreeSet = new TreeSet<>(Arrays.asList(arr));
		System.out.println(myTreeSet);
		
		
		//Now set is in ascending order - need to take the second last element
		// last() method finds the Highest element -last element
		// lower() method will instantly retrieves the next highest element
		// always use if with size > 2 : if array is empty or size one - throws null.
		
		if(myTreeSet.size() >= 2) {
			int secondLastElem = myTreeSet.lower(myTreeSet.last());
			System.out.println(secondLastElem);
		}
		
		
		
	}
}
