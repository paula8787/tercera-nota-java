package semana05.Tienda;

import semana05.Tienda.Clase.Employee;
import semana05.Tienda.Clase.Storage;

public class App {
    public static void main(String[] args) {
    Storage P1 = new Storage("Laptop", 1200, 15);
    Storage P2 = new Storage("Mouse", 20, 150);
    Storage P3 = new Storage("Keyboard", 50, 85);
    Storage P4 = new Storage("Monitor", 300, 40);
    Storage P5 = new Storage("Printer", 150, 25);
    }
    public void showInfo(){
    System.out.println("Product: " + product);
    System.out.println("Price: $"  price);
    System.out.println("Stock: " + stock);
    }
}

