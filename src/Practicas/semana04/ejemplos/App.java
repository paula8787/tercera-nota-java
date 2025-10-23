package Practicas.semana04.ejemplos;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        int sum = calculator.add(5, 3);
        int difference = calculator.subtract(10, 4);
        int product = calculator.multiply(2, 6);
        double quotient = calculator.divide(8, 2);
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
