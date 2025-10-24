package unidad3.actividad1.utils;

public class SafeCalculator {

    public double divide(int a, int b) throws InvalidInputException {
        try {
            // Validate inputs - check for negative numbers
            if (a < 0 || b < 0) {
                throw new InvalidInputException(
                    "Negative numbers are not allowed. Received: a=" + a + ", b=" + b
                );
            }
            
            // Perform division - this will throw ArithmeticException if b is 0
            return (double) a / b;
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
            throw e; // Re-throw to let caller handle it
        } finally {
            System.out.println("End of operation.");
        }
    }
    
    /**
     * Alternative method that handles all exceptions internally
     * Returns a default value instead of throwing exceptions
     */
    public double divideSafe(int a, int b) {
        try {
            if (a < 0 || b < 0) {
                throw new InvalidInputException(
                    "Negative numbers are not allowed. Received: a=" + a + ", b=" + b
                );
            }
            
            if (b == 0) {
                throw new ArithmeticException("Division by zero");
            }
            
            return (double) a / b;
            
        } catch (InvalidInputException e) {
            System.out.println("Invalid Input: " + e.getMessage());
            return 0.0;
        } catch (ArithmeticException e) {
            System.out.println("Math Error: Cannot divide by zero!");
            return 0.0;
        } finally {
            System.out.println("End of operation.");
        }
    }
}