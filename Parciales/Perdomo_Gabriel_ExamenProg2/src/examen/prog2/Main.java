
package examen.prog2;

import examen.prog2.entities.Categoria;
import examen.prog2.entities.Pedido;
import examen.prog2.entities.Producto;
import examen.prog2.entities.Usuario;
import examen.prog2.entities.DetallePedido;
import examen.prog2.enums.Estado;
import examen.prog2.enums.FormaPago;
import examen.prog2.enums.Rol;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Categoria bebidas = new Categoria("Bebidas", "Bebidas frias y calientes");
        Categoria comidas = new Categoria("Comidas", "Platos principales y comidas rapidas");
        Categoria postres = new Categoria("Postres", "Opciones dulces para despues de comer");

        Producto agua = new Producto("Agua mineral", 1200.0, "Botella de agua sin gas 500ml", 50, "agua.jpg", true, bebidas);
        Producto gaseosa = new Producto("Gaseosa cola", 1800.0, "Botella de gaseosa cola 500ml", 40, "gaseosa.jpg", true, bebidas);

        Producto hamburguesa = new Producto("Hamburguesa completa", 5200.0, "Hamburguesa con queso, lechuga y tomate", 25, "hamburguesa.jpg", true, comidas);
        Producto pizza = new Producto("Pizza muzzarella", 6500.0, "Pizza grande de muzzarella", 20, "pizza.jpg", true, comidas);

        Producto helado = new Producto("Helado artesanal", 3000.0, "Vaso de helado de dos sabores", 30, "helado.jpg", true, postres);
        Producto torta = new Producto("Porcion de torta", 2800.0, "Porcion de torta de chocolate", 15, "torta.jpg", true, postres);

        Usuario admin = new Usuario(
                "Gabriel",
                "Perdomo",
                "gabriel.admin@mail.com",
                "3442310793",
                "admin123",
                Rol.ADMIN
        );

        Usuario cliente = new Usuario(
                "Lucia",
                "Fernandez",
                "lucia.usuario@mail.com",
                "3442555666",
                "usuario123",
                Rol.USUARIO
        );

        Pedido pedido1 = new Pedido(LocalDate.now(), Estado.PENDIENTE, FormaPago.EFECTIVO, admin);
        pedido1.addDetallePedido(2, agua);
        pedido1.addDetallePedido(1, hamburguesa);
        pedido1.addDetallePedido(1, helado);

        Pedido pedido2 = new Pedido(LocalDate.now(), Estado.CONFIRMADO, FormaPago.TARJETA, admin);
        pedido2.addDetallePedido(1, gaseosa);
        pedido2.addDetallePedido(2, pizza);
        pedido2.addDetallePedido(2, torta);

        Pedido pedido3 = new Pedido(LocalDate.now(), Estado.TERMINADO, FormaPago.TRANSFERENCIA, cliente);
        pedido3.addDetallePedido(3, agua);
        pedido3.addDetallePedido(1, pizza);
        pedido3.addDetallePedido(1, torta);

        Pedido pedido4 = new Pedido(LocalDate.now(), Estado.CANCELADO, FormaPago.EFECTIVO, cliente);
        pedido4.addDetallePedido(2, gaseosa);
        pedido4.addDetallePedido(1, hamburguesa);
        pedido4.addDetallePedido(2, helado);

        List<Usuario> usuarios = Arrays.asList(admin, cliente);

        imprimirReporteUsuarios(usuarios);
    }

    private static void imprimirReporteUsuarios(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            double totalAcumulado = 0.0;

            System.out.println("================================================================");
            System.out.printf(
                    "USUARIO: %s %s | Mail: %s | Rol: %s%n",
                    usuario.getNombre(),
                    usuario.getApellido(),
                    usuario.getMail(),
                    usuario.getRol()
            );
            System.out.println("================================================================");

            for (Pedido pedido : usuario.getPedidos()) {
                System.out.printf(
                        "Pedido #%d | Fecha: %s | Estado: %s | FormaPago: %s%n",
                        pedido.getId(),
                        pedido.getFecha(),
                        pedido.getEstado(),
                        pedido.getFormaPago()
                );

                for (DetallePedido detalle : pedido.getDetalles()) {
                    System.out.println(detalle);
                }

                System.out.printf("TOTAL DEL PEDIDO: $%.2f%n", pedido.getTotal());
                System.out.println("----------------------------------------------------------------");

                totalAcumulado += pedido.getTotal();
            }

            System.out.printf("TOTAL ACUMULADO DEL USUARIO: $%.2f%n", totalAcumulado);
            System.out.println("================================================================");
            System.out.println();
        }
    }
}
