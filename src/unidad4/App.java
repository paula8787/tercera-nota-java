package unidad4;
import unidad4.utils.*;

public class App {
    public static void main(String[] args) {

        Direccion direccionEmpleado = new Direccion("Calle Falsa 123", "Springfield");
        Empleado empleado = new Empleado("Juan Perez", 30000, direccionEmpleado);
        empleado.mostrarInfo();
        System.out.println("Pago de empleado: $" + empleado.calcularPago());
        empleado.getDireccion().getGullAddress();

        System.out.println("--------------------");

        Direccion direccionGerente = new Direccion("Avenida Siempreviva 742", "Springfield");
        Gerente gerente = new Gerente("Maria Garcia", 50000, 10000, direccionGerente);
        gerente.mostrarInfo();
        System.out.println("Pago de gerente: $" + gerente.calcularPago());
        gerente.getDireccion().getGullAddress();

        System.out.println("--------------------");

        Direccion direccionVendedor = new Direccion("Calle del Sauce 5", "Springfield");
        Vendedor vendedor = new Vendedor("Carlos Lopez", 20000, 100000, 0.05, direccionVendedor);
        vendedor.mostrarInfo();
        System.out.println("Pago de vendedor: $" + vendedor.calcularPago());
        vendedor.getDireccion().getGullAddress();

    }

}
