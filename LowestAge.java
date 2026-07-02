
public class LowestAge {
	public static void main(String[] args) {
		//we create a program that finds the lowest age among different ages:
		//int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
		
		int ages[] = {20,22,18,35,48,26,87,7};
		
		int length = ages.length;
		
		int lowestVal = ages[0];
		
		for(int age : ages) {
			if(age < lowestVal) {
				lowestVal = age;
			}
		}
		
		System.out.println("Lowest value amoung the array is : "+ lowestVal);
	}
}
