package edu.mx.uttt.iterativos;

public class serieFactorial {
    private int n;

    public serieFactorial() {
        this.n = (n > 0) ? n : 1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n > 0) ? n : 1;
    }

    // Metodo utilitario

    private long calcularFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i; // fact * i
        }
        return fact;
    }

    public double calcularSerieFact() {
        double r = 0.0;
        int i = 1;
        do {
            r += i / this.calcularFactorial(i);
            i++;
        } while (i <= this.n);
        return r;
    }
}
