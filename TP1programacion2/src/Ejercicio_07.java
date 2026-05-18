
import java.util.Scanner;

public class Ejercicio_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // corregido

        System.out.println("Hola, " + nombre);
    }

}

// El error era usar nextInt() para leer un String.
// nextInt() solo sirve para números enteros.
// Se corrige usando nextLine() para leer texto.