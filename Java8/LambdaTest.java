package Java8;
import java.util.*;

public class LambdaTest {
	public static void main(String[] args) {
		List<String> lamb = new ArrayList<>();
		
		lamb.add("Aswin");
		lamb.add("Shinu");
		lamb.add("Surya");
		
//		for(String str : lamb) {
//			System.out.println(str);
//		}
		
		lamb.forEach(name -> {System.out.println(name);});
	}
}
