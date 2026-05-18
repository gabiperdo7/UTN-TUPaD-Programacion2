
package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
    }

    public void listarLibros() {
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);

        if (libro != null) {
            libros.remove(libro);
            System.out.println("Libro eliminado correctamente.");
        } else {
            System.out.println("No se encontro el libro.");
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
            }
        }
    }

    public void mostrarAutoresDisponibles() {
        ArrayList<Autor> autoresMostrados = new ArrayList<>();

        for (Libro libro : libros) {
            Autor autor = libro.getAutor();

            if (!autoresMostrados.contains(autor)) {
                autor.mostrarInfo();
                autoresMostrados.add(autor);
            }
        }
    }
}
