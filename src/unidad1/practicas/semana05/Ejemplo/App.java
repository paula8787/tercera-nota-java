package unidad1.practicas.semana05.Ejemplo;

import unidad1.practicas.semana05.Ejemplo.Class.Student;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student("Ana", 4.1);
        Student s2 = new Student("Frank", 2.9);

        // Mostrar información inicial
        System.out.println("Estudiantes iniciales:");
        System.out.println(s1);
        System.out.println(s2);

        // Comprobar si aprobaron
        System.out.println(s1.getName() + " aprobado? " + (s1.isPassed() ? "Sí" : "No"));
        System.out.println(s2.getName() + " aprobado? " + (s2.isPassed() ? "Sí" : "No"));

        // Actualizar nota de Frank y volver a comprobar
        System.out.println("\nActualizando nota de " + s2.getName() + " a 3.2...");
        s2.setGrade(3.2);
        System.out.println(s2);
        System.out.println(s2.getName() + " aprobado? " + (s2.isPassed() ? "Sí" : "No"));
    }
}