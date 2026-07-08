package InterviewPrep;

//input : 0Aswin123
//output : number : 0123
//output : String : Aswin
public class ExtractNumberAndString {
	public static void main(String[] args) {
		String question = "0Aswin123";
		System.out.println(question);
		
		String number = question.replaceAll("[a-zA-Z]", "");
		String str = question.replaceAll("[^a-zA-Z]", "");
		
		int numberConvertion = Integer.valueOf(number);
		System.out.println(numberConvertion + 10);
		
		System.out.println("Number : "+ number);
		System.out.println("String : "+ str);
	}
}
