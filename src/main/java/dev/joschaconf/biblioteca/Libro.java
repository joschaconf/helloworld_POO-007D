package dev.joschaconf.biblioteca;

public class Libro {
    private String title;
    private int year;
    private String author;
    private String isbn;
    private boolean disponible;

    public Libro(String title, int year, String author, String isbn) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.isbn = isbn;
        this.disponible = true; // todo libro nuevo empieza disponible
    }

    public boolean prestamo() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false; // ya estaba prestado, no se puede prestar de nuevo
    }

    public boolean disponibilidad() {
        return disponible;
    }

    public void devolver() {
        disponible = true;
    }
}