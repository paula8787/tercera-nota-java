package actividadesU2.EstructuraDeControl;

public class Main {
    public static void main(String[] args) {
        CarRental rental = new CarRental();

        // Add cars
        rental.addCar(new Car("Toyota Corolla", 50, true));
        rental.addCar(new Car("Honda Civic", 60, true));
        rental.addCar(new Car("Ford Mustang", 120, false));
        rental.addCar(new Car("Chevrolet Spark", 40, true));

        // Show available cars
        rental.showAvailableCars();

        // Search for a car and rent it
        System.out.println("\nSearching for 'Honda Civic'...");
        Car foundCar = rental.searchCar("Honda Civic");

        if (foundCar != null) {
            rental.calculateTotal(foundCar, 3);
        }

        // Show available cars again
        System.out.println("\nAfter rental:");
        rental.showAvailableCars();
    }
}
