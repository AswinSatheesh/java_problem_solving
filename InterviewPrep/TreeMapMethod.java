package InterviewPrep;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapMethod {
	public static void main(String[] args) {
		TreeMap<Integer,String> myTree = new TreeMap<>();
		
		myTree.put(10, "Ten");
		myTree.put(1, "One");
		myTree.put(7, "Seven");
		
		System.out.println(myTree);
		
//		Map.Entry<Integer, String> firstVal = myTree.firstEntry();
//		System.out.println("Value : " + firstVal.getValue());
//		System.out.println("Key : " + firstVal.getKey());
//		
//		Map.Entry<Integer, String> lastEntry = myTree.lastEntry();
//		System.out.println("Key : " + lastEntry.getKey());
//		System.out.println("Value : " + lastEntry.getValue());
//		
		
		System.out.println(myTree.ceilingKey(7));
		System.out.println(myTree.floorKey(7));
		
		System.out.println(myTree.ceilingKey(2));
		System.out.println(myTree.floorKey(9));
	}
}
