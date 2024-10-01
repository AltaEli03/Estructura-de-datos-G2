package edu.mx.uttt.recursividad;

public class Ejercicios {
    private double n;

    public Ejercicios() {
        this.n = 1.0;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = (n > 0.0) ? n : 1.0;
    }

    public double divisionPositivoFOR() {
        double num = 0.0;
        for (int i = 0; this.n >= i; i++) {
            num /= 3.0;
        }
        return num;
    }

    public double divisionPositivoWHILE() {
        int i = 0;
        double num = 0.0;
        while (this.n >= i) {
            num /= 3.0;
            i++;
        }
        return num;
    }

    public double divisionPositivoDOWHILE() {
        int i = 1;
        double num = 0.0;
        do {
            num /= 3.0;
            i++;
        } while (this.n >= i);
        return num;
    }

    // Metodo recursivo

    public double divisionR(double n) {
        if (n < 1) {
            return n;
        } else {
            return divisionR(n / 3.0);
        }
    }
}
