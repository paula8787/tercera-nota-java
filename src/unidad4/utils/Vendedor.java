package unidad4.utils;

public class Vendedor extends Empleado {
    private double ventas;
    private double comision;
    private Direccion direccion;


    public Vendedor(String nombre, double salarioBase, double ventas, double comision, Direccion direccion) {
        super(nombre, salarioBase, direccion);
        this.ventas = ventas;
        this.comision = comision;
    }

    @Override
    public double calcularPago() {
        return salarioBase + (ventas * comision);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Vendedor: " + nombre + " Salario total: $" + calcularPago());
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }


}
