
package EjercicioCuatro;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Greta"));
        animales.add(new Gato("Tato"));
        animales.add(new Vaca("Lu"));

        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println("-------------------------");
        }
    }
}
