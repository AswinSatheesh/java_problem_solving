package InterviewPrep;

import java.util.Arrays;

public class SecondLargestElement {
	public static void main(String[] args) {
		int[] arr = {10,6,2,4,30,2,17};
		
		//Using buit in method
//		Arrays.sort(arr);
//		
//		System.out.println("Second Largest element : "+ arr[arr.length-2]);
		
		//using bubble sort
		for(int i=0; i<arr.length; i++) {
			for(int j= i+1; j< arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		
		for(int res : arr) {
			System.out.println(res);
		}
		
		System.out.println("SeondLargest : " + arr[arr.length-2]);
		
		//{10,6,2,4,30,2,17, 30}; this condition will fail because after sort we have two 30 it will print 30 as second largest but 17 is largest.
		//use TreeSet 
		//first hashset add all these (not using put -> directly put values inside hashset) then bubble sort
	}
}
