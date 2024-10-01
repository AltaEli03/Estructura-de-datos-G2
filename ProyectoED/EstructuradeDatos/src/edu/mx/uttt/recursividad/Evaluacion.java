package edu.mx.uttt.recursividad;

public class Evaluacion {

    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n > 0) ? n : 1;
    }

    public double resolvTN(int n) {
        if (n == 1) {
            return (Math.pow(n, 2)) / (n + 1);
        } else {
            return (Math.pow(n, 2)) / (n + 1) * resolvTN(n - 1);
        }
    }
}
