package org.ericksant.VF;

public class Producto {
    private String nombre;
    private double precio;

    //constructor

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    //getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
