package semana04.Ejercicio;

class Product {
    private String name;
    private double price;
    private int quantity;

    // Default constructor
    public Product() {
        this.name = "Unknown";
        this.price = 0.0;
        this.quantity = 0;
    }

    // Constructor with name and price
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    // Constructor with name, price, and quantity
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void showProduct() {
        System.out.println("Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }

    // Overloaded update methods
    public void update(String name) {
        this.name = name;
    }

    public void update(double price) {
        this.price = price;
    }
}
