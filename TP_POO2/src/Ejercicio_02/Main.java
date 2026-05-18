
package Ejercicio_02;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== EJERCICIO 2: LIBROS ===");

        Libro l1 = new Libro("Java Basico", "Ana Lopez");
        Libro l2 = new Libro("POO en Java", "Carlos Diaz", "Alfaomega");

        System.out.println(l1);
        System.out.println(l2);

        l1.actualizarTitulo("Manual", "Java Moderno");
        l2.actualizarTitulo("Programacion Orientada a Objetos");

        l1.actualizarTitulo("");

        System.out.println("\nLuego de actualizar titulos:");
        System.out.println(l1);
        System.out.println(l2);

        Libro.cambiarEditorial("Planeta");

        System.out.println("\nLuego de cambiar editorial global:");
        System.out.println(l1);
        System.out.println(l2);

        try {
            Libro l3 = new Libro("", "Autor X");
            System.out.println(l3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear libro: " + e.getMessage());
        }
    }
}
