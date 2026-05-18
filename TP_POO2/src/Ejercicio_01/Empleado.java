
package Ejercicio_01;

public class Empleado {

    private static int totalEmpleados = 0;

    private final int id;
    private String nombre;
    private String puesto;
    private double salario;

    private static final double SALARIO_POR_DEFECTO = 100000.0;

    // Constructor principal
    public Empleado(int id, String nombre, String puesto, double salario) {
        if (id <= 0) {
            throw new IllegalArgumentException("El ID debe ser mayor que 0.");
        }

        this.validarTexto(nombre, "El nombre no puede ser nulo ni vacio.");
        this.validarTexto(puesto, "El puesto no puede ser nulo ni vacio.");

        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo.");
        }

        this.id = id;
        this.nombre = nombre.trim();
        this.puesto = puesto.trim();
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor sobrecargado con ID automático y salario por defecto
    public Empleado(String nombre, String puesto) {
        this(totalEmpleados + 1, nombre, puesto, SALARIO_POR_DEFECTO);
    }

    // Método sobrecargado: aumento porcentual
    public void actualizarSalario(double porcentajeAumento) {
        if (porcentajeAumento < 0) {
            System.out.println("Error: el porcentaje de aumento no puede ser negativo.");
            return;
        }

        this.salario += this.salario * (porcentajeAumento / 100.0);
    }

    // Método sobrecargado: aumento fijo
    public void actualizarSalario(int aumentoFijo) {
        if (aumentoFijo < 0) {
            System.out.println("Error: el aumento fijo no puede ser negativo.");
            return;
        }

        this.salario += aumentoFijo;
    }

    private void validarTexto(String texto, String mensajeError) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException(mensajeError);
        }
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.validarTexto(nombre, "El nombre no puede ser nulo ni vacio.");
        this.nombre = nombre.trim();
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.validarTexto(puesto, "El puesto no puede ser nulo ni vacio.");
        this.puesto = puesto.trim();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("Error: el salario no puede ser negativo.");
            return;
        }
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + String.format("%.2f", salario) +
                '}';
    }
}
