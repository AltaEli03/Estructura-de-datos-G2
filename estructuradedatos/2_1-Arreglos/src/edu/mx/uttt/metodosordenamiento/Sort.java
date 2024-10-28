package edu.mx.uttt.metodosordenamiento;

public class Sort {
    private int[] arr;
    private int tamaño;

    public Sort(int tamaño) {
        if (tamaño >= 2) {
            this.tamaño = tamaño;
            arr = new int[this.tamaño];
        } else {
            this.tamaño = 2;
            arr = new int[this.tamaño];
        }
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        if (arr.length == this.arr.length) {
            for (int i = 0; i < getTamaño(); i++) {
                this.arr[i] = arr[i];
            }
        }
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        if (tamaño >= 2) {
            this.tamaño = tamaño;
        }
    }

    public void bubbleAsc() {
        boolean swapped;
        for (int i = 0; i < tamaño - 1; i++) {
            swapped = false;
            for (int j = 0; j < tamaño - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Si no hubo intercambios, la lista ya está ordenada
            if (!swapped)
                break;
        }
    }

    public void bubbleDesc() {
        boolean swapped;
        for (int i = 0; i < tamaño - 1; i++) {
            swapped = false;
            for (int j = 0; j < tamaño - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Intercambiar elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Si no hubo intercambios, la lista ya está ordenada
            if (!swapped)
                break;
        }
    }

    public void selectionSortAsc() {
        for (int i = 0; i < tamaño - 1; i++) {
            // Encuentra el índice del elemento mínimo
            int minIndex = i;
            for (int j = i + 1; j < tamaño; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambia el elemento mínimo con el elemento en la posición i
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public void selectionSortDesc() {
        for (int i = 0; i < tamaño - 1; i++) {
            // Encuentra el índice del elemento máximo
            int maxIndex = i;
            for (int j = i + 1; j < tamaño; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Intercambia el elemento máximo con el elemento en la posición i
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public void imprimir() {
        int i = 0;
        while (i < arr.length) {
            System.out.print("|" + arr[i]);
            i++;
        }
    }

    // foreach
    public void imprimir2() {
        for (int item : arr) {
            System.out.print("|" + item);
        }
    }

}
