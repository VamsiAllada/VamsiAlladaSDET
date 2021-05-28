package assignments2;
import java.util.ArrayList;
import java.util.List;

public class AddEmployees {

	class Employee{
		
		private int empid;
		private String ename;
		private float sal;
		
		public Employee(int empid, String ename, float sal) {
			super();
			this.empid = empid;
			this.ename = ename;
			this.sal = sal;
		}
		
		public Boolean matchId(int empId) {
			return this.empid == empId;
		}

		@Override
		public String toString() {
			return "Employee Found[empid=" + empid + ", ename=" + ename + ", sal=" + sal + "]";
		}
		
	}

		public static void main(String[] args) {
			List<Employee> employees = new ArrayList<Employee>();
			
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
		}
	}
