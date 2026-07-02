package InterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
	public static void main(String[] args) {
		String[] names = {"Surya","Aswin","Gokul","Shinu","Aswin"};
		
		Map<String,Integer> mymap = new HashMap<>();
		
		for(String name : names) {
			mymap.merge(name, 1, (oldValue, newValue)-> oldValue + newValue);
		}
		
		System.out.println(mymap);
	}
}
