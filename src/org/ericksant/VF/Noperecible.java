package org.ericksant.VF;

public class Noperecible extends Producto{

    private int contenido;
    private int calorias;
    //constructor
    public Noperecible(String nombre, double precio) {
        super(nombre, precio);
    }
    //getter and setter

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}
