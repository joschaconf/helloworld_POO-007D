package dev.joschaconf.tienda;

public class Producto {
    private String nombre;   // Nombre del producto, para mostrarlo en pantalla
    private double precio;   // Precio de venta del producto
    private int stock;       // Cantidad de unidades disponibles actualmente
    private String codigo;   // Identificador único del producto

    // Constructor: crea un producto nuevo con el stock inicial indicado
    public Producto(String nombre, double precio, int stock, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.codigo = codigo;
    }

    // Descuenta una unidad del stock si hay disponibilidad; retorna true si se pudo vender
    public boolean venderUnidad() {
        if (stock > 0) {
            stock--;
            return true;
        }
        return false; // no queda stock, no se puede vender
    }

    // Indica si el producto todavía tiene unidades disponibles
    public boolean hayStock() {
        return stock > 0;
    }

    // Muestra en consola la información del producto
    public void mostrarInformacion() {
        System.out.println(nombre + " - $" + precio + " (stock: " + stock + ")");
    }
}