package Java8;
import java.util.*;

public class Filtering {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		
		nameList.add("Aswin");
		nameList.add("Evan");
		nameList.add("Amal");
		nameList.add("Kuttu");
		nameList.add("Ambareesh");
		
//		System.out.println();
		
		nameList.stream().filter(name -> name.startsWith("A"))
		.forEach(System.out::println);
	}
}
