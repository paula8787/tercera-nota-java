package practicas.semana03.Company.Class;

public class Employee {
    public String companyName;
    private String address;
    private int employeeCount;

    public Employee(String companyName, String address, int employeeCount) {
        this.companyName = companyName;
        this.address = address;
        setEmployeeCount(employeeCount);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        if (employeeCount >= 0) {
            this.employeeCount = employeeCount;
        } else {
            System.out.println("El conteo de empleados no puede ser negativo.");
        }
    }

    public void incrementEmployeeCount(int amount) {
        if (amount > 0) {
            this.employeeCount += amount;
        } else {
            System.out.println("El incremento debe ser positivo.");
        }
    }
}