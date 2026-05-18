import java.util.Scanner;

public class Ejercicio_9 {

    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            return 0;
        }
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese el peso del paquete: ");
        double peso = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese la zona (Nacional/Internacional): ");
        String zona = sc.nextLine();

        double envio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precio, envio);

        System.out.println("El costo de envío es: " + envio);
        System.out.println("El total a pagar es: " + total);

        sc.close();
    }
}
