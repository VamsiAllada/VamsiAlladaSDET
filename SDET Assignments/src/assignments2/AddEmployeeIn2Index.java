package assignments2;

public class AddEmployeeIn2Index {
	package com.test;

	import java.util.ArrayList;
	import java.util.List;


	public class Program4 {
		public static void main(String[] args) {
			List<Employee> employees = new ArrayList<Employee>(5);
			
			
			System.out.println("Adding Employees");
			employees.add(new Employee(1, "ABC", 2323));
			employees.add(new Employee(2, "DEF", 2543));
			employees.add(new Employee(3, "GHI", 5423));
			employees.add(new Employee(4, "JKL", 3426));
			employees.add(new Employee(5, "MNO", 7345));
			
			System.out.println("Retrieving Employees");
			for(Employee emp : employees) {
				System.out.println(emp);
			}
			
			System.out.println("Adding New Employee");
			employees.add(1, new Employee(5, "XYZ", 6345));
			
					
			System.out.println("Retrieving Employees");
			for(Employee emp : employees) {
				System.out.println(emp);
			}
		}
	}
}
