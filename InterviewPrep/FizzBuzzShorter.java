package InterviewPrep;

import java.util.stream.IntStream;

public class FizzBuzzShorter {
	public static void main(String[] args) {
//		IntStream.rangeClosed(1, 100).forEach(System.out::println);
		int n =20;
		IntStream.rangeClosed(1, n)
		.mapToObj(num -> num % 3==0 ? (num%5==0 ? "FizzBuzz" : "Fizz"):(num%5==0 ? "Buzz": String.valueOf(num)))
		.forEach(System.out::println);
		
	}
}
