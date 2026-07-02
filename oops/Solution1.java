package oops;

import java.util.Scanner;

public class Solution1 {
	static Employee1 getEmployeeWithSecondLowestSalary(Employee1[] details) {
		if(details.length < 2) {
			return null;
		}
		
		double LowestValue = Double.MAX_VALUE;
		double SecondLowestValue = Double.MAX_VALUE;
		
		for(Employee1 emp : details) {
			double salary = emp.getSalary();
			if(salary < LowestValue) {
				SecondLowestValue = LowestValue;
				LowestValue = salary;
			}else if( salary < SecondLowestValue && salary != LowestValue) {
				SecondLowestValue = salary;
			}
		}
		
		for(Employee1 emp : details) {
			if(emp.getSalary() == SecondLowestValue) {
				return emp;
			}
		}
		
		return null;
	}
	
	static int countEmployeesBasedOnAge(Employee1[] empDetails, int age) {
		int count=0;
		for(Employee1 emp : empDetails) {
			if(emp.getAge() == age) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of objects : ");
		int numOfObj = sc.nextInt();
		
		Employee1[] Result = new Employee1[numOfObj];
		
		for(int i=0; i<numOfObj; i++) {
			System.out.println("Enter EmployeeId : ");
			int employeeId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee Name : ");
			String employeeName = sc.nextLine();
			System.out.println("Enter Age : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Gender: ");
			char gender = sc.nextLine().charAt(0);
			System.out.println("Enter Salary : ");
			double salary = sc.nextDouble();
			
			Result[i] = new Employee1(employeeId,employeeName,age,gender,salary);
		}
		
		Employee1 empRes = getEmployeeWithSecondLowestSalary(Result);
		
		if(empRes==null) {	
			System.out.println("Null");
		}else {			
			System.out.println(empRes.getEmployeeId() +" # " + empRes.getEmployeeName());
		}
		
		System.out.println("Enter the age you need to check : ");
		int UserGivenAge = sc.nextInt();
		
		int ResultCount = countEmployeesBasedOnAge(Result, UserGivenAge);
		if(ResultCount > 0) {
			System.out.println(ResultCount);
		}else {
			System.out.println("No employee found for the given age");
		}
		
	}
}
