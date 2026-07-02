package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String[] args) {
		int arr[] = {10,50,4,6};
		
		List<Integer> arrList = new ArrayList<>();
		arrList.add(60);
		arrList.add(6);
		arrList.add(4);
		arrList.add(40);
		arrList.add(10);
		
//		arrList.stream().filter(num -> num >10).forEach(System.out::println);
	
		List<String> myStr = new ArrayList<String>();
		myStr.add("Aswin Satheesh");
		myStr.add("uytrewerty");
		
//		myStr.stream().map(String::length).forEach(System.out::println);
		
//		myStr.stream().map(num -> num.length()).forEach(num -> System.out.println(num));
		
//		arrList.stream().sorted().forEach(res -> System.out.println(res));
		
//		arrList.stream().distinct().forEach(System.out::println);
		
//		arrList.stream().limit(3).forEach(System.out::println);
		
//		List<String> result = myStr.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
//		
//		for(String res : result){
//			System.out.println(res);
//		}
		
//		int result = arrList.stream().reduce(0, (acc,curr)-> acc + curr);
//		System.out.println(result);
		
		String[] myNameArr = {"Aswin","Satheesh","Surya"};
		int[] age = new int[4];
		age[0] = 23;
		age[1] = 24;
		age[2] = 25;
		age[3] = 34;
		
		for(int resAge : age) {
			System.out.println(resAge);
		}
		
		for(String resName : myNameArr) {
			System.out.println(resName);
		}
	}
}
