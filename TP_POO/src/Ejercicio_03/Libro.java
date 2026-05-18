
package Ejercicio_03;

import java.time.Year;

public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Error: el titulo no puede estar vacio.");
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor != null && !autor.trim().isEmpty()) {
            this.autor = autor;
        } else {
            System.out.println("Error: el autor no puede estar vacio.");
        }
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        int anioActual = Year.now().getValue();

        if (anioPublicacion > 0 && anioPublicacion <= anioActual) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Error: el año de publicacion no es valido.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo + " | Autor: " + autor + " | Año: " + anioPublicacion);
    }
}
