package InterviewPrep;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByValues {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("Aswin", 133);
		map.put("Zop", 130);
		map.put("B", 131);
		
		System.out.println(map);
//		Map<String,Integer> SortedResultMap = map.entrySet().stream()
//				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->oldValue,LinkedHashMap::new));
//		System.out.println("Ascending : " + SortedResultMap);
		
		List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
		entries.sort((a,b)-> b.getValue() - a.getValue());
		
		System.out.print(entries);
		
	}
	
}
