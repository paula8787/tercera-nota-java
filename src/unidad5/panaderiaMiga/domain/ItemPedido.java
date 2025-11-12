package unidad5.panaderiaMiga.domain;

import java.util.Objects;

public class ItemPedido {
    private final Producto producto;
    private final int cantidad;

    public ItemPedido(Producto producto, int cantidad){
        this.producto = Objects.requireNonNull(producto, "producto requerido");
        if (cantidad <= 0)
            throw new IllegalArgumentException("la cantidad debe ser > 0");
        this.cantidad = cantidad;
    }
    public Producto getProducto() {
        return producto;
    }
    public int getCantidad(){
        return cantidad;
    }
    public int precioUnitarioAplicado(){
        return (cantidad >= 6) ? producto.getPrecioVolumen() : producto.getPrecio();
    }
    public int subtotal(){
        return precioUnitarioAplicado() * cantidad;
    }
    @Override
    public String toString(){
        return "%s x %d (unid=%,d) subtotal=%,d".formatted(producto.name(), cantidad, precioUnitarioAplicado(), subtotal());
    }
}
