package edu.mx.uttt.vectores;

public class MultiplicacionEscalar {
    private int[] vector;
    private int escalar;

    public MultiplicacionEscalar(int[] vector, int escalar) {
        this.vector = vector;
        this.escalar = escalar;
    }

    public int[] multiplicar() {
        int[] resultado = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            resultado[i] = vector[i] * escalar;
        }
        return resultado;
    }
}
