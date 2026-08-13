package dev.joschaconf.cine;

public class EntradaCine {
    private String pelicula;  // Película/función a la que corresponde la entrada
    private String sala;      // Sala donde se proyecta la función
    private String horario;   // Horario de la función
    private double precio;    // Valor de la entrada
    private boolean usada;    // true si la entrada ya fue validada en el acceso

    // Constructor: crea una entrada nueva, que siempre empieza sin usar
    public EntradaCine(String pelicula, String sala, String horario, double precio) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.horario = horario;
        this.precio = precio;
        this.usada = false;
    }

    // Valida el acceso: marca la entrada como usada si todavía no se había validado
    public boolean validarAcceso() {
        if (!usada) {
            usada = true;
            return true;
        }
        return false; // la entrada ya había sido usada, no se puede validar de nuevo
    }

    // Retorna el valor de la entrada
    public double consultarPrecio() {
        return precio;
    }

    // Muestra en consola la información de la entrada
    public void mostrarInformacion() {
        System.out.println(pelicula + " - Sala " + sala + " - " + horario
                + " - $" + precio + " - Usada: " + usada);
    }
}