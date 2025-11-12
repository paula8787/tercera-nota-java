#LA MIGA

Cada mañana, la Panadería Artesanal La Miga abre con una fila de clientes que hacen encargos para recoger el mismo día. Karen, la dueña, anota a mano el nombre y teléfono de cada cliente y arma el pedido con un pequeño catálogo fijo: Baguette ($6.000, o $5.500 c/u si llevan 6 o más), Croissant ($4.500, o $4.000 c/u desde 6), y Pan de chocolate ($5.500, o $5.000 c/u desde 6). Al final, necesita que el sistema calcule el total y, si el total bruto supera $60.000, aplique un descuento del 5%. También quiere evitar errores: no aceptar cantidades en cero o negativas, y una vez que el pedido esté confirmado, nadie pueda editarlo. Para agilizar la entrega, Karen pide un resumen claro del pedido (cliente, ítems con precios usados —normal o por volumen—, subtotal, descuento y total final). No llevará inventario ni pagos: solo tomar pedidos por cliente, agregar ítems con su precio unitario vigente (o por volumen cuando aplique), confirmar y listar el resumen. Busca un módulo sencillo, modular y mantenible, que reemplace su libreta y le permita atender más rápido sin perder exactitud.

Primer paso: Extraer requerimientos funcionales del relato RF1. Registrar cliente (nombre, telefono). RF2. Crear pedido en estado EN_CREACION. RF3. Agregar items al pedido (producto, cantidad). RF4. Usar precio por volumuen si la cantidad de un producto >= 6. RF5. Calcular total (suma de subtotales y, si el total bruto > 60k, aplicar el 5% descuento). RF6. Confirmacion pedido -> estado CONFIMADO; luego de esto no se puede editar. RF7. Validar: cantidades > 0; totaltes no negativos. RF8. Listar resumen: cabecera, detalle (precio normal o por volumen), subtutol, descuento y total final.

Segunto paso: Reglas del negocio

Catalogo fijo: Baguette: 6.000 / volumen 5.500 Croissant: 4.500 / volumen 4.000 Pan de chocolate: 5.500 / volumen 5.000
Volumen por producto.
Descuento: 5% si el total bruto > 60.000
Estados: EN_CREACION -> CONFIMADO
No BD, ni inventarios... ni GUI
Tercer paso: Criterios de aceptacion (Given/When/Then) CA1. Volumen: Dado Croissant x6, cuando calculo el subtotal, entonces uso 4.000 c/u (no 4.500). CA2. Descuento: Dado total bruto 61.000, cuando calculo total final, entonces aplico 5% y obtengo 57.950. CA3. Bloqueo: Dado pedido CONFIRMADO, cuando intento agregar items, entonces se rechaza. CA4. Validaciopn: Dado cantidad 0, cuando agrego item, entonces se rechaza. CA5. Resumen: Dado un pedido valido, cuando pido el resumen, entonces se listan items con precio aplicado, subtotal, descuento y total final.

Cuarto paso - Limite del diseño <= 5 clases

Cliente (entidad simple).
Producto (puede ser enum con precios del dia).
ItemPedido (producto + cantidad, calcula su subtotal segun volumen).
Pedido (compone ItemPedido, conoce estado, calcula total + descuento, confirma).
PanaderiaService (coordina casos de uso: crear pedido, agregar item, confirma, resumen)
Quinto paso: Flujo de consola

Ingresar cliente.
Crear pedido.
Seleccionar producto y cantidad.
Mostrar resumen: detalle con precio aplicado, subtotal por item, total bruto, descuento y total final.
Confirmo pedido.
Intentar editar post-confirmacion --> debe fallar.
Estuctura modular /la-miga/ ├─ domain/ (Cliente, Producto, ItemPedido, Pedido, EstadoPedido) ├─ service/ (PanaderiaService) └─ app/ (Main flujo de la consola)