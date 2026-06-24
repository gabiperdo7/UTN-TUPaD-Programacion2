
package examen.prog2.entities;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends Base {

    private String nombre;
    private String descripcion;
    private List<Producto> productos;

    public Categoria() {
        super();
        this.productos = new ArrayList<>();
    }

    public Categoria(String nombre, String descripcion) {
        super();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.productos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion != null && !descripcion.trim().isEmpty()) {
            this.descripcion = descripcion;
        }
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        if (productos != null) {
            this.productos = productos;
        }
    }

    public void agregarProducto(Producto producto) {
        if (producto != null && !productos.contains(producto)) {
            productos.add(producto);

            if (producto.getCategoria() != this) {
                producto.setCategoria(this);
            }
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Categoria #%d | Nombre: %s | Descripcion: %s | Cantidad productos: %d",
                getId(),
                nombre,
                descripcion,
                productos.size()
        );
    }
}
