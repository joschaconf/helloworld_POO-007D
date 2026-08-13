package dev.joschaconf.clinica;

import java.time.LocalDate;

public class CitaMedica {
    private Paciente paciente; // Paciente al que corresponde la cita
    private LocalDate fecha;   // Fecha en que se realizará la cita
    private String hora;       // Hora de la cita
    private String estado;     // Estado de atención (pendiente, confirmada, cancelada, atendida)

    // Constructor: crea una cita nueva, que siempre empieza en estado "pendiente"
    public CitaMedica(Paciente paciente, LocalDate fecha, String hora) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = "pendiente";
    }

    // Confirma la cita si todavía está pendiente; retorna true si se pudo confirmar
    public boolean confirmarCita() {
        if (estado.equals("pendiente")) {
            estado = "confirmada";
            return true;
        }
        return false; // no se puede confirmar si ya cambió de estado
    }

    // Cancela la cita, sin importar su estado actual
    public void cancelarCita() {
        estado = "cancelada";
    }

    // Muestra en consola la información de la cita
    public void mostrarInformacion() {
        System.out.println("Fecha: " + fecha + " " + hora + " - Estado: " + estado);
    }
}