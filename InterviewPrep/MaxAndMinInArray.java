package InterviewPrep;

import java.util.Arrays;

public class MaxAndMinInArray {
	public static void main(String[] args) {
		int[] intArray = {6,9,2,90,3};
		
		//Using Streams
//		System.out.println("Min : "+ Arrays.stream(intArray).min().getAsInt());//Optional wrapper -> so use .getAsInt()
//		System.out.println("Max : "+ Arrays.stream(intArray).max().getAsInt()); 
//		
		
		//Using built in method
//		Arrays.sort(intArray);
//		System.out.println("Min : "+ intArray[0]);
//		System.out.println("Max : "+ intArray[intArray.length-1]);
		
		//using Traditional Loop
		int min = intArray[0];
		int max = intArray[0];
		
		for(int i=1; i<intArray.length; i++) { //we start from 1 . not from 0th (zeroth already considered as min & max)
			if(intArray[i] < min) {
				min = intArray[i];
			}
			if(intArray[i] > max) {
				max = intArray[i];
			}
		}
		
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
		
	}
}
