package edu.mx.uttt.arreglos.matrices;

import javax.swing.JOptionPane;

public class AnalisisDeMatriz {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de filas de la matriz"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de columnas de la matriz"));

        // Validar que n y m sean mayores que 0
        if (n <= 0 || m <= 0) {
            JOptionPane.showMessageDialog(null, "El tamaño de la matriz debe ser mayor que 0", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        int x[][] = new int[n][m];
        x = llenarMatriz(x, n, m);

        imprimirResultados(x);
    }

    public static int[][] llenarMatriz(int[][] x, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                x[i][j] = Integer
                        .parseInt(JOptionPane.showInputDialog("Introduce el valor para x[" + i + "][" + j + "]"));
            }
        }
        return x;
    }

    public static boolean verificarCuadrada(int[][] x) {
        return x.length == x[0].length;
    }

    public static double calcularPromedio(int[][] x) {
        int suma = 0;
        int cuenta = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                suma += x[i][j];
                cuenta++;
            }
        }
        return (double) suma / cuenta;
    }

    public static double[] promedioPorFila(int[][] x) {
        double[] promedios = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            int suma = 0;
            for (int j = 0; j < x[i].length; j++) {
                suma += x[i][j];
            }
            promedios[i] = (double) suma / x[i].length;
        }
        return promedios;
    }

    public static double[] promedioPorColumna(int[][] x) {
        double[] promedios = new double[x[0].length];
        for (int j = 0; j < x[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < x.length; i++) {
                suma += x[i][j];
            }
            promedios[j] = (double) suma / x.length;
        }
        return promedios;
    }

    public static void imprimirResultados(int[][] x) {
        boolean esCuadrada = verificarCuadrada(x);
        double promedio = calcularPromedio(x);
        double[] promedioFila = promedioPorFila(x);
        double[] promedioColumna = promedioPorColumna(x);

        StringBuilder resultados = new StringBuilder();
        resultados.append("La matriz es cuadrada: ").append(esCuadrada).append("\n");
        resultados.append("Promedio de los números de la matriz: ").append(promedio).append("\n");
        resultados.append("Promedio por fila: ").append(java.util.Arrays.toString(promedioFila)).append("\n");
        resultados.append("Promedio por columna: ").append(java.util.Arrays.toString(promedioColumna)).append("\n");

        JOptionPane.showMessageDialog(null, resultados.toString(), "Resultados de la Matriz",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
