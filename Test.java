
public class Test {
	public static void main(String... args) {
		int[] names = {1,2,3,4,5};
		int sum =0;
//		for(int i=0; i<names.length; i++) {
////			System.out.println(names[i]);
//			sum += names[i];
//		}
		for(int res : names) {
			sum += res; 
		}
		System.out.println("Sum is :" + sum);
	}
}
