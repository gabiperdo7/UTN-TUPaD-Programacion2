
package Ejercicio_01;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== EJERCICIO 1: EMPLEADOS ===");

        Empleado e1 = new Empleado(1, "Gabriel Perdomo", "Desarrollador", 250000);
        Empleado e2 = new Empleado("Lucia Gomez", "Tester");
        Empleado e3 = new Empleado("Juan Perez", "Analista");

        e1.actualizarSalario(10.0);
        e2.actualizarSalario(15000);

        e1.actualizarSalario(-5.0);
        e2.actualizarSalario(-1000);

        e3.setSalario(-200); 

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());

        try {
            Empleado e4 = new Empleado(4, "", "Soporte", 200000);
            System.out.println(e4);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear empleado: " + e.getMessage());
        }
    }
}
