package InterviewPrep;

//input : {1,2,3,4,5} , output : {4,5,1,2,3}
public class RotateArraybyKPosition {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int position = 2;
		rotateArraybyPos(arr,position);
	}
	
	public static void rotateArraybyPos(int[] arr, int position) {
		int len = arr.length;
		position = position % len; //consider length is 5 or array and user given times =6 so 5%6 ==1 so first index we will save, otherwise index bound error will come.
		
		int[] tempArray = new int[len]; //same existing array length new temporary array.
		
		for(int i=0; i< arr.length; i++) {
			tempArray[(i + position) % len] = arr[i]; // if user wants to change position by 2 then, all elements position in the right we need to move so we do (i+position) current index + position then modulo length so that if 6th elem not there 5%6 1 , first index we will push
		}
		
		//copy temporary array values to original array
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = tempArray[i];
//		}
		
		// copy array from one to another
		System.arraycopy(tempArray, 0, arr, 0, len);  //"Hey Java, copy elements from the tempArray array (starting at index 0) over to the arr array (starting at index 0), and copy a total of len elements."
		
		//print array
		for(int res : arr) {
			System.out.println(res);
		}
		
		
		
	}
}
