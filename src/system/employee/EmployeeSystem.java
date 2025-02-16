package system.employee;

import java.util.ArrayList;

public class EmployeeSystem {
	
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	
	public boolean addEmployee(Employee employee) {
		employees.add(employee);
		
		if(employees.get(employees.size() - 1) == employee) {
			System.out.println("New employee has been successfully added!");
			return true;
		}
		
		return false;
		
	}
	
	public boolean removeEmployee(Employee employee) {
		if(employee == null) {
			System.out.println("The employee you are trying to remove does not exist");
			return false;
		}
		
		return true;
	}
	
	public boolean searchEmployee(String firstName) {
		if(employees.isEmpty()) {
			System.out.println("There are no employees");
			return false;
		}
		
		for(int i = 0; i < employees.size(); i++) {
			if(employees.get(i).getFirstName() == firstName ) {
				System.out.println(employees.get(i));
				return true;
			}
				
		}
		
		System.out.println("Employee not found");
		return false;
	}
	
	public boolean displayEmployees() {
		if(employees.isEmpty()) {
			System.out.println("There are no employees");
			return false;
		}
		
		System.out.println("All employees:");
		for(int i = 0; i < employees.size(); i++) {
			System.out.println(i+1 + ". " + employees.get(i));
			}
		return true;
	}
		
}
