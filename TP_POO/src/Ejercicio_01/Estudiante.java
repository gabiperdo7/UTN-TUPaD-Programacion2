
package Ejercicio_01;

public class Estudiante {

    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre no puede estar vacio.");
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido != null && !apellido.trim().isEmpty()) {
            this.apellido = apellido;
        } else {
            System.out.println("Error: el apellido no puede estar vacio.");
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (curso != null && !curso.trim().isEmpty()) {
            this.curso = curso;
        } else {
            System.out.println("Error: el curso no puede estar vacio.");
        }
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion >= 0.0 && calificacion <= 10.0) {
            this.calificacion = calificacion;
        } else {
            System.out.println("Error: la calificacion debe estar entre 0 y 10.");
        }
    }

    public void subirCalificacion(double puntos) {
        if (puntos > 0 && calificacion + puntos <= 10.0) {
            calificacion += puntos;
            System.out.println("Calificacion aumentada correctamente.");
        } else {
            System.out.println("Error: no se puede subir la calificacion.");
        }
    }

    public void bajarCalificacion(double puntos) {
        if (puntos > 0 && calificacion - puntos >= 0.0) {
            calificacion -= puntos;
            System.out.println("Calificacion disminuida correctamente.");
        } else {
            System.out.println("Error: no se puede bajar la calificacion.");
        }
    }

    public void mostrarInfo() {
        System.out.printf("Nombre: %s %s | Curso: %s | Calificación: %.2f%n",
                nombre, apellido, curso, calificacion);
    }
}
