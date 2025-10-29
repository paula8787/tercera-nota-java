package unidad1.practicas.semana05.Tienda.Clase;

public class Employee {
    private String name;
    private String role;
    private double salary;

    public Employee(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }

    public void showResponsibility() {
        System.out.println("Employee name: " + name + ", Role: " + role + ", Salary: " + salary);

        switch (role) {
            case "Manager":
                System.out.println("Responsibility: Maneja el equipo.");
                break;

            case "Developer":
                System.out.println("Responsibility: Escribe y mantiene el código.");
                break;

            case "Designer":
                System.out.println("Responsibility: Diseña interfaces y experiencias de usuario.");
                break;

            default:
                System.out.println("Responsibility: No especificada.");
        }
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - %.2f", name, role, salary);
    }
}