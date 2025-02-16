package system.test;

import system.employee.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		
		String name = emp.getFirstName();
		System.out.println(name);
		
		emp.setFirstName("Joe");
		
		String newName = emp.getFirstName();
		System.out.println(newName);
		
		
	}

}
