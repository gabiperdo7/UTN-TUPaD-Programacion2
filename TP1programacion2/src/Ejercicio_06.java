
import java.util.Scanner;

public class Ejercicio_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese primer número: ");
        int num1 = Integer.parseInt(sc.nextLine()); 

        System.out.print("Ingrese segundo número: ");
        int num2 = Integer.parseInt(sc.nextLine()); 

        int resultadoInt = num1 / num2;
        System.out.println("División con int: " + resultadoInt);

        double resultadoDouble = (double) num1 / num2;
        System.out.println("División con double: " + resultadoDouble);

        sc.close();
    }

}
