package collections;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ArrayListPrac {
	public static void main(String[] args) {
		ArrayList<Object> myArrayList = new ArrayList<Object>();
		myArrayList.add("Aswin");
		myArrayList.add("Satheesh");
		myArrayList.add(10);
		
		
//		System.out.println(myArrayList);
		
		HashSet<String> obj = new HashSet<String>();
		
		obj.add("Zne");
		obj.add("Two");
		
//		System.out.println(obj);
		
		HashMap<Integer,String> myHashMap = new HashMap<Integer,String>();
		myHashMap.put(1, "Satheesh");
		myHashMap.put(2, "V T");
		myHashMap.put(1, "SatheeshKumar");
		
//		System.out.println(myHashMap);
//		Iterator<String> res = obj.iterator();
//		while(res.hasNext()) {
//			System.out.println(res.next());
//		}
		
		ConcurrentHashMap<Integer,String> hashm = new ConcurrentHashMap<>();
		hashm.put(100, "Aswin");
		hashm.put(102, "Surya");
		
//		System.out.println(hashm.get(100));
		
		List<Integer> newlist = new ArrayList<Integer>();
		newlist.add(0,10);
		newlist.add(0,20);
		System.out.println(newlist);
	}
}
