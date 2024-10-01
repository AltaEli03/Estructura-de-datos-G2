package edu.mx.uttt.recursividad;

public class Potencia {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if (n > 0) {
            this.n = n;
        }
    }

    public int calPotN(int n) {
        if (n == 0) {
            return n;
        } else {
            return  2 * calPotN(n - 1);
        }
    }

}
