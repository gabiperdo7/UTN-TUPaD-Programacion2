
import java.util.Scanner;

public class Ejercicio_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese primer número: ");
        int num1 = Integer.parseInt(sc.nextLine()); 

        System.out.print("Ingrese segundo número: ");
        int num2 = Integer.parseInt(sc.nextLine()); 

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / num2));

        sc.close();
    }

}
