
package com.lorenzatticomputacion;

public class Computadora {
    
    private final int idComputadora;
    private static int contadorComputadora;
    private String nombre;
    private Teclado teclado;
    private Monitor monitor;
    private Raton raton;
    
    private Computadora (){
        this.idComputadora = ++contadorComputadora;
    }
    
    public Computadora(String nombre, Teclado teclado, Raton raton, Monitor monitor){
        // llamo al constructor vacio para iniciar el contador y el id
        this();
        // Creo la computadora utilizando los Objetos de clase como argumentos
        this.nombre = nombre;
        this.teclado = teclado;
        this.raton = raton;
        this.monitor = monitor;
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora: " + "idComputadora = " + idComputadora + " <<>> Nombre: " + nombre + "\n Teclado = " + teclado + "\n Monitor = " + monitor + "\n Raton = " + raton + "\n";
    }
    
    
}
