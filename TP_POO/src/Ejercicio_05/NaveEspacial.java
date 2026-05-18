
package Ejercicio_05;

public class NaveEspacial {

    public static final double CAPACIDAD_MAXIMA = 100.0;
    public static final double COSTO_DESPEGUE = 5.0;
    public static final double COSTO_POR_KM = 2.0;

    private String nombre;
    private double combustible;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre no puede estar vacio.");
        }
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        if (combustible >= 0 && combustible <= CAPACIDAD_MAXIMA) {
            this.combustible = combustible;
        } else {
            System.out.println("Error: combustible invalido.");
        }
    }

    public void despegar() {
        if (combustible >= COSTO_DESPEGUE) {
            combustible -= COSTO_DESPEGUE;
            System.out.println("La nave despego correctamente.");
        } else {
            System.out.println("Error: no hay combustible suficiente para despegar.");
        }
    }

    public void avanzar(double distancia) {
        double consumo = distancia * COSTO_POR_KM;

        if (distancia <= 0) {
            System.out.println("Error: la distancia debe ser mayor a cero.");
        } else if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println("La nave avanzo " + distancia + " km.");
        } else {
            System.out.println("Error: combustible insuficiente para avanzar esa distancia.");
        }
    }

    public void recargarCombustible(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad a recargar debe ser mayor a cero.");
        } else if (combustible + cantidad <= CAPACIDAD_MAXIMA) {
            combustible += cantidad;
            System.out.println("Recarga realizada con exito.");
        } else {
            System.out.println("Error: la recarga supera la capacidad maxima.");
        }
    }

    public void mostrarEstado() {
        System.out.printf("Nave: %s | Combustible actual: %.2f%n", nombre, combustible);
    }
}
