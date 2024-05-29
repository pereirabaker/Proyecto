package cuentas;
import usuarios.Usuario;

public class Cuenta {
    // privados //
    private double saldo;
    private Usuario usuario;

    // contructores //
    public Cuenta(Usuario usuario) {
        this.saldo = 0;
        this.usuario = usuario;
    }

    // getter y setter //
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // procedimiento para depositar //
    public void depositar(double cantidad){
        if (cantidad > 0 & cantidad <= 400000) {
            saldo += cantidad;
            System.out.println("Transaccion realizada con exito.");
        } else if (cantidad > 400000)
            System.out.println("No es posible realizar esta transaccion sin comprobante, contacte un agente.");
        else
            System.out.println("No es posible depositar esta cantidad.");
    }

    // procedimiento para retirar //
    public void retirar(double cantidad){
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Transaccion realizada con exito.");
        } else
            System.out.println("No tiene saldo suficiente.");
    }
}
