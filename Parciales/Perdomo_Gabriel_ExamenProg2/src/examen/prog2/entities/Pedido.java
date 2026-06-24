
package examen.prog2.entities;

import examen.prog2.enums.Estado;
import examen.prog2.enums.FormaPago;
import examen.prog2.interfaces.Calculable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pedido extends Base implements Calculable {

    private LocalDate fecha;
    private Estado estado;
    private Double total;
    private FormaPago formaPago;
    private List<DetallePedido> detalles;
    private Usuario usuario;

    public Pedido() {
        super();
        this.fecha = LocalDate.now();
        this.estado = Estado.PENDIENTE;
        this.total = 0.0;
        this.detalles = new ArrayList<>();
    }

    public Pedido(LocalDate fecha, Estado estado, FormaPago formaPago, Usuario usuario) {
        super();
        this.fecha = fecha;
        this.estado = estado;
        this.formaPago = formaPago;
        this.usuario = usuario;
        this.total = 0.0;
        this.detalles = new ArrayList<>();

        if (usuario != null) {
            usuario.agregarPedido(this);
        }
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        if (fecha != null) {
            this.fecha = fecha;
        }
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        if (estado != null) {
            this.estado = estado;
        }
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        if (total != null && total >= 0) {
            this.total = total;
        }
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        if (formaPago != null) {
            this.formaPago = formaPago;
        }
    }

    public List<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallePedido> detalles) {
        if (detalles != null) {
            this.detalles = detalles;
            calcularTotal();
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void calcularTotal() {
        double suma = 0.0;

        for (DetallePedido detalle : detalles) {
            suma += detalle.getSubtotal();
        }

        this.total = suma;
    }

    public void addDetallePedido(int cantidad, Producto producto) {
        if (cantidad > 0 && producto != null) {
            DetallePedido detallePedido = new DetallePedido(cantidad, producto);
            detalles.add(detallePedido);
            calcularTotal();
        }
    }

    public DetallePedido findDetallePedidoByProducto(Producto producto) {
        if (producto == null || producto.getId() == null) {
            return null;
        }

        for (DetallePedido detalle : detalles) {
            if (detalle.getProducto() != null
                    && Objects.equals(detalle.getProducto().getId(), producto.getId())) {
                return detalle;
            }
        }

        return null;
    }

    public void deleteDetallePedidoByProducto(Producto producto) {
        DetallePedido detalleEncontrado = findDetallePedidoByProducto(producto);

        if (detalleEncontrado != null) {
            detalles.remove(detalleEncontrado);
            calcularTotal();
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Pedido #%d | Fecha: %s | Estado: %s | FormaPago: %s | Total: $%.2f",
                getId(),
                fecha,
                estado,
                formaPago,
                total
        );
    }
}
