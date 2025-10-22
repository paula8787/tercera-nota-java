package actividadesU2.UML;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getInfo() {
        return name + " - $" + price;
    }

    public double getPrice() {
        return price;
    }
}
