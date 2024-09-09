package edu.mx.uttt.recursividad;

public class Operaciones {
    private int n;

    public Operaciones() {
        this.n = 1;
    }

    public int getN(int n) {
        return n;
    }

    public void setN(int n) {
        this.n = (n > 0) ? n : 1;
    }

    // metodo iterativo

    public void imprimir() {
        int i = 1;
        while (i <= this.n) {
            System.out.println("Hola mundo");
            i++;
        }
    }

    // metodo recursivo
    public void imprimir(int n) {
        // Caso Base
        if (n == 1) {
            System.out.println("Hola mundo");
            ;
        } else {
            // Caso general
            System.out.println("Hola mundo");
            imprimir(n - 1);
        }
    }
}
