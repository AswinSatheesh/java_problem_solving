package InterviewPrep;
import java.util.Set;
import java.util.HashSet;


//input : int[] nums = {2, 1, 3, 5, 3, 2};
//ooutput : 3

public class FirstDuplicateInArray {
	public static void main(String[] args) {
		int[] nums = {0,1,0,5,3,0,3};
		
		int Finalresult = duplicateFind(nums);
		
		if(Finalresult !=-1) {
			System.out.println("Duplicate Value : " + Finalresult);
		}else {
			System.out.println("No Duplicate Vlaue found !!");
		}
		
	}
	
	public static int duplicateFind(int[] nums) {
		int duplicate =-1;
		
		Set<Integer> result = new HashSet<>();
		
		for(int num : nums) {
			if(!result.add(num)) {
				duplicate = num;
				break;
			}
		}
		
		return duplicate;
	}

}