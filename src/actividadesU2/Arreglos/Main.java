package actividadesU2.Arreglos;

public class Main {
    public static void main(String[] args) {
        Inventory store = new Inventory();

        // Add products
        store.addProduct(new Product("P001", "Wireless Mouse", 25.99));
        store.addProduct(new Product("P002", "Mechanical Keyboard", 79.50));
        store.addProduct(new Product("P003", "USB-C Charger", 15.75));

        // Show all products
        store.showProducts();

        // Search for existing product
        System.out.println("\nSearching for product 'P002':");
        store.searchProduct("P002");

        // Search for a non-existing product
        System.out.println("\nSearching for product 'P999':");
        store.searchProduct("P999");
    }
}

