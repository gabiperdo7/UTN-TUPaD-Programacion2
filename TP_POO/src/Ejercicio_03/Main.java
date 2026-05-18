
package Ejercicio_03;

public class Main {

    public static void main(String[] args) {
        Libro libro = new Libro();

        libro.setTitulo("El Principito");
        libro.setAutor("El Señor de los Anillos");
        libro.setAnioPublicacion(2999);

        libro.setAnioPublicacion(1943);
        libro.mostrarInfo();
    }
}
