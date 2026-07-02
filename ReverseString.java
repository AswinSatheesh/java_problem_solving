
public class ReverseString {
	public static void main(String[] args) {
		String name = "Aswin Satheesh";
//		String s1 = new StringBuilder(name).reverse().toString();
		StringBuilder s2 = new StringBuilder(name).reverse();
		System.out.println(s2);
	}
}
