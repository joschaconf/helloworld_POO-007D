package dev.joschaconf.banco;

public class CuentaBancaria {
    private String numeroCuenta; // Identificador único de la cuenta
    private String titular;      // Nombre del dueño de la cuenta
    private double saldo;        // Dinero disponible actualmente en la cuenta
    private String tipoCuenta;   // Tipo de cuenta (Ahorro)

    // Constructor: crea una cuenta nueva, que siempre empieza con saldo en cero
    public CuentaBancaria(String numeroCuenta, String titular, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0;
    }

    // Retorna el saldo disponible actualmente
    public double consultarSaldo() {
        return saldo;
    }

    // Aumenta el saldo con el monto depositado
    public void depositar(double monto) {
        saldo += monto;
    }

    // Disminuye el saldo si hay fondos suficientes; retorna true si el giro se pudo realizar
    public boolean girar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false; // fondos insuficientes, no se puede girar
    }
}