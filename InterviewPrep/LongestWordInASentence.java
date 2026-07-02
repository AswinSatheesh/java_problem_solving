package InterviewPrep;

public class LongestWordInASentence {
	public static void main(String[] args) {
		String sentence = "This is my Sentence AswinSatheesh";
		
		String[] sentenceArray = sentence.split(" ");
		
		String maxWord = "";
		int maxVal =sentenceArray[0].length();
		for(int i=1; i<sentenceArray.length; i++) {
			int wordLen = sentenceArray[i].length();
			if(maxVal < wordLen) {
				maxVal = wordLen;
				maxWord = sentenceArray[i];
			}
		}
		
		System.out.println("Longest Word From Sentence : " + maxWord + " and Count : " +  maxVal);
	}
	
}
