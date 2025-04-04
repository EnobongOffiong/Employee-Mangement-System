package system.test;


import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;
import system.employee.Employee;
import system.employee.EmployeeSystem;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final EmployeeSystem ems = new EmployeeSystem();

    public static void main(String[] args) {
       
        boolean running = true;

        while (running) {
            displayMenu();
            int choice = getIntInput("Enter your choice: ", 1, 5);

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    searchEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    running = false;
                    System.out.println("\nExiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }


    private static void displayMenu() {
        System.out.println("\nMAIN MENU:");
        System.out.println("1. Add Employee");
        System.out.println("2. View All Employees");
        System.out.println("3. Search for Employee");
        System.out.println("4. Delete Employee");
        System.out.println("5. Exit");
    }


    private static double getDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double input = scanner.nextDouble();
                scanner.nextLine();
                return input;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.nextLine(); 
            }
        }
    }

    private static LocalDate getDateInput(String prompt) {
        while (true) {
            try {
                System.out.println(prompt + " (YYYY-MM-DD): ");
                String dateString = scanner.nextLine();
                return LocalDate.parse(dateString);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use YYYY-MM-DD format.");
            }
        }
        }
    
    private static int getIntInput(String prompt, int min, int max) {
        while (true) {
            try {
                System.out.print(prompt);
                int input = scanner.nextInt();
                scanner.nextLine(); 
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.printf("Please enter a number between %d and %d.\n", min, max);
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); 
            }
        }
    }

    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private static void addEmployee() {
        System.out.println("\nADD NEW EMPLOYEE");
        String firstName = getStringInput("Enter first name: ");
        String lastName = getStringInput("Enter last name: ");
        String employeeId = getStringInput("Enter employee ID: ");
        int age = getIntInput("Enter age: ", 18, 70);
        String department = getStringInput("Enter department: ");
        LocalDate dateHired = getDateInput("Enter hire date");
        double salary = getDoubleInput("Enter salary: ");
        scanner.nextLine(); 

        Employee employee = new Employee(firstName, lastName, employeeId, age, 
                                      department, dateHired, salary);
        ems.addEmployee(employee);
    }

    private static void viewEmployees() {
        System.out.println("\nEMPLOYEE LIST");
        ems.displayEmployees();
    }

    private static void searchEmployee() {
        System.out.println("\nSEARCH EMPLOYEE");
        String id = getStringInput("Enter employee ID to search: ");
        ems.searchEmployee(id);
    }

    private static void deleteEmployee() {
        System.out.println("\nREMOVE EMPLOYEE");
        String id = getStringInput("Enter employee ID to remove: ");
        ems.removeEmployee(id); 
    }

    
}
