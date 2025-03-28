package org.ericksant.almacen;

import org.ericksant.VF.*;

public class Almacen {
    public static void main(String[] args) {


        Producto[] producto=new Producto[8];
        producto[0]= new Lacteos("Leche",49,2,200);
        producto[1]=new Lacteos("crema",34,1,300);

        producto[2]=new Fruta("Platano",20,20,"Amarillo");
        producto[3]=new Fruta("Manzana",18,10,"Rojo");

        producto[4]=new Limpieza("Jabon",54,"Azufre, sal Iodada",3);
        producto[5]=new Limpieza("Enjuague",89,"Cloro, sal Iodada",2);

        producto[6]=new Noperecible("Helado",56,150,120);
        producto[7]=new Noperecible("refresco",34,100,2);


        for (int i=0; i<producto.length; i++){
            if (producto[i]==null){
                continue;
            }
            System.out.println(producto[i]);
        }

    }
}
