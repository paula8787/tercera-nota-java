package unidad1.practicas.semana05.Tienda.Clase;

public class Storage {
    private String product;
    private double price;
    private int stock;

    public Storage(String product, double price, int stock) {
        this.product = product;
        this.price = price;
        this.stock = stock;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return String.format("Product: %s, Price: %.2f, Stock: %d", product, price, stock);
    }
}