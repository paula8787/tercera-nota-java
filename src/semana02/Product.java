package semana02;

public class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public void sell(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println("Sold " + amount + "unis of " + name);
        } else {
            System.out.println("not enough stock to sell " + amount + " units of " + name + "aviable stock: " + quantity);
        }
    }

    public void restock(int amount) {
        quantity += amount;
        System.out.println("restocket " + amount + " units of " + name); 
    }

    public void showProduct() {
        System.out.println("Product name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity in stock: " + quantity);
    }
}
