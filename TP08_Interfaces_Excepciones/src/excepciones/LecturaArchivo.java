
package excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo {

    public static void main(String[] args) {

        BufferedReader lector = null;

        try {
            lector = new BufferedReader(new FileReader("datos.txt"));

            String linea;

            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo datos.txt no existe.");

        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");

        } finally {
            try {
                if (lector != null) {
                    lector.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo.");
            }

            System.out.println("Programa finalizado.");
        }
    }
}
