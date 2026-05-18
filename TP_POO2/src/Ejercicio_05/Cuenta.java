
package Ejercicio_05;

public class Cuenta {

    private static int ultimoNumero = 100;
    private static int totalCuentas = 0;

    private final int numero;
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldoInicial) {
        this.validarTitular(titular);

        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }

        this.numero = ++ultimoNumero;
        this.titular = titular.trim();
        this.saldo = saldoInicial;
        totalCuentas++;
    }

    public Cuenta(String titular) {
        this(titular, 0.0);
    }

    public double consultarSaldo() {
        return saldo;
    }

    public double consultarSaldo(double cotizacionDolar) {
        if (cotizacionDolar <= 0) {
            System.out.println("Error: la cotizacion debe ser mayor que 0.");
            return -1;
        }
        return saldo / cotizacionDolar;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto a depositar debe ser mayor que 0.");
            return;
        }
        this.saldo += monto;
    }

    public void extraer(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto a extraer debe ser mayor que 0.");
            return;
        }

        if (monto > this.saldo) {
            System.out.println("Error: fondos insuficientes.");
            return;
        }

        this.saldo -= monto;
    }

    public static int mostrarTotalCuentas() {
        return totalCuentas;
    }

    private void validarTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("El titular no puede ser nulo ni vacio.");
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.validarTitular(titular);
        this.titular = titular.trim();
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + String.format("%.2f", saldo) +
                '}';
    }
}
