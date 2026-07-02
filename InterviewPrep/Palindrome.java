package InterviewPrep;

public class Palindrome {
	public static void main(String[] args) {
		int num =121;
		String val = "LeveL";
		
		StringBuffer str = new StringBuffer(val);
//		StringBuilder resultString = str.reverse();
		StringBuffer resultString = str.reverse();
		
		
		System.out.println(resultString.toString().equals(val) ? "Palindrome" : "Not Palindrome");
		boolean result = checkPalindrome(num);
		if(result) {
			System.out.println("Given Number is Palindrome : " + result);
		}else {
			System.out.println("Given Number is Not a  Palindrome : " + num);
		}
	}
	
	public static boolean checkPalindrome(int num) {
		int orgNum =num;
		int reversed =0;
		
		while(num >0) {
			int temp = num % 10;
			reversed = (reversed *10) + temp;
			num = num/10;
		}
		
		if(reversed == orgNum) {
			return true;
		}else {
			return false;
		}
	}
}
