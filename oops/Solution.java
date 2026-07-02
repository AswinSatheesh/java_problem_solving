package oops;

import java.util.Scanner;

public class Solution {

    // Returns Employee with second lowest salary. null if < 2 employees.
    static Employee getEmployeeWithSecondLowestSalary(Employee[] employees) {
        if (employees.length < 2) {         // FIX E2: < 2, not > 2
            return null;
        }

        double lowestSalary       = Double.MAX_VALUE;  // start high
        double secondLowestSalary = Double.MAX_VALUE;  // start high

        for (Employee emp : employees) {           // FIX E1: loop over array
            double salary = emp.getSalary();       // get salary from object
            if (salary < lowestSalary) {
                secondLowestSalary = lowestSalary;  // FIX E3: old lowest → second
                lowestSalary       = salary;        // new value → lowest
            } else if (salary < secondLowestSalary && salary != lowestSalary) {
                secondLowestSalary = salary;        // update second on its own
            }
        }

        for (Employee emp : employees) {           // FIX E4: find & return the object
            if (emp.getSalary() == secondLowestSalary) {
                return emp;
            }
        }
        return null;
    }

    // Returns count of employees matching the given age.
    static int countEmployeesBasedOnAge(Employee[] employees, int age) {
        int count = 0;
        for (Employee emp : employees) {           // FIX E5: loop over array
            if (emp.getAge() == age) {
                count++;
            }
        }
        return count;                              // simplified — no if/else needed
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();                      // FIX E6: read count first
        sc.nextLine();                             // consume leftover newline

        Employee[] employees = new Employee[n];  // create array of size n

        for (int i = 0; i < n; i++) {             // loop to read all employees
            int    empId   = sc.nextInt();   sc.nextLine();   // FIX E7: right Scanner methods
            String name    = sc.nextLine();
            int    age     = sc.nextInt();   sc.nextLine();
            char   gender  = sc.nextLine().charAt(0);
            double salary  = sc.nextDouble(); sc.nextLine();

            employees[i] = new Employee(empId, name, age, gender, salary);
        }

        int searchAge = sc.nextInt();              // read the age to search

        // Call 1: second lowest salary
        Employee result = getEmployeeWithSecondLowestSalary(employees);  // FIX E8
        if (result != null) {
            System.out.println(result.getEmployeeId() + "#" + result.getEmployeeName());
        } else {
            System.out.println("Null");
        }

        // Call 2: count by age
        int count = countEmployeesBasedOnAge(employees, searchAge);
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("No employee found for the given age");
        }

        
    }
}