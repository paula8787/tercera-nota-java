package semana05.arraylist.until;

public class App {
    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop", 1500.00);
        p1.ShowInfo();
        Producto p2 = new Producto("Smartphone", 800.00);
        p2.ShowInfo();
        Producto p3 = new Producto("Tablet", 400.00);
        p3.ShowInfo();
        Producto p4 = new Producto("Monitor", 300.00);
        p4.ShowInfo();
        Producto p5 = new Producto("Headphones", 150.00);
        p5.ShowInfo();

        Producto[] productos = {p1, p2, p3, p4, p5};
        for (Producto prod : productos) {
            prod.ShowInfo();
        }
    }
}
