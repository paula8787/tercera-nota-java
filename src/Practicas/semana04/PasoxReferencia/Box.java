package Practicas.semana04.PasoxReferencia;
public class Box {
    int size;
    public Box(int size) {
        this.size = size;
    }
    public void increaseSize(int increment) {
        this.size += increment;
    }
    public int size() {
        return size;
    }

}