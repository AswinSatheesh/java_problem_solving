package InterviewPrep;

public class ReverseAString {
	public static void main(String[] args) {
		String question = "RACECAR";
		char[] splitted = question.toCharArray();
		
		System.out.println("Question : "+question);
		
		StringBuilder sc = new StringBuilder();
		
		
		for(int i= splitted.length-1; i>=0; i--) {
//			System.out.print(splitted[i]);
			sc.append(splitted[i]);
		}
		
		System.out.println("Reverse :" + sc);
		System.out.println(question.equals(sc.toString()));
	}
}
