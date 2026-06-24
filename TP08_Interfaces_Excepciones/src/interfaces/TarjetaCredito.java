
package interfaces;

public class TarjetaCredito implements Pago, PagoConDescuento {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta de credito procesado por: $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90;
    }
}
