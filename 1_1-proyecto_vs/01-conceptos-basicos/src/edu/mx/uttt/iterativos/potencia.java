package edu.mx.uttt.iterativos;

public class potencia {
    private double base;
    private double potencia;

    public potencia() {
        this.base = (base > 0) ? base : 1;
        this.potencia = (potencia > 0) ? potencia : 1;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = (base > 0) ? base : 1;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = (potencia > 0) ? potencia : 1;
    }

    public double CalcularPotenciaFor() {
        double resultado = 1.0;
        for (int i = 1; i <= this.potencia; i++) {
            resultado *= this.base;
        }
        return resultado;
    }

    public double CalcularPotenciaWhile() {
        double resultado = 1.0;
        int i = 1;
        while (i <= this.potencia) {
            resultado *= this.base;
            i++;
        }
        return resultado;
    }

    public double CalcularPotenciaDoWhile() {
        double resultado = 1.0;
        int i = 1;
        do {
            resultado *= this.base;
            i++;
        } while (i <= this.potencia);
        return resultado;
    }
}
