package unidad5.panaderiaMiga.App;

import domain.Cliente;
import domain.Producto;
import service.PanaderiaService;

public class Main {
    public static void main (String[] args) {
        var service = new PanaderiaService();
        var cliente = new Cliente ("karen", "3101234567");
        var pedido = service.crearPdido(cliente);

        service.agregarItem(pedido, Producto.CROISSANT, 6);
        service.agregarItem(pedido, unidad5.panaderiaMiga.domain.Producto.PAN_CHOCOLATE, 2);

        System.out.println(service.resume(pedido));

        service.confirmar(pedido);
        System.out.println("Pedido confirmado: " + pedido.getEstado());
    }
}