package semana03.Company.Main;

import semana03.Company.hr.Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", "Developer", 70000);
        Employee emp2 = new Employee("Bob", "Designer", 65000);
        
        emp1.displayInfo();
        emp2.displayInfo();

        emp1.increaseSalary(5000);
        emp2.increaseSalary(3000);

        emp1.setRole("Senior Developer");

        System.out.println("\nAfter updates:");
        emp1.displayInfo();
        emp2.displayInfo();
    }
    }
