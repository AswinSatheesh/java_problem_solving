package oops;

public class Tester implements Test1,Test2{
	public void SameMethod() {
		System.out.println("This is the method, same method available in child");
	}
	
	public void childMethod() {
		System.out.println("This is coming from child- parent don't know");
	}
	
	public static void main(String[] args) {
//		Tester obj = new Tester();
//		obj.SameMethod();
		
		Test1 parentRef = new Tester();
		parentRef.SameMethod();
		
		Tester childObj = new Tester();
		childObj.childMethod();
	}
}
