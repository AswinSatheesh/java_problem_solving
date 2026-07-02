package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Set<Number> myset = new HashSet<>();
		
		myset.add(1);
		myset.add(1);
		myset.add(10);
		myset.add(11);
		
//		for(Number res : myset) {
//			System.out.println(res);
//		}
		
		Iterator<Number> itr = myset.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
