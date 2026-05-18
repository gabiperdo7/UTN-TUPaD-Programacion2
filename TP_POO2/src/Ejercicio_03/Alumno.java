
package Ejercicio_03;

public class Alumno {

    private String nombre;
    private double promedio;
    private static double notaAprobacion = 6.0;

    public Alumno(String nombre, double promedio) {
        this.validarNombre(nombre);
        this.nombre = nombre.trim();
        this.setPromedio(promedio);
    }

    public Alumno(String nombre) {
        this(nombre, 0.0);
    }

    public void actualizarPromedio(double nuevoPromedio) {
        this.setPromedio(nuevoPromedio);
    }

    public void actualizarPromedio(double[] notas) {
        if (notas == null || notas.length == 0) {
            System.out.println("Error: el array de notas no puede ser nulo ni vacio.");
            return;
        }

        double suma = 0;
        for (double nota : notas) {
            if (nota < 0 || nota > 10) {
                System.out.println("Error: hay notas fuera de rango. No se actualizo el promedio.");
                return;
            }
            suma += nota;
        }

        this.promedio = suma / notas.length;
    }

    public boolean aprobo() {
        return this.promedio >= notaAprobacion;
    }

    public static void cambiarNotaAprobacion(double nueva) {
        if (nueva < 0 || nueva > 10) {
            System.out.println("Error: la nota de aprobacion debe estar entre 0 y 10.");
            return;
        }
        notaAprobacion = nueva;
    }

    private void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo ni vacio.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.validarNombre(nombre);
        this.nombre = nombre.trim();
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio < 0) {
            this.promedio = 0;
        } else if (promedio > 10) {
            this.promedio = 10;
        } else {
            this.promedio = promedio;
        }
    }

    public static double getNotaAprobacion() {
        return notaAprobacion;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", promedio=" + String.format("%.2f", promedio) +
                ", estado=" + (aprobo() ? "Aprueba" : "No aprueba") +
                '}';
    }
}
