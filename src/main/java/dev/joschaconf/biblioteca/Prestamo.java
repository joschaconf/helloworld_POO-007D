package dev.joschaconf.biblioteca;

public class Prestamo {
    private Libro libro;
    private String estudiante;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private boolean devuelto;

    public Prestamo(Libro libro, String estudiante, String fechaPrestamo, String fechaDevolucion) {
        this.libro = libro;
        this.estudiante = estudiante;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.devuelto = false;
    }

    public void registrarDevolucion() {
        this.devuelto = true;
        this.libro.devolver(); // avisa al libro que vuelve a estar disponible
    }

    public boolean estaVencido(String fechaActual) {
        return !devuelto && fechaActual.compareTo(fechaDevolucion) > 0;
    }

    public void mostrarDetalle() {
        System.out.println("Estudiante: " + estudiante + " | Préstamo: " + fechaPrestamo
                + " | Devolución: " + fechaDevolucion + " | Devuelto: " + devuelto);
    }
}