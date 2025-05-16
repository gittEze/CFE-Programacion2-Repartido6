package Ejercicio6;

public class Libro {

    private String nombre;
    private String autor;
    private int anio;

    public Libro(String nombre, String autor, int anio) {
        this.nombre = nombre;
        this.autor = autor;
        this.anio = anio;
        if (this.anio > 2025) {
            System.out.println("Error, el año ingresado supera el año actual");
        }
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getAutor() {
        return this.autor;
    }
    public int getAnio() {
        return this.anio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
}

