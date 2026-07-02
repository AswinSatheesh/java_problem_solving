package InterviewPrep;

import java.util.Arrays;

public class AnagramsTwoString {
	public static void main(String[] args) {
		String n1 = "listen";
		String n2 = "silent";
		
		char[] str1 = n1.toCharArray();
		char[] str2 = n2.toCharArray();
		
		Arrays.sort(str1);
		System.out.println(str1);
		
		Arrays.sort(str2);
		System.out.println(str2);
		
		System.out.println(Arrays.equals(str1, str2) ? "Both are Anagrams" : "Not Anagrams");
	}
}
