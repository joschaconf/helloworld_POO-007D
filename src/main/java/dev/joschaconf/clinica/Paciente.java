package dev.joschaconf.clinica;

public class Paciente {
    private String nombre;                 // Nombre del paciente
    private int edad;                      // Edad del paciente
    private String numeroHistoriaClinica;  // Identificador único del paciente en la clínica
    private String tipoSangre;             // Tipo de sangre, relevante para la atención médica
    private String alergias;               // Alergias conocidas, relevante para la atención médica

    // Constructor: registra un paciente nuevo con toda su información básica
    public Paciente(String nombre, int edad, String numeroHistoriaClinica, String tipoSangre, String alergias) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroHistoriaClinica = numeroHistoriaClinica;
        this.tipoSangre = tipoSangre;
        this.alergias = alergias;
    }

    // Retorna la edad del paciente
    public int consultarEdad() {
        return edad;
    }

    // Muestra la información relevante para la atención médica
    public void consultarInformacionRelevante() {
        System.out.println("Tipo de sangre: " + tipoSangre + " | Alergias: " + alergias);
    }

    // Muestra en consola la ficha completa del paciente
    public void mostrarFicha() {
        System.out.println(nombre + " (" + numeroHistoriaClinica + ") - Edad: " + edad
                + " - Sangre: " + tipoSangre + " - Alergias: " + alergias);
    }
}