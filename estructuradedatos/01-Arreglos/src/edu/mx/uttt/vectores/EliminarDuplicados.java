package edu.mx.uttt.vectores;

import java.util.Arrays;

public class EliminarDuplicados {
    private int[] numeros; // Arreglo original de números

    // Constructor que inicializa el arreglo de enteros
    public EliminarDuplicados(int[] numeros) {
        this.numeros = numeros;
    }

    // Método que elimina duplicados
    public int eliminarDuplicados() {
        int nuevoVector = 0; // Este contador almacenará la cantidad de elementos únicos

        // Recorrer el arreglo original
        for (int i = 0; i < numeros.length; i++) {
            boolean duplicado = false;

            // Verificar si el número ya existe entre los elementos únicos
            for (int j = 0; j < nuevoVector; j++) {
                if (numeros[i] == numeros[j]) {
                    duplicado = true; // Aquí si encontramos un duplicado
                    break;
                }
            }

            // Si no es duplicado, lo movemos al nuevo vector (zona de elementos únicos)
            if (!duplicado) {
                numeros[nuevoVector] = numeros[i];
                nuevoVector++;
            }
        }

        return nuevoVector; // Nuevo arreglo sin duplicados
    }

    // Método para mostrar el arreglo original
    public void mostrarOriginal() {
        System.out.println("Arreglo original: " + Arrays.toString(numeros));
    }

    // Método para mostrar el arreglo sin duplicados hasta el nuevo tamaño
    public void mostrarSinDuplicados(int nuevoTamano) {
        System.out.print("Arreglo sin duplicados: [");
        for (int i = 0; i < nuevoTamano; i++) {
            System.out.print(numeros[i]);
            if (i < nuevoTamano - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
