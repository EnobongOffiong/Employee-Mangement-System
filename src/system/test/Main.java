package system.test;

import java.time.LocalDate;

import system.employee.Employee;
import system.employee.EmployeeSystem;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee("Joe", "Doe", "doo65b", 34, "IT",
                LocalDate.of(2025, 2, 13), 36500);
		
		String name = emp.getFirstName();
		System.out.println(name);
		
		emp.setFirstName("Joe");
		
		String newName = emp.getFirstName();
		System.out.println(newName);
		
		
		EmployeeSystem list = new EmployeeSystem();
		
		list.displayEmployees();
		list.addEmployee(emp);
		list.displayEmployees();
		
		list.searchEmployee("Joe");
		list.addEmployee(new Employee("John", "Don", "EMP0001", 34, "IT", LocalDate.of(2025, 2, 13), 36500));
		list.addEmployee(new Employee("Anna", "Smith", "EMP0002", 28, "HR", LocalDate.of(2024, 3, 5), 42000));
		list.addEmployee(new Employee("Mike", "Johnson", "EMP0003", 40, "Finance", LocalDate.of(2023, 5, 21), 50000));
		list.addEmployee(new Employee("Sara", "Davis", "EMP0004", 25, "Marketing", LocalDate.of(2022, 7, 11), 39000));
		list.addEmployee(new Employee("David", "Wilson", "EMP0005", 30, "IT", LocalDate.of(2021, 10, 30), 45000));
		list.addEmployee(new Employee("Emily", "Brown", "EMP0006", 32, "HR", LocalDate.of(2020, 6, 15), 47000));
		list.addEmployee(new Employee("Chris", "Miller", "EMP0007", 45, "Finance", LocalDate.of(2019, 8, 9), 52000));
		list.addEmployee(new Employee("Sophia", "Moore", "EMP0008", 27, "Marketing", LocalDate.of(2018, 4, 18), 41000));
		list.addEmployee(new Employee("Daniel", "Taylor", "EMP0009", 35, "IT", LocalDate.of(2025, 1, 20), 48000));
		list.addEmployee(new Employee("Olivia", "Anderson", "EMP0010", 29, "HR", LocalDate.of(2024, 9, 7), 43000));
		list.addEmployee(new Employee("Liam", "Thomas", "EMP0011", 38, "Finance", LocalDate.of(2023, 3, 2), 51000));
		list.addEmployee(new Employee("Grace", "Jackson", "EMP0012", 26, "Marketing", LocalDate.of(2022, 12, 14), 40000));
		list.addEmployee(new Employee("Ethan", "White", "dMP0013", 31, "IT", LocalDate.of(2021, 5, 25), 46000));
		list.addEmployee(new Employee("Mia", "Harris", "EMP0014", 33, "HR", LocalDate.of(2020, 11, 3), 44000));
		list.addEmployee(new Employee("Jacob", "Martin", "EMP0015", 36, "Finance", LocalDate.of(2019, 8, 22), 53000));
		list.addEmployee(new Employee("Ava", "Thompson", "EMP0016", 24, "Marketing", LocalDate.of(2018, 6, 19), 38000));
		list.addEmployee(new Employee("Noah", "Garcia", "EMP0017", 29, "IT", LocalDate.of(2025, 7, 10), 49000));
		list.addEmployee(new Employee("Isabella", "Martinez", "EMP0018", 34, "HR", LocalDate.of(2024, 10, 5), 46000));
		list.addEmployee(new Employee("Mason", "Robinson", "EMP0019", 37, "Finance", LocalDate.of(2023, 1, 17), 52000));
		list.addEmployee(new Employee("Charlotte", "Clark", "EMP0020", 28, "Marketing", LocalDate.of(2022, 4, 8), 43000));
		list.addEmployee(new Employee("Logan", "Rodriguez", "EMP0021", 30, "IT", LocalDate.of(2021, 12, 21), 47000));
		list.addEmployee(new Employee("Amelia", "Lewis", "EMP0022", 25, "HR", LocalDate.of(2020, 8, 27), 45000));
		list.addEmployee(new Employee("Lucas", "Walker", "EMP0023", 41, "Finance", LocalDate.of(2019, 2, 14), 54000));
		list.addEmployee(new Employee("Harper", "Allen", "EMP0024", 27, "Marketing", LocalDate.of(2018, 3, 29), 39000));
		list.addEmployee(new Employee("Elijah", "Young", "EMP0025", 33, "IT", LocalDate.of(2025, 5, 12), 48000));
		list.addEmployee(new Employee("Evelyn", "King", "EMP0026", 29, "HR", LocalDate.of(2024, 6, 17), 46000));
		list.addEmployee(new Employee("William", "Scott", "EMP0027", 38, "Finance", LocalDate.of(2023, 7, 3), 50000));
		list.addEmployee(new Employee("James", "Adams", "EMP0028", 32, "Marketing", LocalDate.of(2022, 11, 11), 42000));
		list.addEmployee(new Employee("Benjamin", "Baker", "EMP0029", 30, "IT", LocalDate.of(2021, 9, 1), 49000));
		list.addEmployee(new Employee("Chloe", "Nelson", "EMP0030", 26, "HR", LocalDate.of(2020, 2, 20), 44000));
		
		
		 long startTime = System.nanoTime();
	        boolean foundLinear = list.searchEmployee("EMP0020");
	        long endTime = System.nanoTime();
	        System.out.println("Linear Search Found: " + foundLinear + " | Time: " + (endTime - startTime) + " ns");

	        list.displayEmployees();
		
	}

}
