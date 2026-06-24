
package excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaTryWithResources {

    public static void main(String[] args) {

        try (BufferedReader lector = new BufferedReader(new FileReader("datos.txt"))) {

            String linea;

            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo con try-with-resources.");
        }

        System.out.println("Programa finalizado.");
    }
}
