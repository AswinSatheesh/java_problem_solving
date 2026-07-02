package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		num.add(5);
		num.add(12);
		num.add(5);
		num.add(12);
		
//		num.stream().sorted().forEach(System.out::println);;
		
//		num.stream().distinct().forEach(n -> System.out.println(n));
		
//		System.out.println(num);
		
//		num.stream().filter(n -> n > 10).forEach(System.out::println);
		
		List<String> collections = new ArrayList<>();
		
		collections.add("Aswin");
		collections.add("Java");
		
		
//		collections.stream().map(n -> n.length()).forEach(n -> System.out.println(n));
		
		List<String> names = new ArrayList<>();
		names.add("Aswin");
		names.add("Gokul");
		names.add("Arun");
		names.add("Raj");
		
		List<String> result = names.stream().filter(name -> name.startsWith("A"))
				.collect(Collectors.toList());
		
//		for(String res : result) {
//			System.out.println(res);
//		}
		
		List<Integer> values = new ArrayList<>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		
		int sum = values.stream().reduce(0,(accum,curr)-> accum+curr);
		
		System.out.println(sum);
		
	}
}
