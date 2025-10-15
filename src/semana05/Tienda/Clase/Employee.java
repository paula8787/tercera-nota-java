package semana05.employee;

public class Employee {
    String name;
    String Role;
    double salary;

    public void ShowResponsability() {
        System.out.println("Employee name: " + name + ", Role: " + Role + ", Salary: " + salary);

        switch (Role) {
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

}