
package interfaces;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== SISTEMA E-COMMERCE =====");

        Cliente cliente = new Cliente("Gabriel", "gabiperdo7@gmail.com");

        Producto producto1 = new Producto("Teclado", 25000);
        Producto producto2 = new Producto("Mouse", 15000);
        Producto producto3 = new Producto("Auriculares", 30000);

        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);
        pedido.agregarProducto(producto3);

        double total = pedido.calcularTotal();

        System.out.println("Total del pedido: $" + total);

        TarjetaCredito tarjeta = new TarjetaCredito();

        double totalConDescuento = tarjeta.aplicarDescuento(total);

        System.out.println("Total con descuento por tarjeta: $" + totalConDescuento);

        tarjeta.procesarPago(totalConDescuento);

        pedido.cambiarEstado("Pagado");

        PayPal paypal = new PayPal();

        System.out.println();
        System.out.println("Ejemplo de pago con PayPal sin descuento:");

        paypal.procesarPago(total);
    }
}
