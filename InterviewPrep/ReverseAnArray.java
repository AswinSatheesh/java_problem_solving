package InterviewPrep;
//This is Two pointer concept --Really Important
public class ReverseAnArray {
	public static void main(String[] args) {
		int[] myArr = {9,1,5,7,2,8};
		
//		System.out.println(myArr.length);
		int first =0;//first index
		int last = myArr.length-1; //last index
		
		while(first < last) {
			int temp = myArr[first];
			myArr[first] = myArr[last];
			myArr[last] = temp;
			first++;
			last--;
		}
		
		for(int resArr : myArr) {
			System.out.println(resArr);
		}
	}
}
