
package Ejercicio_02;

public class Main {

    public static void main(String[] args) {
        Mascota mascota = new Mascota();

        mascota.setEdad(-2);

        mascota.setNombre("Greta");
        mascota.setEspecie("Perro");
        mascota.setEdad(3);

        mascota.mostrarInfo();

        mascota.cumplirAnios();
        mascota.cumplirAnios();

        mascota.mostrarInfo();
    }
}
