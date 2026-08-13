package dev.joschaconf.biblioteca;

public class Libro {
    private String title;      // Título del libro
    private int year;          // Año de publicación
    private String author;     // Autor del libro
    private String isbn;       // Identificador único del libro
    private boolean disponible; // true si el libro está disponible para prestar, false si ya está prestado

    // Constructor: crea un libro nuevo, que siempre empieza como disponible
    public Libro(String title, int year, String author, String isbn) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.isbn = isbn;
        this.disponible = true; // todo libro nuevo empieza disponible
    }

    // Intenta prestar el libro: si está disponible lo marca como prestado y retorna true;
    // si ya estaba prestado, retorna false
    public boolean prestamo() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false; // ya estaba prestado, no se puede prestar de nuevo
    }

    // Indica si el libro está disponible actualmente
    public boolean disponibilidad() {
        return disponible;
    }

    // Marca el libro como disponible nuevamente (cuando se devuelve)
    public void devolver() {
        disponible = true;
    }
}