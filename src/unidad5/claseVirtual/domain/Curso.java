package unidad5.claseVirtual.domain;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Curso {
    private final String nombre;
    private final double codigo;
    private final List<UnidadTematica> unidades = new ArrayList<>();
    private final List<Estudiante> inscritos = new ArrayList<>();

    public Curso(double codigo, String nombre) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public void agregarUnidad(String titulo, int semanas) {
        unidades.add(new UnidadTematica(titulo, semanas));
    }

    public void inscribir(Estudiante estudiante) {
        Objects.requireNonNull(estudiante);
        if (!inscritos.contains(estudiante)) {
            inscritos.add(estudiante);
        }
    }

    public void desinscribir(Estudiante estudiante) {
        inscritos.remove(estudiante);
    }

    public List<Estudiante> getInscritos() {
        return List.copyOf(inscritos);
    }

    public List<UnidadTematica> getUnidades() {
        return List.copyOf(unidades);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", unidades=" + unidades +
                ", inscritos=" + inscritos +
                '}';
    }
}