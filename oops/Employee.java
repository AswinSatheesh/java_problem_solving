package oops;

public class Employee {
	private int employeeId;
	private String employeeName;
	private int age;
	private char gender;
	private double salary;
	
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Employee(int employeeId,String employeeName,int age,char gender, double salary){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}
}
