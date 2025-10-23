package unidad2.actividad2;

public class Main {
    public static void main(String[] args) {
        // Create category and products
        Category electronics = new Category("Electronics", "Gadgets and devices");
        Product phone = new Product("Smartphone", 899.99);
        Product laptop = new Product("Laptop", 1200.50);
        electronics.addProduct(phone);
        electronics.addProduct(laptop);

        // Create order and add products
        Order order1 = new Order("2025-10-22");
        order1.addProduct(phone);
        order1.addProduct(laptop);

        // Create customer and place order
        Customer customer = new Customer("Alice Smith", "alice@email.com");
        customer.placeOrder(order1);

        // Show information
        System.out.println(electronics.getInfo());
        System.out.println(order1.getInfo());
        System.out.println(customer.getInfo());
    }
}
