package unidad3.actividad4.models;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int velocidad;
    private boolean encendido;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
        this.encendido = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        if (velocidad >= 0) {
            this.velocidad = velocidad;
        } else {
            System.out.println("La velocidad no puede ser negativa.");
        }
    }
    public boolean isEncendido() {
        return encendido;
    }
    
    public void encender() {
        encendido = true;
        System.out.println(marca + " " + modelo + " encendido.");
    }

    public void apagar() {
        encendido = false;
        velocidad = 0;
        System.out.println(marca + " " + modelo + " apagado.");
    }

    public void acelerar(int incremento) {
        if (encendido) {
            velocidad += incremento;
            System.out.println("Acelerando... Velocidad actual: " + velocidad + " km/h");
        } else {
            System.out.println("No puedes acelerar, el vehículo está apagado.");
        }
    }

    public void frenar(int decremento) {
        if (velocidad > 0) {
            velocidad -= decremento;
            if (velocidad < 0) velocidad = 0;
            System.out.println("Frenando... Velocidad actual: " + velocidad + " km/h");
        } else {
            System.out.println("El vehículo ya está detenido.");
        }
}
}