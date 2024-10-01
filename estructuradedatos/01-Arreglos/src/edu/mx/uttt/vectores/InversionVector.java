package edu.mx.uttt.vectores;

public class InversionVector {
    private int[] vector;


    public InversionVector(int[] vector) {
        this.vector = vector;
    }

    public int[] invertir() {
        int[] resultado = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            resultado[i] = vector[vector.length - 1 - i];
        }
        return resultado;
    }

}
