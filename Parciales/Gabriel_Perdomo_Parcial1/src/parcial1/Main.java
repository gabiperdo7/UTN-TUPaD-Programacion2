
package parcial1;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE GESTION DE CURSOS ===");

        Curso curso1 = new Curso(1, "Programacion II", 40, 25000);
        Curso curso2 = new Curso(2, "Base de Datos I", 30);
        Curso curso3 = new Curso(3, "Probabilidad y Estadistica", 50, 30000);

        curso1.actualizarPrecio(10.0);
        curso2.actualizarPrecio(5000);

        System.out.println("\n=== INFORMACION DE LOS CURSOS ===");
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);

        System.out.println("\nTotal de cursos creados: " + Curso.mostrarTotalCursos());

        System.out.println("\n=== PRUEBAS CON DATOS INVALIDOS ===");

        try {
            Curso cursoInvalido1 = new Curso(4, "", 20, 15000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error detectado: " + e.getMessage());
        }

        try {
            Curso cursoInvalido2 = new Curso(5, "Curso invalido", -10, 15000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error detectado: " + e.getMessage());
        }

        try {
            Curso cursoInvalido3 = new Curso(6, "Curso invalido", 20, -5000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error detectado: " + e.getMessage());
        }

        try {
            curso3.actualizarPrecio(-15.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error detectado: " + e.getMessage());
        }

        try {
            curso3.setNombre(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error detectado: " + e.getMessage());
        }

        System.out.println("\nTotal final de cursos creados correctamente: " + Curso.mostrarTotalCursos());
    }
}
