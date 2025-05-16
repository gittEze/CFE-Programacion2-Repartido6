package Ejercicio9;

public class Producto {
    public static void main(String[] args) {

        Producto product1 = new Producto("Alfajor",99,918723,50);
        System.out.println(product1.getStock());
        product1.reponer(50);
        System.out.println(product1.getStock());
        product1.vender(30);
        System.out.println(product1.getStock());
        product1.vender(200);
        System.out.println(product1.getStock());
    }

    private String nombre;
    private int stock;
    private int codigo;
    private double precio;

    public Producto(String nombre, int stock, int codigo, double precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.codigo = codigo;
        this.precio = precio;
        if (stock >= 0) {
            this.stock = stock;
        } else {
            this.stock = 0;
        }
    }

    //set's para mostrar info
    public int getStock() {
        return this.stock;
    }
    public double getPrecio() {
        return this.precio;
    }

    //get
    public void setPrecio(double newPrecio) {
        this.precio = newPrecio;
    }

    //metodos pedidos
    public void vender(int cantidad) {
        if (stock >= cantidad){
            this.stock -= cantidad;
        } else {
            System.out.println("No se pudo realizar la accion deseada.");
        }
    }
    public void reponer(int cantidad) {
        this.stock += cantidad;
    }
}
