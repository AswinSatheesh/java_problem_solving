// ip = " Welcome to ooty" , op = "ooty to welcome"
package InterviewPrep;

public class ReverseWordInaSentence {
	public static void main(String[] args) {
		String sentence = "Aswin is name my";
		
		
		//step1 - remove white spaces from beginning and end - .trim()
//		sentence = sentence.trim();

		String[] sentenceArray = sentence.split("\\s+"); //split(" ") also fine
		
		StringBuilder reversedString = new StringBuilder();
		
		for(int i=sentenceArray.length -1; i >= 0; i--) {
			
			if(!sentenceArray[i].trim().isEmpty()) {	
				
//				reversedString.append(sentenceArray[i] + " ");
				reversedString.append(sentenceArray[i]).append(" ");
			}
		}
		
		System.out.println(reversedString.toString().trim());
	}
}
