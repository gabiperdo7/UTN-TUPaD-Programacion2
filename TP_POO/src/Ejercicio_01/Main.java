
package Ejercicio_01;

public class Main {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        estudiante.setNombre("");
        estudiante.setApellido(" ");
        estudiante.setCurso("");
        estudiante.setCalificacion(12);

        estudiante.setNombre("Gabriel");
        estudiante.setApellido("Perdomo");
        estudiante.setCurso("Programacion II");
        estudiante.setCalificacion(8.5);

        estudiante.mostrarInfo();

        estudiante.subirCalificacion(1.0);
        estudiante.mostrarInfo();

        estudiante.subirCalificacion(2.0);
        estudiante.bajarCalificacion(3.0);
        estudiante.mostrarInfo();

        estudiante.bajarCalificacion(10.0);
    }
}
