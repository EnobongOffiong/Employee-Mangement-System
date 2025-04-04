package system.employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class EmployeeSystem {
	
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	Set<String> employeeIds = new HashSet<>();
	
	
	public boolean addEmployee(Employee employee) {
		if (employee == null || employee.getEmployeeId() == null || employee.getEmployeeId().isEmpty()) {
	        System.out.println("Invalid employee details. Cannot add.");
	        return false;
	    }
			
		
		if(!employeeIds.contains(employee.getEmployeeId())){
			employees.add(employee);
			employeeIds.add(employee.getEmployeeId());
		}
		
		employees.sort((e1, e2) -> e1.getEmployeeId().compareTo(e2.getEmployeeId()));
		
		if(employees.contains(employee)) {
			System.out.println("New employee has been successfully added!");
			return true;
		}
		
		return false;
		
	}
	
	public boolean removeEmployee(String employeeId) {
	    if (employeeId == null || employeeId.isEmpty()) {
	        System.out.println("Invalid employee ID");
	        return false;
	    }

	    if (employees.isEmpty()) {
	        System.out.println("There are no employees to remove");
	        return false;
	    }

	 
	    Employee toRemove = null;
	    for (Employee emp : employees) {
	        if (emp.getEmployeeId().equals(employeeId)) {
	            toRemove = emp;
	            break;
	        }
	    }

	    if (toRemove == null) {
	        System.out.println("Employee with ID " + employeeId + " not found");
	        return false;
	    }

	    employees.remove(toRemove);
	    employeeIds.remove(employeeId);
	    System.out.println("Employee with ID " + employeeId + " removed successfully");
	    return true;
	}
	
	public boolean searchEmployee(String employeeId) {
		if(employees.isEmpty()) {
			System.out.println("There are no employees");
			return false;
		}
		
		if(employeeId == null || employeeId.isEmpty()) {
			System.out.println("Invalid employee Id");
		}
		
		System.out.println(employees);
		
		int left = 0;
		int right = employees.size()-1;
		
		while(left<=right) {
			int middle = (left + right) / 2;
			
			if(employees.get(middle).getEmployeeId().equals(employeeId)) {
				System.out.println(employees.get(middle));
				return true;
			}
			else if (employeeId.compareTo(employees.get(middle).getEmployeeId()) > 0 ){
				left = middle + 1;
			}
			else {
				right = middle-1;
			}
		}
		
		System.out.println("Employee not found");
		return false;
	}
	
	public boolean displayEmployees() {
		if(employees == null || employees.isEmpty()) {
			System.out.println("There are no employees");
			return false;
		}
		
		System.out.println("All employees:");
		System.out.println("   Fname Lname ID Age Dept. HireDate Salary ");
		for(int i = 0; i < employees.size(); i++) {
			System.out.println(i+1 + ". " + employees.get(i));
			}
		return true;
	}
		
}
