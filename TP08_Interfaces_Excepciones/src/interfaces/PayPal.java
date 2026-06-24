
package interfaces;

public class PayPal implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal procesado por: $" + monto);
    }
}
