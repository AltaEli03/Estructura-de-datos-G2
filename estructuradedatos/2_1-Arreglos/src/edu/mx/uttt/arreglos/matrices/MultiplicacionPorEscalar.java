package edu.mx.uttt.arreglos.matrices;

import javax.swing.JOptionPane;

public class MultiplicacionPorEscalar {
    public static void main(String[] args) {
        // Solicitar el tamaño de la matriz
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño de la matriz"));

        // Construir la matriz x
        int x[][] = new int[tamaño][tamaño];

        // Llenar la matriz y
        x = llenarMatriz(x);

        // Solicitar el escalar k
        int k = Integer.parseInt(JOptionPane.showInputDialog("Introduce el escalar"));

        // Multiplicar k por cada uno de los elementos de la matriz
        int[][] resultado = multiplicar(x, k);

        // Imprimir la matriz resultante
        imprimir(resultado);
    }

    // Método para llenar la matriz con valores ingresados por el usuario
    public static int[][] llenarMatriz(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = Integer
                        .parseInt(JOptionPane.showInputDialog("Introduce el valor para x[" + i + "][" + j + "]"));
            }
        }
        return x;
    }

    // Método para multiplicar cada elemento de la matriz por el escalar
    public static int[][] multiplicar(int[][] x, int k) {
        int[][] resultado = new int[x.length][x[0].length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                resultado[i][j] = x[i][j] * k;
            }
        }
        return resultado;
    }

    // Método para imprimir una matriz
    public static void imprimir(int[][] x) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                sb.append(x[i][j] + " ");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Matriz Resultante", JOptionPane.INFORMATION_MESSAGE);
    }
}
