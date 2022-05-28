
package com.lorenzatticomputacion;

public class Orden {
    
    private final int idOrden;
    private static int contadorOrden;
    private Computadora computadoras[];
    private static int contadorComputadoras;
    private final int MAX_COMPUTADORAS = 10;
    
    
    public Orden (){
        this.idOrden = ++contadorOrden; 
        this.contadorComputadoras = 0; // reinicio el contador de computadoras para cada nueva orden
        computadoras = new Computadora [MAX_COMPUTADORAS];
    }
    
    // constructor de orden con argumentos
    public Orden (Computadora computadora){
        this();
        // verifico que no se haya alcanzado el maximo que se puede agregar a la orden
        if (contadorComputadoras < MAX_COMPUTADORAS){
            computadoras[contadorComputadoras] = computadora; // agrego el objeto computadora al arreglo de tipo Computadora
            contadorComputadoras++;
        } else {
            System.out.println("Maximo del carrito alcanzado " + MAX_COMPUTADORAS);
        }
    }
    
    public void AgregarComputadora (Computadora computadora){
        if (contadorComputadoras < MAX_COMPUTADORAS+1){
            computadoras[contadorComputadoras] = computadora;
            contadorComputadoras++;
        } else {
            System.out.println("Maximo del carrito alcanzado " + MAX_COMPUTADORAS);
        }
    }
    
    // imprimo los datos de la orden
    public void MostrarOrden(){
        if (contadorComputadoras == 0){
            System.out.println("Orden #"+this.idOrden);
            System.out.println("No se ha agregado ninguna computadora a la orden");
        } else {
            for (int i = 0; i<contadorComputadoras; i++){
                System.out.println("Orden #"+this.idOrden);
                System.out.println("Computadoras:");
                System.out.println(computadoras[i]);
            }
        }
        
    }
}
