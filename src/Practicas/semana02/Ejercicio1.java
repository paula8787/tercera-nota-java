package Practicas.semana02;
public class Ejercicio1 {

    public static void main(String[] args) {
         Product product1 = new Product ("laptop", 999.99, 10);
        Product product2 = new Product("Smartphone" , 499.99, 5);

        product1.showProduct();
        product2.showProduct();

        product1.sell(3);
        product1.sell(8);

        product1.restock(5);
        product1.showProduct();

        product1.sell(8);
        product1.showProduct();
    }
}