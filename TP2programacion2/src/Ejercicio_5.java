import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int numero;

        while (true) {
            System.out.print("Ingrese un numero (0 para terminar): ");
            numero = Integer.parseInt(sc.nextLine());

            if (numero == 0) break;

            if (numero % 2 == 0) {
                suma += numero;
            }
        }

        System.out.println("La suma de los numeros pares es: " + suma);

        sc.close();
    }
}
