package dev.joschaconf.deliveryComida;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String cliente;         // Cliente que realizó el pedido
    private List<String> productos; // Nombres de los productos que componen el pedido
    private List<Double> precios;   // Precio de cada producto, en el mismo orden que 'productos'
    private double total;           // Monto total a pagar
    private String estado;          // Etapa actual del pedido (pendiente, en camino, entregado)

    // Constructor: crea un pedido nuevo, vacío, en cero y en estado "pendiente"
    public Pedido(String cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.precios = new ArrayList<>();
        this.total = 0;
        this.estado = "pendiente";
    }

    // Agrega un producto (nombre y precio) al pedido y actualiza el total automáticamente
    public void agregarProducto(String nombreProducto, double precio) {
        productos.add(nombreProducto);
        precios.add(precio);
        calcularTotal();
    }

    // Recalcula el total sumando el precio de todos los productos del pedido
    public void calcularTotal() {
        double suma = 0;
        for (double precio : precios) {
            suma += precio;
        }
        this.total = suma;
    }

    // Cambia el estado del pedido durante el proceso de entrega
    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    // Muestra en consola la información del pedido
    public void mostrarInformacion() {
        System.out.println("Cliente: " + cliente + " | Productos: " + productos
                + " | Total: $" + total + " | Estado: " + estado);
    }
}