package edu.mx.uttt.vectores;

public class ProductoEscalar {
    private int[] vector1;
    private int[] vector2;

    public ProductoEscalar(int[] vector1, int[] vector2) {
        this.vector1 = vector1;
        this.vector2 = vector2;
    }

    public int calcularProductoEscalar() {
        int resultado = 0;
        for (int i = 0; i < vector1.length; i++) {
            resultado += vector1[i] * vector2[i];
        }
        return resultado;
    }
}
