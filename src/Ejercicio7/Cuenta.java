package Ejercicio7;

public class Cuenta {

    private int numero;
    private String titular;
    private double saldo;

    public Cuenta(int num, String titular) {
        this.numero = num;
        this.titular = titular;
        this.saldo = 0;
    }

    public int getNumero() {
        return this.numero;
    }
    public String getTitular() {
        return this.titular;
    }
    public double getSaldo() {
        return this.saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //Mertodos
    public void depositar(int monto) {
        this.saldo += monto;
    }

    public void retirar(int monto) {
        if (monto <= this.saldo){
            this.saldo -= monto;
        } else {
            System.out.println("La cantidad de " + monto + " a retirar supera el saldo en la cuenta, el cual es de " + this.saldo);
        }
    }
}
