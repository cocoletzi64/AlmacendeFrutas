package org.ericksant.VF;

public class Lacteos extends Producto{

    private int cantida;
    private int proteinas;

    //construtor

    public Lacteos(String nombre, double precio, int cantida, int proteinas) {
        super(nombre, precio);
        this.cantida = cantida;
        this.proteinas = proteinas;
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
    //metodos

    @Override
    public String toString() {
        return
                super.toString()+
                "cantida = " + cantida+"\n" +
                "proteinas = " + proteinas+"\n";
    }
}
