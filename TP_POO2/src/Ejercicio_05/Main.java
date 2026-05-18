
package Ejercicio_05;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== EJERCICIO 5: CUENTAS ===");

        Cuenta c1 = new Cuenta("Gabriel", 50000);
        Cuenta c2 = new Cuenta("Lucia");

        System.out.println(c1);
        System.out.println(c2);

        c1.depositar(10000);
        c1.extraer(20000);

        c2.depositar(5000);
        c2.extraer(7000); 

        c1.depositar(-100);
        c2.extraer(-500);

        System.out.println("\nLuego de operaciones:");
        System.out.println(c1);
        System.out.println(c2);

        double cotizacion = 1360.0;
        System.out.println("\nSaldo de c1 en pesos: " + String.format("%.2f", c1.consultarSaldo()));
        System.out.println("Saldo de c1 en dolares: " + String.format("%.2f", c1.consultarSaldo(cotizacion)));

        System.out.println("\nTotal de cuentas creadas: " + Cuenta.mostrarTotalCuentas());

        try {
            Cuenta c3 = new Cuenta("", 1000);
            System.out.println(c3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear cuenta: " + e.getMessage());
        }
    }
}
