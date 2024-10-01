package edu.mx.uttt.recursividad;//Terminado

public class tablaMulti {
    private int tabla;
    private int numVeces;

    public int getTabla() {
        return tabla;
    }

    public void setTabla(int tabla) {
        if (tabla > 0) {
            this.tabla = tabla;
        }
    }

    public int getNumVeces() {
        return numVeces;
    }

    public void setNumVeces(int numVeces) {
        if (numVeces > 0) {
            this.numVeces = numVeces;    
        }  
    }

    public void imprimirTabla(int tabla, int numVeces) {
        if (tabla <= 0 || numVeces <= 0) {
            return;
        } else {
            imprimirTabla(tabla, numVeces - 1);
            System.out.println(tabla + " x " + numVeces + " = " + (tabla * numVeces));
            return;
        }
    }
}
