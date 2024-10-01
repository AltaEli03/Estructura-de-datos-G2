package edu.mx.uttt.vectores;

public class TestEjercicios {
    public static void main(String[] args) {
        //Suma Vectores
        int[] vector1 = {1, 2, 3};
        int[] vector2 = {4, 5, 6};
        SumaVectores suma = new SumaVectores(vector1, vector2);
        int[] resultadoSuma = suma.calcularSuma();
        System.out.println("Suma: " + java.util.Arrays.toString(resultadoSuma));

        //Producto Escalar
        ProductoEscalar producto = new ProductoEscalar(vector1, vector2);
        int resultadoProducto = producto.calcularProductoEscalar();
        System.out.println("Producto Escalar: " + resultadoProducto);

        //Inversion Vector
        InversionVector inversion = new InversionVector(vector1);
        int[] resultadoInversion = inversion.invertir();
        System.out.println("Inversión: " + java.util.Arrays.toString(resultadoInversion));

        //Multiplicacion Escalar
        int escalar = 2;
        MultiplicacionEscalar multiplicacion = new MultiplicacionEscalar(vector1, escalar);
        int[] resultadoMultiplicacion = multiplicacion.multiplicar();
        System.out.println("Multiplicación por Escalar: " + java.util.Arrays.toString(resultadoMultiplicacion));
    }
}
