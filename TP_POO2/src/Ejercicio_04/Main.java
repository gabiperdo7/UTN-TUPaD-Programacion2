
package Ejercicio_04;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== EJERCICIO 4: PRODUCTOS ===");

        Producto p1 = new Producto("Teclado", 20000);
        Producto p2 = new Producto("Mouse");

        System.out.println(p1);
        System.out.println(p2);

        p1.aplicarDescuento(10);
        p2.aplicarDescuento(50, 60);
        
        p1.aplicarDescuento(-5);
        p2.setPrecioBase(-100);

        System.out.println("\nLuego de aplicar descuentos:");
        System.out.println(p1);
        System.out.println(p2);

        Producto.cambiarIVA(0.105);

        System.out.println("\nLuego de cambiar IVA:");
        System.out.println(p1);
        System.out.println(p2);

        try {
            Producto p3 = new Producto("Monitor", -5000);
            System.out.println(p3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear producto: " + e.getMessage());
        }
    }
}
