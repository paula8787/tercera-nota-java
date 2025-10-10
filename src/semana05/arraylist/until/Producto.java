package semana05.arraylist.until;

class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void ShowInfo() {
        System.out.println("Nombre del producto: " + nombre + ", Precio: " + precio);
    }
}