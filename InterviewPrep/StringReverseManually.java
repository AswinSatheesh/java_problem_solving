package InterviewPrep;

import java.util.Arrays;

public class StringReverseManually {
	public static void main(String[] args) {
		String inputStr= "Malayalam";
		
		
		//convert this string into character array
		char[] charArray = inputStr.toCharArray();
		

		int left = 0;
		int right = charArray.length-1;
		
		System.out.println(left);
		System.out.println(right);
		
		while(left < right) {
			char temp = charArray[left];
			charArray[left]= charArray[right];
			charArray[right] = temp;
			
			left++;
			right--;
		}
		
		//to convert charArray to string - 2ways
//		String reversedString = new String(charArray); //using String constructor
		String reversedString = String.valueOf(charArray); // using valueOf() 
		
		System.out.println(reversedString.equalsIgnoreCase(inputStr));
		
//		System.out.println(charArray);
		String[] names = {"aswin","shinu"};
//		System.out.println(Arrays.toString(names)); //instead of using for loop we can pring using Arrays.toString(arrayName);
//		Arrays.stream(names).forEach(System.out::println); //another 
		
	}
}
