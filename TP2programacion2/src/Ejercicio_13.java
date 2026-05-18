public class Ejercicio_13 {

    public static void mostrarArray(double[] array, int indice) {
        if (indice >= array.length) {
            return;
        }

        System.out.println("Precio: $" + array[indice]);
        mostrarArray(array, indice + 1);
    }

    public static void main(String[] args) {

        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        mostrarArray(precios, 0);

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        mostrarArray(precios, 0);
    }
}
