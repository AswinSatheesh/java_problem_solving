package oops;

import java.util.Arrays;
import java.util.Scanner;

public class courseProgram {
	static int findAvgOfQuizByAdmin(Course[] course, String courseAd) {
		int sum=0;
		int count =0;
		for(int i=0; i<course.length; i++) {
			if(course[i].getCourseAdmin().equalsIgnoreCase(courseAd)) {
				sum = sum + course[i].getQuiz();
				count++;
			}
		}
		
		if(count >0) {
			int result = sum/count;
			return result;
		}else {
			return 0;
		}
	}
	
	static Course[] sortCourseByHandsOn(Course[] objects,int handsonVal) {
		Course[] Created = new Course[0];
		int countVal=0;
		for(int i=0; i<objects.length; i++) {
			if(objects[i].getHandson() < handsonVal) {
				Created = Arrays.copyOf(Created, Created.length+1);
				Created[Created.length -1] = objects[i];
			}
		}
		
		//ascending order:
		Course temp;
		for(int i=0; i<Created.length; i++) {
			for(int j=i+1; j<Created.length; j++) {
				if(Created[i].getHandson() < Created[j].getHandson()) {
					temp = Created[i];
					Created[i] = Created[j];
					Created[j] = temp;
				}
			}
		}
		
		return Created;	
	}
	public static void main(String[] args) {
		Course[] collect = new Course[4];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<4; i++) {
			int val1 = sc.nextInt(); sc.nextLine();
			String val2 = sc.nextLine();
			String val3 = sc.nextLine();
			int val4 = sc.nextInt(); sc.nextLine();
			int val5 = sc.nextInt(); sc.nextLine();
			
			collect[i] = new Course(val1,val2,val3,val4,val5);
			
		}
		
		
		System.out.println("Enter Array Name and Admin Name");
		String adminName = sc.nextLine();
		int result = findAvgOfQuizByAdmin(collect,adminName);
		
		if(result != 0) {
			System.out.println("Result : " + result);
		}else {
			System.out.println("No course found");			
		}
		
		
		System.out.println("Handson Value");
		int handsonVal = sc.nextInt();
		
		Course[] finaRes = sortCourseByHandsOn(collect, handsonVal);
		if(finaRes.length ==0) {
			System.out.println("No Course found with mentioned attribute.");
		}else {
			for(int i=0; i< finaRes.length; i++) {
				if(finaRes !=null) {
					System.out.println(finaRes[i].getCourseName());
				}
			}
		}
		
		
		
	}
}
