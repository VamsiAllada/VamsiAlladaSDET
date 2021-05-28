package assignments2;
import java.util.ArrayList;
import java.util.List;
public class RetrieveEmployees {
		
		static List<Employee> employees;
		static RuntimeException exception;
		
		public static void main(String[] args) {
			
			employees = new ArrayList<Employee>();		
			System.out.println("Adding Employees");
			employees.add(new Employee(1, "ABC", 2323));
			employees.add(new Employee(2, "DEF", 2543));
			employees.add(new Employee(3, "GHI", 5423));
			employees.add(new Employee(4, "JKL", 3426));
			employees.add(new Employee(5, "MNO", 7345));
			
			System.out.println("Fetching Employees : ");
			
			try{
				System.out.println(fetchEmployeeById(1));
			}catch(EmployeeNotFoundException nfe) {			
				System.out.println(nfe.getMessage());
			}
			
			try{
				System.out.println(fetchEmployeeById(19));
			}catch(EmployeeNotFoundException nfe) {			
				System.out.println(nfe.getMessage());
			}
					
		}
		
		private static Employee fetchEmployeeById(int id)  throws EmployeeNotFoundException{
			System.out.println("Fetching Employee By Id: "+id);
			if(!employees.isEmpty()) {
				for(Employee employee : employees) {
					if(employee.matchId(id)) {
						return employee;
					}
				}
			}
			throw new EmployeeNotFoundException("Employee Not found with Id: "+id);
		}	
	}

	class EmployeeNotFoundException extends Throwable{
		String message;

		public EmployeeNotFoundException(String message) {
			super();
			this.message = message;
		}
		
		public String getMessage() {
			return message;
		}
	}

