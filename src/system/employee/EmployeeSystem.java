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
			
//		for (Employee e : employees) {
//	        if (e.getEmployeeId().equals(employee.getEmployeeId())) {
//	            System.out.println("Employee with ID " + employee.getEmployeeId() + " already exists.");
//	            return false;
//	        }
//		}
		
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
	
	public boolean removeEmployee(Employee employee) {
		if(employee == null  || employee.getEmployeeId() == null) {
			System.out.println("Invalid employee");
			return false;
		}
		
		 if (!employees.contains(employee)) {
		        System.out.println("Employee with ID " + employee.getEmployeeId() + " does not exist.");
		        return false;
		    }
		
		employeeIds.remove(employee.getEmployeeId());
		employees.remove(employee);
		
		System.out.println("Employee with ID " + employee.getEmployeeId() + " removed successfully.");
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
		for(int i = 0; i < employees.size(); i++) {
			System.out.println(i+1 + ". " + employees.get(i));
			}
		return true;
	}
		
}
