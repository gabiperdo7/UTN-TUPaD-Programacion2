
package EjercicioCuatro;

public class Animal {

    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }

    public void describirAnimal() {
        System.out.println("Animal: " + nombre);
    }
}
