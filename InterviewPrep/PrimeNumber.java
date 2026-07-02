package InterviewPrep;

//The Factors Always Comes in Pairs
/*  
 *  2 x 18=36
 *  3 x 12 =36
 *  4 x 9 =36
 *  6 x 6 =36
 *  9 x 4 = 36
 *  12 x 3 = 36
 *  18 x 2 = 36 Look closely at what happens after the square root (6 x 6) -> pairs just reverse and repeat themselves, so 
 *  take till i < square root of value
 * */

import java.util.Scanner;

//2,3,5,7,11..

public class PrimeNumber {
	static boolean isPrimeNumb(int num) {
		if(num <= 1) {
			return false;
		}
//		for(int i=2; i<num;i++) {
//			if(num % i ==0) {
//				return false;
//			}
//		}
		for(int i=2; i<Math.sqrt(num);i++) {  //so use squareroot
			if(num % i ==0) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int num =sc.nextInt();
		sc.nextLine();
		boolean result = isPrimeNumb(num);
		
		if(result) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}
	}
}
