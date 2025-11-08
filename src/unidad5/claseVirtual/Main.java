package unidad5.claseVirtual;

import unidad5.claseVirtual.domain.Curso;
import unidad5.claseVirtual.domain.Estudiante;
import unidad5.claseVirtual.domain.Profesor;
import unidad5.claseVirtual.domain.Proyecto;

public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("P-01", "Yisus", "Ing. Sistemas");
        Estudiante estudiante1 = new Estudiante("E-01", "Paula", "Ing. Sistemas");
        Estudiante estudiante2 = new Estudiante("E-02", "Lucho", "Ing. Mecanica");
        
        Curso programacion = new Curso(193301D, "Programacion II");
        Profesor.dictar(programacion);

        programacion.agregarUnidad("HERENCIA", 2);  
        programacion.agregarUnidad("POLIMORFISMO", 4);

        programacion.inscribir(estudiante1);
        programacion.inscribir(estudiante2);

        Proyecto proyecto1 = new Proyecto("Examen final", estudiante1);
        profesor.asesorar(proyecto1);

        System.out.println(programacion);
    }
}
