
package Ejercicio_02;

public class Libro {

    private String titulo;
    private String autor;
    private static String editorial = "Independiente";

    public Libro(String titulo, String autor) {
        this.validarTexto(titulo, "El titulo no puede ser nulo ni vacio.");
        this.validarTexto(autor, "El autor no puede ser nulo ni vacio.");

        this.titulo = titulo.trim();
        this.autor = autor.trim();
    }

    public Libro(String titulo, String autor, String editorialNueva) {
        this(titulo, autor); 
        cambiarEditorial(editorialNueva);
    }

    public void actualizarTitulo(String nuevoTitulo) {
        if (nuevoTitulo == null || nuevoTitulo.trim().isEmpty()) {
            System.out.println("Titulo invalido. No se actualizo.");
            return;
        }
        this.titulo = nuevoTitulo.trim();
    }

    public void actualizarTitulo(String prefijo, String nuevoTitulo) {
        if (prefijo == null || prefijo.trim().isEmpty() || nuevoTitulo == null || nuevoTitulo.trim().isEmpty()) {
            System.out.println("Datos invalidos. No se actualizo el titulo.");
            return;
        }
        this.titulo = prefijo.trim() + " " + nuevoTitulo.trim();
    }

    public static void cambiarEditorial(String nueva) {
        if (nueva == null || nueva.trim().isEmpty()) {
            System.out.println("Editorial invalida. No se modifico.");
            return;
        }
        editorial = nueva.trim();
    }

    private void validarTexto(String texto, String mensajeError) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException(mensajeError);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            System.out.println("Titulo invalido. No se modifico.");
            return;
        }
        this.titulo = titulo.trim();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            System.out.println("Autor invalido. No se modifico.");
            return;
        }
        this.autor = autor.trim();
    }

    public static String getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
