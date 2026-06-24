
package examen.prog2.entities;

import examen.prog2.enums.Rol;
import java.util.ArrayList;
import java.util.List;

public class Usuario extends Base {

    private String nombre;
    private String apellido;
    private String mail;
    private String celular;
    private String contrasenia;
    private Rol rol;
    private List<Pedido> pedidos;

    public Usuario() {
        super();
        this.pedidos = new ArrayList<>();
    }

    public Usuario(String nombre, String apellido, String mail, String celular, String contrasenia, Rol rol) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.celular = celular;
        this.contrasenia = contrasenia;
        this.rol = rol;
        this.pedidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido != null && !apellido.trim().isEmpty()) {
            this.apellido = apellido;
        }
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        if (mail != null && !mail.trim().isEmpty()) {
            this.mail = mail;
        }
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        if (celular != null && !celular.trim().isEmpty()) {
            this.celular = celular;
        }
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        if (contrasenia != null && !contrasenia.trim().isEmpty()) {
            this.contrasenia = contrasenia;
        }
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        if (rol != null) {
            this.rol = rol;
        }
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        if (pedidos != null) {
            this.pedidos = pedidos;
        }
    }

    public void agregarPedido(Pedido pedido) {
        if (pedido != null && !pedidos.contains(pedido)) {
            pedidos.add(pedido);

            if (pedido.getUsuario() != this) {
                pedido.setUsuario(this);
            }
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Usuario #%d | Nombre: %s %s | Mail: %s | Celular: %s | Rol: %s | Cantidad pedidos: %d",
                getId(),
                nombre,
                apellido,
                mail,
                celular,
                rol,
                pedidos.size()
        );
    }
}
