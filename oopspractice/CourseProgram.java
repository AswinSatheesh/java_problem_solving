package oopspractice;

import java.util.Arrays;
import java.util.Scanner;

class Course {

	private int courseId;
	private String courseName;
	private String courseAdmin;
	private int quiz;
	private int handson;
	
	public Course(int courseId, String courseName, String courseAdmin, int quiz, int handson) {
		this.courseId =courseId;
		this.courseName = courseName;
		this.courseAdmin = courseAdmin;
		this.quiz = quiz;
		this.handson = handson;
	}
	
	public void setCourseId(int courseId) {
		 this.courseId = courseId;
	}
	public int getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseAdmin() {
		return courseAdmin;
	}

	public void setCourseAdmin(String courseAdmin) {
		this.courseAdmin = courseAdmin;
	}

	public int getQuiz() {
		return quiz;
	}

	public void setQuiz(int quiz) {
		this.quiz = quiz;
	}

	public int getHandson() {
		return handson;
	}

	public void setHandson(int handson) {
		this.handson = handson;
	}
	
	
}

 class CourseProgram {
	public static int findAvgOfQuizByAdmin(Course[] curr, String value) {
		int sum =0,count =0;
		for(int i =0; i<curr.length; i++) {
			if(curr[i].getCourseAdmin().equalsIgnoreCase(value)) {
				sum = sum + curr[i].getQuiz();
				count++;
			}
		}
		
		if(count > 0) {
			int average =(int) sum/count;
			return average;
		}else {
			return 0;
		}
	}
	
	public static Course[] sortCourseByHandsOn(Course[] curr, int value) {
		
		Course[] obj = new Course[0];
		for(int i=0; i<curr.length; i++) {
			if(curr[i].getHandson() < value) {
				obj = Arrays.copyOf(obj, obj.length +1);
				obj[obj.length -1] = curr[i];
			}
		}
		
		Course temp;
		
		for(int i=0; i<obj.length; i++) {
			for(int j=i+1; j<obj.length; j++) {
				if(obj[i].getHandson() > obj[j].getHandson()) {
					temp = obj[i];
					obj[i] = obj[j];
					obj[j] = temp;
					
				}
			}
		}
		
		if(obj.length > 0) {
			return obj;
		}else {
			return null;
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Course[] course = new Course[4];
		
		for(int i=0; i<course.length; i++) {
			int a = sc.nextInt(); sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt(); sc.nextLine();
			int e = sc.nextInt(); sc.nextLine();
			
			course[i] = new Course(a,b,c,d,e);
		}
		
		String admin = sc.nextLine();
		int hand = sc.nextInt();
		
		int ans1 = findAvgOfQuizByAdmin(course, admin);
		
		if(ans1 !=0) {
			System.out.println(ans1);
			System.out.println();
		}else {
			System.out.println("No Course found");
		}
		
		Course[] ans2 = sortCourseByHandsOn(course, hand);
		if(ans2 !=null) {
			for(int i=0; i<ans2.length; i++) {
				System.out.println(ans2[i].getCourseName());
			}
		}else {
			System.out.println("No Course found with mentioned attribute.");
		}
		
		
	}
}
