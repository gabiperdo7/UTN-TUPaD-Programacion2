
package EjercicioDos;

public class Demo {

    public static void main(String[] args) {

        Figura[] figuras = {
            new Circulo("Circulo", 5),
            new Rectangulo("Rectangulo", 4, 6)
        };

        for (Figura figura : figuras) {
            System.out.printf(
                    "Figura: %s - Area: %.2f%n",
                    figura.getNombre(),
                    figura.calcularArea()
            );
        }
    }
}
