
package examen.prog2.entities;

public class DetallePedido extends Base {

    private int cantidad;
    private Double subtotal;
    private Producto producto;

    public DetallePedido() {
        super();
        this.subtotal = 0.0;
    }

    public DetallePedido(int cantidad, Producto producto) {
        super();
        this.cantidad = cantidad;
        this.producto = producto;
        this.subtotal = calcularSubtotal();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
            this.subtotal = calcularSubtotal();
        }
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        if (subtotal != null && subtotal >= 0) {
            this.subtotal = subtotal;
        }
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        if (producto != null) {
            this.producto = producto;
            this.subtotal = calcularSubtotal();
        }
    }

    private Double calcularSubtotal() {
        if (producto == null || producto.getPrecio() == null) {
            return 0.0;
        }

        return cantidad * producto.getPrecio();
    }

    @Override
    public String toString() {
        String nombreProducto = producto != null ? producto.getNombre() : "Sin producto";

        return String.format(
                "DetallePedido #%d: %s x %d => Subtotal: $%.2f",
                getId(),
                nombreProducto,
                cantidad,
                subtotal
        );
    }
}
