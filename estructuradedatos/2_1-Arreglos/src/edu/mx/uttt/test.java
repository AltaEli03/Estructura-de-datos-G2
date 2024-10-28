package edu.mx.uttt;

import edu.mx.uttt.metodosordenamiento.Sort;

public class test {
    public static void main(String[] args) {
        int[] x = { 2, 7, 5, 8 };
        Sort s1 = new Sort(x.length);

        s1.setArr(x);
        s1.imprimir();

        System.out.println("\n========Metodo burbuja========");
        s1.bubbleAsc();
        s1.imprimir();
        System.out.println();
        s1.bubbleDesc();
        s1.imprimir();

        System.out.println("\n========Metodo seleccion========");
        s1.selectionSortAsc();
        s1.imprimir2();
        System.out.println();
        s1.selectionSortDesc();
        s1.imprimir2();
    }
}
