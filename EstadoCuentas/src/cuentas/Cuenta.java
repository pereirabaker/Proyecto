package cuentas;

import usuarios.Usuario;

public class Cuenta {
    private String numeroDeCuenta;
    private double saldo;
    private Usuario usuario;
    public Cuenta(String numeroDeCuenta, Usuario usuario) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = 0;
        this.usuario = usuario;
    }

    public Cuenta() {
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

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
    public void depositar(double cantidad){
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Transaccion realizada con exito.");
        } else {
            System.out.println("No tiene saldo suficiente.");
        }
        if (cantidad < 400000) {
            System.out.println("No es posible realizar esta transaccion sin comprobante, contacte un agente.");
        }
        }
        public void retirar(double cantidad){
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Transaccion realizada con exito.");
        } else {
            System.out.println("No es posible retirar esta cantidad.");

        }
        }
    }
