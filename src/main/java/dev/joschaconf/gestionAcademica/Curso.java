package dev.joschaconf.gestionAcademica;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;              // Nombre del curso
    private String codigo;              // Identificador único del curso
    private int cupoMaximo;             // Cantidad máxima de estudiantes permitidos
    private List<Estudiante> inscritos; // Lista de estudiantes inscritos actualmente

    // Constructor: crea un curso nuevo, que siempre empieza sin estudiantes inscritos
    public Curso(String nombre, String codigo, int cupoMaximo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cupoMaximo = cupoMaximo;
        this.inscritos = new ArrayList<>();
    }

    // Inscribe un estudiante si hay cupo disponible; retorna true si se pudo inscribir
    public boolean inscribirEstudiante(Estudiante estudiante) {
        if (hayCupoDisponible()) {
            inscritos.add(estudiante);
            return true;
        }
        return false; // no hay cupo, no se puede inscribir
    }

    // Indica si todavía quedan cupos disponibles en el curso
    public boolean hayCupoDisponible() {
        return inscritos.size() < cupoMaximo;
    }

    // Muestra en consola la información del curso
    public void mostrarInformacion() {
        System.out.println(nombre + " (" + codigo + ") - Inscritos: "
                + inscritos.size() + "/" + cupoMaximo);
    }
}