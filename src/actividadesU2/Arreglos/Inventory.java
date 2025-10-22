package actividadesU2.Arreglos;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {
    private ArrayList<Product> products;
    private HashMap<String, Product> catalog;

    public Inventory() {
        products = new ArrayList<>();
        catalog = new HashMap<>();
    }

    // Add product to both structures
    public void addProduct(Product p) {
        products.add(p);
        catalog.put(p.getCode(), p);
    }

    // Show all products
    public void showProducts() {
        System.out.println("=== Product List ===");
        for (Product p : products) {
            System.out.println(p.getInfo());
        }
    }

    // Search product using HashMap with try-catch
    public void searchProduct(String code) {
        try {
            Product found = catalog.get(code);
            if (found == null) {
                throw new Exception("Product not found.");
            }
            System.out.println("✅ Product found: " + found.getInfo());
        } catch (Exception e) {
            System.out.println("⚠️ " + e.getMessage());
        }
    }
}

