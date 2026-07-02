package collections;

public class Bank{
	public static void main(String[] args) {
		double balance =1000;
		double withdrawAmount = 5000;
		
		if(balance < withdrawAmount) {
			throw new InsufficientException("Not enough Balance");
		}
		
		System.out.println("Withdrawel scuccessfull");
	}
}