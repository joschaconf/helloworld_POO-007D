package dev.joschaconf.gestionAcademica;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;      // Nombre del estudiante
    private String matricula;   // Identificador único del estudiante en el sistema
    private String carrera;     // Programa académico al que pertenece
    private List<Double> notas; // Lista de calificaciones registradas (rendimiento)

    // Constructor: crea un estudiante nuevo, que siempre empieza sin notas registradas
    public Estudiante(String nombre, String matricula, String carrera) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.notas = new ArrayList<>();
    }

    // Agrega una nueva calificación a la lista de notas del estudiante
    public void agregarNota(double nota) {
        notas.add(nota);
    }

    // Calcula el promedio de todas las notas registradas (0 si aún no tiene ninguna)
    public double calcularPromedio() {
        if (notas.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }

    // Muestra en consola la información del estudiante
    public void mostrarInformacion() {
        System.out.println(nombre + " (" + matricula + ") - " + carrera
                + " - Promedio: " + calcularPromedio());
    }
}