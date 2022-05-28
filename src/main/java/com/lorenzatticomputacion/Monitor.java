package com.lorenzatticomputacion;

public class Monitor {

    private final int idMonitor;
    private static int contadorMonitor;
    private String marca;
    private double tamaño;

    private Monitor() {
        this.idMonitor = ++contadorMonitor;
    }

    public Monitor(String marca, double tamaño) {
        this(); // llamo al constructor vacio para iniciar el contador y el id
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return " Monitor >> " + " idMonitor = " + idMonitor + " >> Marca = " + marca + ", Tamanio = " + tamaño + " >> ";
    }

}
