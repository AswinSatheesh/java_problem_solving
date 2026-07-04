package InterviewPrep;

public class SecondLargestNumberOptimalSol {
	public static void main(String[] args) {
		int[] arr= {5,1,9,3,7};
		
		findSecondLargestNumber(arr);
	}
	public static void findSecondLargestNumber(int[] arr) {
		if(arr.length <2) {
			System.out.println("Not a valid condition ");
		}
		
		int lastNumber = Integer.MIN_VALUE;
		int secondLastNumber = Integer.MIN_VALUE;
		
		for(int currentArrayVal : arr) {
			if(currentArrayVal > lastNumber) {
				secondLastNumber = lastNumber;
				lastNumber = currentArrayVal;
			}
			else if(currentArrayVal > secondLastNumber && currentArrayVal != lastNumber) {
				secondLastNumber = currentArrayVal;
			} 
		}
		
		System.out.println("Second Largest Element : " + secondLastNumber);
	}
}
