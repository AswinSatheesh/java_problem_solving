package InterviewPrep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//first one array two store both index, one hashmap for storing each array elem and its index
//one loop to iterate full array then checker = target - array elem then one value we will get
//that value we will check inside map, if avaialbe means its index we will take along with current i index,
//if that key is not available means current array element as key and its index as value we will put inside hashmap.
public class TwoSumOptimal {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int target =6;
		
		int[] result = new int[2];
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i< arr.length; i++) {
			int checker = target - arr[i];
			if(map.containsKey(checker)) {
				result[0] = map.get(checker);
				result[1] = i;
				break;
			}
			
			map.put(arr[i], i);
		}
		
		System.out.println(Arrays.toString(result));
	}
}
