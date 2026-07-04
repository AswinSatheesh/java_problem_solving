package InterviewPrep;

import java.util.ArrayList;

public class FibonacciSequence {
	public static void main(String[] args) {
		int num =8;
		
		int first =0;
		int second = 1;
		int sum =0;
		
		ArrayList<Integer> myArr = new ArrayList<>();
		myArr.add(first);
		myArr.add(second);
		for(int i=2; i<num; i++) {
			sum = first + second;
			first = second;
			second = sum;
			myArr.add(sum);
		}
		
//		System.out.println(sum); //to find the nth fibanocii number return the sum and make sure in loop i<=num (less than or equal)
		for(int val : myArr) {
			System.out.println(val);
		}
	}
}
