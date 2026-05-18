
package Ejercicio_04;

public class Producto {

    private String nombre;
    private double precioBase;
    private static double IVA = 0.21;

    public Producto(String nombre, double precioBase) {
        this.validarNombre(nombre);

        if (precioBase < 0) {
            throw new IllegalArgumentException("El precio base no puede ser negativo.");
        }

        this.nombre = nombre.trim();
        this.precioBase = precioBase;
    }

    public Producto(String nombre) {
        this(nombre, 100.0);
    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("Error: porcentaje invalido.");
            return;
        }

        this.precioBase = this.precioBase - (this.precioBase * porcentaje / 100.0);
    }

    public void aplicarDescuento(double porcentaje, double precioMinimo) {
        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("Error: porcentaje invalido.");
            return;
        }

        if (precioMinimo < 0) {
            System.out.println("Error: el precio minimo no puede ser negativo.");
            return;
        }

        double nuevoPrecio = this.precioBase - (this.precioBase * porcentaje / 100.0);

        if (nuevoPrecio < precioMinimo) {
            this.precioBase = precioMinimo;
        } else {
            this.precioBase = nuevoPrecio;
        }
    }

    public double calcularPrecioFinal() {
        return this.precioBase + (this.precioBase * IVA);
    }

    public static void cambiarIVA(double nuevo) {
        if (nuevo < 0) {
            System.out.println("Error: el IVA no puede ser negativo.");
            return;
        }
        IVA = nuevo;
    }

    private void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo ni vacio.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.validarNombre(nombre);
        this.nombre = nombre.trim();
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase < 0) {
            System.out.println("Error: el precio no puede ser negativo.");
            return;
        }
        this.precioBase = precioBase;
    }

    public static double getIVA() {
        return IVA;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precioBase=" + String.format("%.2f", precioBase) +
                ", precioFinal=" + String.format("%.2f", calcularPrecioFinal()) +
                '}';
    }
}
