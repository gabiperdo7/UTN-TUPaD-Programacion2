
package ejercicio3;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor nuevoProfesor) {
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }

        this.profesor = nuevoProfesor;

        if (nuevoProfesor != null) {
            nuevoProfesor.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        String nombreProfesor = "Sin profesor";

        if (profesor != null) {
            nombreProfesor = profesor.getNombre();
        }

        System.out.println("Codigo: " + codigo +
                " | Curso: " + nombre +
                " | Profesor: " + nombreProfesor);
    }
}
