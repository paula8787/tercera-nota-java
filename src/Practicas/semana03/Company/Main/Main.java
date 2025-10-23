package practicas.semana03.Company.Main;

import practicas.semana03.Company.Class.Employee;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Company
        Employee myCompany = new Employee("Tech Solutions", "123 Tech Street", 50);

        // Acceder y modificar atributos usando getters y setters
        System.out.println("Company Name: " + myCompany.companyName);
        System.out.println("Address: " + myCompany.getAddress());
        System.out.println("Employee Count: " + myCompany.getEmployeeCount());

        // Modificar la dirección
        myCompany.setAddress("456 New Tech Avenue");
        System.out.println("Updated Address: " + myCompany.getAddress());

        // Incrementar el conteo de empleados
        myCompany.incrementEmployeeCount(10);
        System.out.println("Updated Employee Count: " + myCompany.getEmployeeCount());

        // Intentar establecer un conteo de empleados negativo
        myCompany.setEmployeeCount(-5); // Debería mostrar un mensaje de error
    }
}