import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int n1 = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese el segundo numero: ");
        int n2 = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese el tercer numero: ");
        int n3 = Integer.parseInt(sc.nextLine());

        int mayor = n1;

        if (n2 > mayor) mayor = n2;
        if (n3 > mayor) mayor = n3;

        System.out.println("El mayor es: " + mayor);

        sc.close();
    }
}
