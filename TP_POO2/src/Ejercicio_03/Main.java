
package Ejercicio_03;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== EJERCICIO 3: ALUMNOS ===");

        Alumno a1 = new Alumno("Marina", 7.5);
        Alumno a2 = new Alumno("Pedro");

        a2.actualizarPromedio(5.5);

        double[] notas = {8, 9, 7};
        a1.actualizarPromedio(notas);

        a2.actualizarPromedio(15); 
        double[] notasInvalidas = {10, 8, -2};
        a1.actualizarPromedio(notasInvalidas);

        System.out.println(a1);
        System.out.println(a2);

        System.out.println("\nNota de aprobacion actual: " + Alumno.getNotaAprobacion());

        Alumno.cambiarNotaAprobacion(7.0);

        System.out.println("\nLuego de cambiar la nota de aprobacion:");
        System.out.println(a1);
        System.out.println(a2);

        try {
            Alumno a3 = new Alumno("", 6);
            System.out.println(a3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear alumno: " + e.getMessage());
        }
    }
}
