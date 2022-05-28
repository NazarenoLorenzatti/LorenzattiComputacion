
package com.lorenzatticomputacion;

// hereda de dispositivosEntrada
public class Raton extends DispositivosEntrada {
    
    private final int idRaton;
    private static int contadorRaton;
    
    public Raton (String tipoDeEntrada, String marca){
        super(tipoDeEntrada,marca);  // Argumentos enviados al constructor de la clase padre
        this.idRaton = ++contadorRaton;
    }

    @Override
    public String toString() {
        return " Raton >> " + " idRaton = " + idRaton + " >> " + super.toString(); // concatena el metodo to string de la clase padre
    }
    
}
