package InterviewPrep;

import java.util.Arrays;

public class TwoSumBruteForce {
	public static void main(String[] args) {
		int[] arr = {2,7,11,15,15,26};
		int target =22;
		
		int[] result = new int[2];
		
		for(int i=0; i< arr.length; i++) {
			int checker = target - arr[i];
			for(int j=i+1; j <arr.length; j++) {
				if(arr[j] == checker) {
					result[0] = i;
					result[1] =j;
				}
			}
		}
		
		System.out.println(Arrays.toString(result));
	}
}
