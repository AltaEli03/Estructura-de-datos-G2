package edu.mx.uttt.iterativos;

public class serie2 {
    private int n;
    private Factorial factorial;

    public serie2() {
        this.n = 1;
        factorial = new Factorial();
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n > 0) ? n : 1;
    }

    public double calcular() {
        double r = 0.0;
        for (int i = 1; i <= this.n; i++) {
            factorial.setN(i);
            r += i / factorial.calcularFactorial();
        }
        return r;
    }

}
