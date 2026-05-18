
package EjercicioTres;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Carlos", 850000));
        empleados.add(new EmpleadoTemporal("Ana", 80, 5000));

        for (Empleado empleado : empleados) {

            System.out.println("Empleado: " + empleado.getNombre());
            System.out.println("Sueldo: $" + empleado.calcularSueldo());

            if (empleado instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Empleado de planta");
            } else if (empleado instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Empleado temporal");
            }

            System.out.println("-------------------------");
        }
    }
}
