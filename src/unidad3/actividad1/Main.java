package unidad3.actividad1;
import InvalidInputException.java;

public class Main {
    
    public static void main(String[] args) {
        SafeCalculator calculator = new SafeCalculator();
        
        System.out.println("=== Safe Calculator Test ===\n");
        
        // Test 1: Normal division
        System.out.println("Test 1: Normal division (10 / 2)");
        testDivision(calculator, 10, 2);
        
        System.out.println("\n" + "-".repeat(40) + "\n");
        
        // Test 2: Division by zero
        System.out.println("Test 2: Division by zero (10 / 0)");
        testDivision(calculator, 10, 0);
        
        System.out.println("\n" + "-".repeat(40) + "\n");
        
        // Test 3: Negative number (first parameter)
        System.out.println("Test 3: Negative dividend (-10 / 2)");
        testDivision(calculator, -10, 2);
        
        System.out.println("\n" + "-".repeat(40) + "\n");
        
        // Test 4: Negative number (second parameter)
        System.out.println("Test 4: Negative divisor (10 / -2)");
        testDivision(calculator, 10, -2);
        
        System.out.println("\n" + "-".repeat(40) + "\n");
        
        // Test 5: Both negative
        System.out.println("Test 5: Both negative (-10 / -2)");
        testDivision(calculator, -10, -2);
        
        System.out.println("\n" + "-".repeat(40) + "\n");
        
        // Test 6: Large numbers
        System.out.println("Test 6: Large numbers (100 / 3)");
        testDivision(calculator, 100, 3);
        
        System.out.println("\n=== All tests completed ===");
    }
    
    /**
     * Helper method to test division with proper exception handling
     */
    private static void testDivision(SafeCalculator calculator, int a, int b) {
        try {
            double result = calculator.divide(a, b);
            System.out.println("Result: " + a + " / " + b + " = " + result);
        } catch (InvalidInputException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}