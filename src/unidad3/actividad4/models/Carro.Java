package unidad3.actividad4.models;

public class Carro extends Vehiculo {
    private int numeroPuertas;

    public Carro(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void acelerar(int incremento) {
        if (isEncendido()) {
            setVelocidad(getVelocidad() + incremento);
            System.out.println(getMarca() + " " + getModelo() + " acelerando. Velocidad actual: " + getVelocidad() + " km/h");
        } else {
            System.out.println("El carro está apagado. No se puede acelerar.");
        }
    }
}


