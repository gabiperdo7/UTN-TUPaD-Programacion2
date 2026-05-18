
package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Universidad universidad = new Universidad("UTN");

        Profesor prof1 = new Profesor("P001", "Carlos Gomez", "Programacion");
        Profesor prof2 = new Profesor("P002", "Laura Perez", "Base de Datos");
        Profesor prof3 = new Profesor("P003", "Martin Diaz", "Matematica");

        Curso c1 = new Curso("C001", "Programacion II");
        Curso c2 = new Curso("C002", "Base de Datos");
        Curso c3 = new Curso("C003", "Matematica");
        Curso c4 = new Curso("C004", "Laboratorio Java");
        Curso c5 = new Curso("C005", "Sistemas Operativos");

        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);

        universidad.agregarCurso(c1);
        universidad.agregarCurso(c2);
        universidad.agregarCurso(c3);
        universidad.agregarCurso(c4);
        universidad.agregarCurso(c5);

        universidad.asignarProfesorACurso("C001", "P001");
        universidad.asignarProfesorACurso("C002", "P002");
        universidad.asignarProfesorACurso("C003", "P003");
        universidad.asignarProfesorACurso("C004", "P001");
        universidad.asignarProfesorACurso("C005", "P002");

        System.out.println("\nLISTADO DE CURSOS:");
        universidad.listarCursos();

        System.out.println("\nLISTADO DE PROFESORES CON SUS CURSOS:");
        universidad.listarProfesores();

        System.out.println("\nCAMBIAR PROFESOR DEL CURSO C001:");
        universidad.asignarProfesorACurso("C001", "P003");

        System.out.println("\nCURSOS DESPUES DEL CAMBIO:");
        universidad.listarCursos();

        System.out.println("\nELIMINAR CURSO C004:");
        universidad.eliminarCurso("C004");

        System.out.println("\nPROFESORES DESPUES DE ELIMINAR CURSO:");
        universidad.listarProfesores();

        System.out.println("\nELIMINAR PROFESOR P002:");
        universidad.eliminarProfesor("P002");

        System.out.println("\nCURSOS DESPUES DE ELIMINAR PROFESOR:");
        universidad.listarCursos();

        System.out.println("\nREPORTE FINAL:");
        universidad.reporteCantidadCursosPorProfesor();
    }
}
