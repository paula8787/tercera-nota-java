package unidad3.actividad4;

import unidad3.actividad4.models.*;

public class App {

    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 4);
        Moto moto = new Moto("Harley-Davidson", "Street 750", false);

        carro.encender();
        carro.acelerar(20);
        carro.acelerar(30);
        carro.apagar();

        moto.encender();
        moto.acelerar(15);
        moto.acelerar(25);
        moto.apagar();
    }
}
