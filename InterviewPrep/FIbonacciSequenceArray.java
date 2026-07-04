package InterviewPrep;

import java.util.Arrays;

public class FIbonacciSequenceArray {
	public static void main(String[] args) {
		int num =10;
		int[] resArray = new int[num];
		resArray[0] = 0;
		resArray[1] = 1;
		
		for(int i=2; i<resArray.length;i++) {
			resArray[i] = resArray[i-1] + resArray[i-2];
		}
		
//		for(int arr : resArray) {
//			System.out.println(arr);
//		}
		
		System.out.println(Arrays.toString(resArray));
	}
}
