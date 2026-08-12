package dev.joschaconf;

public class Libro {
    private String title;
    private int year;
    private String author;
    private String isbn;

    public Libro(String title, int year, String author, String isbn) {
        this.title = "sin definir";
        this.year = 2026;
        this.author = "anonimo";
        this.isbn = "";
    }

    public boolean prestamo(String prestamo) {
        return true;
    }

    public boolean disponibilidad(String disponibilidad) {
        return true;
    }

    public void devolver(String fechaDevolucion) {
    }

    private void isbn() {
    }

    private void author() {
    }

    private void title() {
    }

    private void year() {
    }
}