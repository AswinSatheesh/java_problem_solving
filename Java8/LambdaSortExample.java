package Java8;
import java.util.*;
import java.util.stream.Collectors;

public class LambdaSortExample {
	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<>();
		
		Employee obj1 = new Employee("Aswin",46000.0);
		employee.add(obj1);
		
		employee.add(new Employee("Surya",45000.0));
		employee.add(new Employee("Kannan", 75000.0));
		
		
//		System.out.println("Before sorting based on salary : " + employee);			
		
//		employee.sort((e1,e2)-> Double.compare(e2.getSalary(), e1.getSalary()));
		
		
//		System.out.println(employee);
		
		
//		employee.stream().map(name -> name.getName()).forEach(System.out::println);
		
//		employee.stream().map(Employee :: getName).forEach(System.out::println);
		
		List<String> names = employee.stream().map(Employee :: getName).collect(Collectors.toList());
		
		System.out.println(names);

		
	}
}
