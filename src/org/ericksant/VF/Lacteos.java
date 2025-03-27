package org.ericksant.VF;

public class Lacteos extends Producto{

    private int cantida;
    private int proteinas;

    //construtor

    public Lacteos(String nombre, double precio) {
        super(nombre, precio);
    }
    //getter and setter

    public int getCantida() {
        return cantida;
    }

    public void setCantida(int cantida) {
        this.cantida = cantida;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }
}
