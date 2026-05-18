
package Ejercicio_04;

public class Main {

    public static void main(String[] args) {
        Gallina gallinaA = new Gallina();
        Gallina gallinaB = new Gallina();

        gallinaA.setIdGallina(1);
        gallinaB.setIdGallina(2);

        gallinaA.setEdad(-1);

        gallinaA.setEdad(2);
        gallinaB.setEdad(1);

        gallinaA.ponerHuevo();
        gallinaA.ponerHuevo();
        gallinaB.ponerHuevo();

        gallinaA.envejecer();
        gallinaB.envejecer();

        gallinaA.mostrarEstado();
        gallinaB.mostrarEstado();
    }
}
