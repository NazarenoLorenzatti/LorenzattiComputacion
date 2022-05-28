
package com.lorenzatticomputacion;

// Clase padre de las clases Raton y Teclado
public class DispositivosEntrada {
    
    private String tipoDeEntrada;
    private String marca;
    
    public DispositivosEntrada(String tipoDeEntrada, String marca){
        this.marca = marca;
        this.tipoDeEntrada = tipoDeEntrada;               
    }

    public String getTipoDeEntrada() {
        return tipoDeEntrada;
    }

    public void setTipoDeEntrada(String tipoDeEntrada) {
        this.tipoDeEntrada = tipoDeEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Dispositivos Entrada: " + " Tipo De Entrada: >> " + tipoDeEntrada + ", Marca: " + marca + ">>";
    }
    
    
}
