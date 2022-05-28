
package com.lorenzatticomputacion.ventas;

import com.lorenzatticomputacion.*;

public class Ventas {
    
    public static void main(String[] args) {
        
        // creo los insumos que formaran la computadora
        Monitor monitorSamsung = new Monitor ("Samsung",24.5);
        Raton mouseGenius = new Raton ("inalambrico","Genius");
        Teclado tecladoGenius = new Teclado ("Cable","Genius");       
        
        Raton mouseSamsung = new Raton ("inalambrico","Samsung");
        Teclado tecladoSamsung = new Teclado ("Inalambrico","Samsung");
                
        // creo la primer computadora
        Computadora computadora1 = new Computadora("Computadora 1", tecladoGenius, mouseGenius, monitorSamsung);
        // creo una segunda computadora
        Computadora computadora2 = new Computadora("Computadora 2", tecladoGenius, mouseGenius, monitorSamsung);
        //creo una tercer computadora
        Computadora computadora3 = new Computadora("Computadora Samsung", tecladoSamsung, mouseSamsung, monitorSamsung);
        
        // creo la orden ya con una computadora
        // tambien se puede crear con un constructor vacio e ir agregando con el metodo agregar computadora
        Orden orden1 = new Orden(computadora1);
        
        // agregos las computadoras a la orden
        orden1.AgregarComputadora(computadora2);        
        orden1.AgregarComputadora(computadora3);
        
        // muestro la orden
        orden1.MostrarOrden();
        
        // creo una seguna orden con el constructor vacio y no agrego ninguna computadora
        Orden orden2 = new Orden ();
        orden2.MostrarOrden();
        
        
    }
    
}
