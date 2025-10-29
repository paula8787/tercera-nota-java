package unidad3.actividad4.models;

public class Moto extends Vehiculo {
    private boolean tieneSidecar;
    public Moto(String marca, String modelo, boolean tieneSidecar) {
        super(marca, modelo);
        this.tieneSidecar = tieneSidecar;
    }
    public boolean isTieneSidecar() {
        return tieneSidecar;
    }
    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }
    @Override
    public void acelerar(int incremento) {
        if (isEncendido()) {
            setVelocidad(getVelocidad() + incremento);
            System.out.println(getMarca() + " " + getModelo() + " acelerando. Velocidad actual: " + getVelocidad() + " km/h");
        } else {
            System.out.println("La moto está apagada. No se puede acelerar.");
        }
    }
    
}
