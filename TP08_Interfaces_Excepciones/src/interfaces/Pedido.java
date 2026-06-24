
package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {

    private List<Producto> productos;
    private String estado;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        double total = 0;

        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }

        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("El pedido cambio de estado a: " + nuevoEstado);
    }

    public String getEstado() {
        return estado;
    }
}