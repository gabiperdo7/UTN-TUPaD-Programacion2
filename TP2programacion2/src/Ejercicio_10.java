import java.util.Scanner;

public class Ejercicio_10 {

    public static int actualizarStock(int stockActual, int vendida, int recibida) {
        return stockActual - vendida + recibida;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese stock actual: ");
        int stock = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese cantidad vendida: ");
        int vendida = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese cantidad recibida: ");
        int recibida = Integer.parseInt(sc.nextLine());

        int nuevoStock = actualizarStock(stock, vendida, recibida);

        System.out.println("El nuevo stock es: " + nuevoStock);

        sc.close();
    }
}
