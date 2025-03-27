package org.ericksant.VF;

public class Fruta extends Producto{
    private double peso;
    private int color;

    //constructor
    public Fruta(String nombre, double precio) {
        super(nombre, precio);
    }
    //getter and setter

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
