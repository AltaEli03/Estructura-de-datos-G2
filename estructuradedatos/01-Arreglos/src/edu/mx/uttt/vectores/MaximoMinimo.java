package edu.mx.uttt.vectores;

public class MaximoMinimo {

    // Método que encuentra el número máximo en un arreglo
    public static int encontrarMaximo(int[] numeros) {
        int maximo = numeros[0];
        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        return maximo;
    }

    // Método que encuentra el número mínimo en un arreglo
    public static int encontrarMinimo(int[] numeros) {
        int minimo = numeros[0];
        for (int numero : numeros) {
            if (numero < minimo) {
                minimo = numero;
            }
        }
        return minimo;
    }

}