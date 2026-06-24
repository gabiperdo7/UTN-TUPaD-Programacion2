
package excepciones;

import java.util.Scanner;

public class ConversionNumero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un numero entero: ");
            String texto = sc.nextLine();

            int numero = Integer.parseInt(texto);

            System.out.println("Numero convertido correctamente: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: el valor ingresado no es un numero entero valido.");

        } finally {
            sc.close();
            System.out.println("Programa finalizado.");
        }
    }
}
