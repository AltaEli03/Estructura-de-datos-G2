package edu.mx.uttt.vectores;

import javax.swing.JOptionPane;

public class testVectores {
    public static void main(String[] args) {
        // // Declaracion de vectores

        // // forma 1
        // int[] x = new int[3];
        // System.out.println(x[1]); // imprime 0

        // // forma 2
        // int tam = 4;
        // double y[] = new double[tam];
        // System.out.println(y[3]); // imprime 0.0

        // // forma 3
        // boolean z1[];
        // z1 = new boolean[4];
        // System.out.println(z1[3]); // imprime false

        // // forma 4

        // char x1[], x2[], x3[]; // declaracion multiple de variables
        // x1 = new char[tam]; // tamaño 4
        // System.out.println(x1[2]);

        // tam = 8;
        // x2 = new char[tam]; // tamaño 4

        // System.out.println(x2[3]); // Imprime nada ""

        // x3 = x2; // tamaño 4
        // System.out.println(x3[1]);

        // // forma 5
        // String zz[] = { "Luis", "William", "Ezequiel", "Arcadia" };

        // // manejo de errores
        // try {
        // System.out.println(zz[4]);
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Error" + e.getMessage());
        // }

        // zz[1] = "Mark";
        // System.out.println(zz[1]); // ahora imprime "Mark"

        int tam = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del arreglo"));
        double estaturas[] = new double[tam];
        llenarArreglo(estaturas);

        imprimir(estaturas);

        sumarValores(estaturas);

        calcularMedia(estaturas);

        obtenerValorMaximo(estaturas);
    }

    public static void imprimir(double arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " -> ");
        }
    }

    public static void llenarArreglo(double arr[]) {
        int i = 0;
        while (i < arr.length) {
            arr[i] = Double
                    .parseDouble(JOptionPane.showInputDialog("Introduce el valor del arreglo [" + (i + 1) + "]"));
            i++;
        }
    }

    public static double sumarValores(double arr[]) { // for
        double resultado = 0.0;
        for (int i = 0; i < arr.length; i++) {
            resultado += arr[i];
        }
        System.out.print("\nLa suma del arreglo es: " + resultado);
        return resultado;
    }

    public static double calcularMedia(double arr[]) {
        double suma = 0.0;
        int i = 0;
        while (i < arr.length) {
            suma += arr[i];
            i++;
        }
        double media = suma / arr.length;
        System.out.print("\nLa media del arreglo es: " + media);
        return media;
    }

    public static double obtenerValorMaximo(double arr[]) {
        double maximo = arr[0];
        int i = 1;
        do {
            if (arr[i] > maximo) {
                maximo = arr[i];
            }
            i++;
        } while (i < arr.length);
        System.out.print("\nEl valor máximo del arreglo es: " + maximo);
        return maximo;
    }

}
