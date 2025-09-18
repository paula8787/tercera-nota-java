package bin.semana05.Carro.PasoPorReferencia;

public class Box {
    int size;

    public Box(int size) {
        this.size = size;
    }
    public void increaseSide(int increment) {
        this.size += increment;
    }
    public int size() {
        return this.size;
    }
}