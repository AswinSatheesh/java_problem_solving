package InterviewPrep;

import java.util.Arrays;
//Two pointer swap metho : Most optimal solution
public class MoveAllZerosToEnd {
	public static void main(String[] args) {
		int[] arr = {0,1,0,3,12};
		
		System.out.println("Question : " + Arrays.toString(arr));
		
		int left=0;
		
		for(int right =0; right <arr.length; right++) {
			if(arr[right] !=0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
			}
		}
		
		
		System.out.println("After Swapping  : " + Arrays.toString(arr));
		
		
	}
}

//"Great job! Now, can you do this in-place? You are not allowed to create resultArr because it uses O(N) extra memory space.
//Can you modify the original arr instead?"