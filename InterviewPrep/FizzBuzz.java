package InterviewPrep;
//print multiple of 3 as 'Fizz', multiple of 5 as 'Buzz' and if multiple of both then 'FizzBuzz'

public class FizzBuzz {
	public static void main(String[] args) {
		
		for(int i=1; i<=20; i++) {
			if((i%3==0) & (i%5==0)) {
				System.out.println("FizzBuzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}else if(i%5==0) {
				System.out.println("Buzz");
			}else {				
				System.out.println(i);
			}
		}
	}
}
