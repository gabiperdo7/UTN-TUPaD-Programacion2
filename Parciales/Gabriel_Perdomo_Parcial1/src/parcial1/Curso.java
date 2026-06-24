
package parcial1;

public class Curso {

    private final int id;
    private String nombre;
    private int duracionHoras;
    private double precio;

    private static int totalCursos = 0;

    public Curso(int id, String nombre, int duracionHoras, double precio) {
        validarId(id);
        validarNombre(nombre);
        validarDuracionHoras(duracionHoras);
        validarPrecio(precio);

        this.id = id;
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
        this.precio = precio;

        totalCursos++;
    }

    public Curso(int id, String nombre, int duracionHoras) {
        this(id, nombre, duracionHoras, 100);
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        validarNombre(nombre);
        this.nombre = nombre;
    }

    public int getDuracionHoras() {
        return this.duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        validarDuracionHoras(duracionHoras);
        this.duracionHoras = duracionHoras;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        validarPrecio(precio);
        this.precio = precio;
    }

    public void actualizarPrecio(double porcentajeAumento) {
        if (porcentajeAumento < 0) {
            throw new IllegalArgumentException("El porcentaje de aumento no puede ser negativo.");
        }

        this.precio = this.precio + (this.precio * porcentajeAumento / 100);
    }

    public void actualizarPrecio(int montoFijoAumento) {
        if (montoFijoAumento < 0) {
            throw new IllegalArgumentException("El monto fijo de aumento no puede ser negativo.");
        }

        this.precio = this.precio + montoFijoAumento;
    }

    public static int mostrarTotalCursos() {
        return totalCursos;
    }

    private void validarId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("El id debe ser mayor que 0.");
        }
    }

    private void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo ni vacio.");
        }
    }

    private void validarDuracionHoras(int duracionHoras) {
        if (duracionHoras <= 0) {
            throw new IllegalArgumentException("La duracion en horas debe ser mayor que 0.");
        }
    }

    private void validarPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
    }

    @Override
    public String toString() {
        return "Curso {" +
                "id=" + this.id +
                ", nombre='" + this.nombre + '\'' +
                ", duracionHoras=" + this.duracionHoras +
                ", precio=$" + this.precio +
                '}';
    }
}
