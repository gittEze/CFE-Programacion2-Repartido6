package Ejercicio8;

public class Clase {
    public static void main(String[] args) {

        Clase clase1 = new Clase("Pablo", "Empleado", 25500);
        System.out.println(clase1.getSueldoFinal());

        Clase clase2 = new Clase("Juan", "Jefe", 55000);
        System.out.println(clase2.getSueldoFinal());
    }

    private String nombre;
    private String cargo;
    private double sueldo;

    public Clase(String nombre, String cargo, double sueldo) {
        this.nombre = nombre;
        this.cargo = cargo;

        if (sueldo < 0) {
            System.out.println("El sueldo base no puede ser negativo.");
            this.sueldo = 0;
        } else if (cargo.equals("Jefe")) {
            this.sueldo = sueldo + (sueldo * 0.20);
        } else {
            this.sueldo = sueldo;
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCargo() {
        return this.cargo;
    }

    public double getSueldoFinal() {
        return this.sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}

