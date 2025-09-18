
package semana05.Carro;
public class Car {
    String brand;
    int year;

    public Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public void Showinfo() {
        System.out.println("La marca es: " + brand + ", el año del auto es: " + year);
    }
}
