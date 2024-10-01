package edu.mx.uttt.recursividad;

public class Fraccion1 {
    private double n;

    public Fraccion1() {
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        if (n > 0) {
            this.n = n;
        }
    }

    public double calFracc1(double n) {
        if (n <= 1) {
            return n;
        } else {
            return calFracc1(1 / (n - 1));
        }
    }

}
