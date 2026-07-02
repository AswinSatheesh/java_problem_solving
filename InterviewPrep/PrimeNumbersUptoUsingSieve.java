package InterviewPrep;

//The only numbers that turn true are the composite numbers (the numbers that have factors, like 4, 6, 8, 9, 10, 12, etc.).
//The numbers that never turn true—the ones that stay false until the very end—are the prime numbers themselves (like 2, 3, 5, 7, 11, 13, 17, 19).

public class PrimeNumbersUptoUsingSieve {
	public static void main(String[] args) {
		int num =20;
		boolean[] myBooleanPrimeArray = new boolean[num+1]; //we need from o to that num , otherwise 0 to 19 if 20 means. 
		
		for(int i=2; i*i <=num; i++) {
			if(!myBooleanPrimeArray[i]) {
				for(int j=i*i; j<=num; j += i) {
					myBooleanPrimeArray[j] = true;
				}
			}
		}
		
		for(int i=2; i<=num;i++) {
			if(!myBooleanPrimeArray[i]) {
				System.out.println("Prime Number : " +i);
			}
		}
		System.out.println();
		
	}
}
