import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese la categoria (A, B o C): ");
        String categoria = sc.nextLine().toUpperCase();

        double descuento = 0;

        switch (categoria) {
            case "A": descuento = 0.10; break;
            case "B": descuento = 0.15; break;
            case "C": descuento = 0.20; break;
            default:
                System.out.println("Categoria invalida");
                sc.close();
                return;
        }

        double precioFinal = precio - (precio * descuento);

        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);

        sc.close();
    }
}
