package system.employee;

import java.time.LocalDate;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String employeeId;
	private int age;
	private String department;
	private final LocalDate dateHired;
	private double salary;
	
	public Employee() {
		firstName = "Nil";
		lastName = "Nil";
		age = 0;
		employeeId = "abc123";
		department = "Nil";
		dateHired = LocalDate.now();
		salary = 0.0;
		
	}
	
	public Employee(String firstName,String lastName, String employeeId, int age,
			String department, LocalDate dateHired, double salary){
		
			this.firstName = firstName;
			this.lastName = lastName;
			this.employeeId = employeeId;
			this.age = age;
			this.department = department;
			this.dateHired = dateHired;
			this.salary = salary;
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public LocalDate getdateHired() {
		return dateHired;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}
	
	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public String getEmployeeId(String newEmployeeId) {
		return employeeId;
	}
	
	public void setDepartment(String newDepartment) {
		this.department = newDepartment;
	}
	
	public void setSalary(Double newSalary) {
		this.salary = newSalary;
	}
	
	@Override
	public String toString() {
		
		return firstName + " " + lastName + " " + employeeId + " " + age + " " + department + " "
				+ dateHired + " " + salary ;
		
	}
	
}
