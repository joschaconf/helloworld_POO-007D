package dev.joschaconf.biblioteca;

import java.time.LocalDate;
import java.time.Period;

public class Prestamo {
    private Libro libro;               // Libro que fue prestado
    private String estudiante;         // Nombre del estudiante que pidió el préstamo
    private LocalDate fechaPrestamo;   // Fecha en que se realizó el préstamo
    private LocalDate fechaDevolucion; // Fecha límite en la que debe devolverse el libro
    private boolean devuelto;          // true si el libro ya fue devuelto, false si sigue pendiente

    // Constructor: crea un préstamo nuevo, que siempre empieza como "no devuelto"
    public Prestamo(Libro libro, String estudiante, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.libro = libro;
        this.estudiante = estudiante;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.devuelto = false;
    }

    // Marca el préstamo como devuelto y avisa al libro que vuelve a estar disponible
    public void registrarDevolucion() {
        this.devuelto = true;
        this.libro.devolver();
    }

    // Indica si el préstamo está atrasado: no se ha devuelto Y ya pasó la fecha límite
    public boolean estaVencido(LocalDate fechaActual) {
        return !devuelto && fechaActual.isAfter(fechaDevolucion);
    }

    // Muestra en consola la información resumida del préstamo
    public void mostrarDetalle() {
        System.out.println("Estudiante: " + estudiante + " | Préstamo: " + fechaPrestamo
                + " | Devolución: " + fechaDevolucion + " | Devuelto: " + devuelto);
    }
}