package dev.joschaconf.gimnasio;

import java.time.LocalDate;

public class Socio {
    private String nombre;             // Nombre del socio
    private String plan;               // Tipo de membresía (mensual, anual, etc.)
    private LocalDate fechaVencimiento; // Fecha hasta la que el pago está vigente
    private int asistencias;           // Cantidad de veces que ha asistido a entrenar

    // Constructor: registra un socio nuevo, que siempre empieza sin asistencias
    public Socio(String nombre, String plan, LocalDate fechaVencimiento) {
        this.nombre = nombre;
        this.plan = plan;
        this.fechaVencimiento = fechaVencimiento;
        this.asistencias = 0;
    }

    // Indica si el pago del socio sigue vigente
    public boolean estaAlDia() {
        return !LocalDate.now().isAfter(fechaVencimiento);
    }

    // Registra una asistencia si el socio está al día con su pago
    public boolean registrarAsistencia() {
        if (estaAlDia()) {
            asistencias++;
            return true;
        }
        return false; // no está al día, no se registra la asistencia
    }

    // Renueva el plan actualizando la fecha de vencimiento
    public void renovarPlan(LocalDate nuevaFecha) {
        this.fechaVencimiento = nuevaFecha;
    }
}