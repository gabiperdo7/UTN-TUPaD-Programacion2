
package Ejercicio_05;

public class Main {

    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();

        nave.setNombre("Explorer");
        nave.setCombustible(50);

        nave.avanzar(30);
        nave.recargarCombustible(60);
        nave.recargarCombustible(20);
        nave.despegar();
        nave.avanzar(10);

        nave.mostrarEstado();
    }
}
