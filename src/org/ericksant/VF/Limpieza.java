package org.ericksant.VF;

public class Limpieza  extends Producto{

    private String componentes;
    private double litros;
    //constructor
    public Limpieza(String nombre, double precio) {
        super(nombre, precio);
    }
    //getter and setter

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
}
