package Ejercicio7;

public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta(777, "Bryan Fernandez");

        //Depositos
        cuenta1.depositar(900);
        System.out.println(cuenta1.getSaldo());

        cuenta1.depositar(150);
        System.out.println(cuenta1.getSaldo());

        //Retiros
        cuenta1.retirar(400);
        System.out.println(cuenta1.getSaldo());

        cuenta1.retirar(2000);
        System.out.println(cuenta1.getSaldo());

    }
}
