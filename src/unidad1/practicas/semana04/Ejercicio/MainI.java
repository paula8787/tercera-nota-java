package unidad1.practicas.semana04.Ejercicio;

public class MainI {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Laptop", 1200.0);
        Product p3 = new Product("Phone", 800.0, 10);

        p1.showProduct();
        p2.showProduct();
        p3.showProduct();

        // Bonus: update methods
        p2.update("Gaming Laptop");
        p3.update(850.0);

        System.out.println("After updates:");
        p2.showProduct();
        p3.showProduct();
    }
}
