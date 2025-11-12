package unidad5.panaderiaMiga.domain;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class Pedido {
    private final Cliente cliente;
    private final List<ItemPedido> items = new ArrayList<>();
    private EstadoPedido estado = EstadoPedido.EN_PROCESO;

    public Pedido(Cliente cliente){
        this.cliente = Objects.requireNonNull(cliente, "cliente requerido");
    }

    public Cliente getCliente(){
        return cliente;
    }

    public List<ItemPedido> getItems(){
        return items;
    }

    public EstadoPedido getEstado(){
        return estado;
    }

    public void AgregarItem(Producto p, int cant){
        if (estado == EstadoPedido.CONFIRMADO){
            throw new IllegalStateException("no se puede editar un pedido ya confirmado");
        }
        items.add(new ItemPedido(p, cant));
    }

    public void confirmar() {
        if (items.isEmpty()){
            throw new IllegalStateException("no se puede confirmar un pedido sin items");
        }
        this.estado = EstadoPedido.CONFIRMADO;
    }

    public int totalBruto(){
        return items.stream().mapToint(ItemPedido::subtotal).sum();
    }

    public int descuento(){
        int bruto = totalBruto();
        if (bruto > 60000) {
            return (int) Math.round(bruto * 0.05);
        } 
        return 0;
    }

    public int totalFinal(){
        int bruto = totalBruto();
        int totalFinal = bruto - descuento();
        if (totalFinal < 0){
            throw new IllegalStateException("el total no puede ser negativo");
        }
        return totalFinal;
    }

    @Override
    public String toString(){
        return "Pedido{" + cliente + ", items=" + items.size() + ", estado=" + estado +"}";
    }
    
}

