package dev.joschaconf.transporteEscolar;

public class BusEscolar {
    private String placa;            // Identificador único del bus
    private int capacidadMaxima;     // Cantidad máxima de estudiantes que puede transportar
    private int pasajerosActuales;   // Cantidad de estudiantes que lleva actualmente
    private String recorrido;        // Ruta o trayecto que realiza el bus
    private String estado;           // Estado del vehículo (operativo, en mantenimiento, etc.)

    // Constructor: registra un bus nuevo, que siempre empieza vacío y operativo
    public BusEscolar(String placa, int capacidadMaxima, String recorrido) {
        this.placa = placa;
        this.capacidadMaxima = capacidadMaxima;
        this.recorrido = recorrido;
        this.pasajerosActuales = 0;
        this.estado = "operativo";
    }

    // Sube un pasajero si hay espacio disponible; retorna true si se pudo subir
    public boolean subirPasajero() {
        if (hayEspacioDisponible()) {
            pasajerosActuales++;
            return true;
        }
        return false; // no hay espacio, no se puede subir otro pasajero
    }

    // Indica si el bus todavía tiene capacidad disponible
    public boolean hayEspacioDisponible() {
        return pasajerosActuales < capacidadMaxima;
    }

    // Cambia el estado del vehículo (ej: a "en mantenimiento")
    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }
}