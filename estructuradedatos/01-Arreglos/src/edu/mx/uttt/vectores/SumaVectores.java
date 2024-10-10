package edu.mx.uttt.vectores;

public class SumaVectores {
    private int[] vector1;
    private int[] vector2;

    public SumaVectores(int[] vector1, int[] vector2) {
        this.vector1 = vector1;
        this.vector2 = vector2;
    }

    public int[] calcularSuma() {
        int[] resultado = new int[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            resultado[i] = vector1[i] + vector2[i];
        }
        return resultado;
    }
}
