package unidad1.practicas.semana05.Tienda;

import unidad1.practicas.semana05.Tienda.Clase.Storage;

public class App {
    public static void main(String[] args) {
        Storage P1 = new Storage("Laptop", 1200, 15);
        Storage P2 = new Storage("Mouse", 20, 150);
        Storage P3 = new Storage("Keyboard", 50, 85);
        Storage P4 = new Storage("Monitor", 300, 40);
        Storage P5 = new Storage("Printer", 150, 25);

        showInfo(P1);
        showInfo(P2);
        showInfo(P3);
        showInfo(P4);
        showInfo(P5);
    }

    public static void showInfo(Storage s){
        // usando getters para formato claro
        System.out.printf("Product: %s, Price: %.2f, Stock: %d%n", s.getProduct(), s.getPrice(), s.getStock());
    }
}

