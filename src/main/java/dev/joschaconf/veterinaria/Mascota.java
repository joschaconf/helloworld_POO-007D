package dev.joschaconf.veterinaria;

import java.util.ArrayList;
import java.util.List;

public class Mascota {
    private String nombre;       // Nombre de la mascota
    private String especie;      // Tipo de animal (perro, gato, etc.)
    private int edad;            // Edad de la mascota, relevante para controles
    private List<String> vacunas; // Historial de vacunas aplicadas

    // Constructor: registra una mascota nueva, que siempre empieza sin vacunas
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.vacunas = new ArrayList<>();
    }

    // Agrega una vacuna al historial de la mascota
    public void registrarVacuna(String vacuna) {
        vacunas.add(vacuna);
    }

    // Indica si la mascota ya tiene registrada una vacuna específica
    public boolean tieneVacuna(String vacuna) {
        return vacunas.contains(vacuna);
    }

    // Muestra en consola la ficha de la mascota
    public void mostrarFicha() {
        System.out.println(nombre + " (" + especie + ", " + edad + " años) - Vacunas: " + vacunas);
    }
}