import java.util.Scanner;

public class Ejercicio_11 {

    static double DESCUENTO_ESPECIAL = 0.10;

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("Descuento aplicado: " + descuentoAplicado);
        System.out.println("Precio final: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(sc.nextLine());

        calcularDescuentoEspecial(precio);

        sc.close();
    }
}
