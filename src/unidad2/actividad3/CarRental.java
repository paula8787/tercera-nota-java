package unidad2.actividad3;

import java.util.ArrayList;

public class CarRental {
    private ArrayList<Car> cars;

    public CarRental() {
        cars = new ArrayList<>();
    }

    // Add a car to the list
    public void addCar(Car c) {
        cars.add(c);
    }

    // Show all available cars
    public void showAvailableCars() {
        System.out.println("Available cars:");
        for (Car c : cars) {
            if (c.isAvailable()) {
                System.out.println(" - " + c.getInfo());
            }
        }
    }

    // Calculate total price for a given number of days
    public void calculateTotal(Car c, int days) {
        if (c.isAvailable()) {
            double total = c.getPricePerDay() * days;
            System.out.println("Total price for " + c.getModel() + " (" + days + " days): $" + total);
            c.setAvailable(false); // mark as rented
        } else {
            System.out.println("Sorry, " + c.getModel() + " is not available.");
        }
    }

    // Bonus: search for a car by model
    public Car searchCar(String model) {
        for (Car c : cars) {
            if (c.getModel().equalsIgnoreCase(model)) {
                return c;
            }
        }
        System.out.println("Car not found.");
        return null;
    }
}
