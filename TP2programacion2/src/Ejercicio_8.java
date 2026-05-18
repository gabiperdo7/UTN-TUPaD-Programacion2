import java.util.Scanner;

public class Ejercicio_8 {

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio base: ");
        double precio = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese el impuesto (%): ");
        double impuesto = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese el descuento (%): ");
        double descuento = Double.parseDouble(sc.nextLine());

        double resultado = calcularPrecioFinal(precio, impuesto, descuento);

        System.out.println("El precio final es: " + resultado);

        sc.close();
    }
}
