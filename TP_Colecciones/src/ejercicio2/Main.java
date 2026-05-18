
package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca UTN");

        Autor a1 = new Autor("A001", "Gabriel Garcia Marquez", "Colombiana");
        Autor a2 = new Autor("A002", "Julio Cortazar", "Argentina");
        Autor a3 = new Autor("A003", "Isabel Allende", "Chilena");

        biblioteca.agregarLibro("ISBN001", "Cien anos de soledad", 1967, a1);
        biblioteca.agregarLibro("ISBN002", "Rayuela", 1963, a2);
        biblioteca.agregarLibro("ISBN003", "La casa de los espiritus", 1982, a3);
        biblioteca.agregarLibro("ISBN004", "El amor en los tiempos del colera", 1985, a1);
        biblioteca.agregarLibro("ISBN005", "Bestiario", 1951, a2);

        System.out.println("LISTADO DE LIBROS:");
        biblioteca.listarLibros();

        System.out.println("\nBUSCAR LIBRO POR ISBN:");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN002");
        if (buscado != null) {
            buscado.mostrarInfo();
        }

        System.out.println("\nLIBROS PUBLICADOS EN 1967:");
        biblioteca.filtrarLibrosPorAnio(1967);

        System.out.println("\nELIMINAR LIBRO ISBN003:");
        biblioteca.eliminarLibro("ISBN003");

        System.out.println("\nLIBROS RESTANTES:");
        biblioteca.listarLibros();

        System.out.println("\nCANTIDAD TOTAL DE LIBROS:");
        System.out.println(biblioteca.obtenerCantidadLibros());

        System.out.println("\nAUTORES DISPONIBLES:");
        biblioteca.mostrarAutoresDisponibles();
    }
}
