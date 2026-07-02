/*Create a program with a list of numbers where you want to skip negative values,
 but stop completely if you find a zero: {3, -1, 7, 0, 9};*/
public class SkipNegativeValues {
	
	public static void main(String[] args) {
		int[] collection = {3,-1,7,0,9};
		int[] result = {};
		int count=0;
		for(int res : collection) {
			if(res > 0) {
			  result[count] = res;
			  count++;
			  System.out.println(res);
			}
			if(res == 0) {
				break;
			}
		}
	}
}
