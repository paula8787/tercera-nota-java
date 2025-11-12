package unidad5.panaderiaMiga.domain;

public enum Producto {
    BAGUETTE(6000, 5500),
    CROISSANT(4500, 4000),
    PAN_CHOCOLATE(5500, 5000);

    private final int precio;
    private final int precioVolumen;

    Producto(int precio, int precioVolumen){
        this.precio = precio;
        this.precioVolumen = precioVolumen;
    }
    public int getPrecio(){
        return precio;
    }
    public int grtPrecioVolumen(){
        return precioVolumen;
    }
}
