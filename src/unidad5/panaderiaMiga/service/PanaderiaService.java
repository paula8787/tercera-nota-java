package unidad5.panaderiaMiga.service;

import domain.Cliente;
import domain.Pedido;
import domain.Producto;

public class PanaderiaService {
    
    public Pedido crearPedido(cliente cliente) {
        return new Pedido(cliente);
    }

    public void agregarItem(Pedido p, Producto prod, int cant) {
        p.AgregarItem(prod, cant);
    }

    public void confirmar(Pedido p) {
        p.confirmar();
    }

    public String resume(unidad5.panaderiaMiga.domain.Pedido p) {
        StringBuilder sb = new StringBuilder();

        sb.append("=== RESUMEN DEL PEDIDO ===\n");
        sb.append("Cliente: ").append(p.getCliente().nombre()).append(" | Tel: ").append(p.getCliente().telefono()).append("\n");
        sb.append("Estado:").append(p.getEstado()).append("\n");
        sb.append("----------------------------\n");
        for (var iterable_element : p.getItems()) {
            sb.append(String.format("%-15s x%-3d unit=%,6d subtotal=%,7d\\n",
            iterable_element.getProducto(),
            iterable_element.getCantidad(),
            iterable_element.precioUnitarioAplicado(),
            iterable_element.subtotal()));
        }
        sb.append("----------------------------\n");
        int bruto = p.totalBruto();
        int descuento = p.descuento();
        int total = p.totalFinal();
        sd.append(String.format("Total bruto: %,d", bruto));
        sb.append(String.format("Total bruto: %,d" , bruto));
        sb.append(String.format("Total bruto: %,d" , bruto));
        return sb.toString();
    }
}
