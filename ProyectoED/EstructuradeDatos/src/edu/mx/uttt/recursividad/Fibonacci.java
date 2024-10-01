package edu.mx.uttt.recursividad;

public class Fibonacci {
    private int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if (n >= 0) {
            this.n = n;
        }
    }

    public double calFib(int n) {
        // Con ternario
        // return (this.n <= 1)?n:calFib(n-1) + calFib(n-2);

        // caso base
        if (this.n <= 1) {
            return n;
        } else {
        // Caso general
            return calFib(n - 1) + calFib(n - 2);
        }
    }

}
