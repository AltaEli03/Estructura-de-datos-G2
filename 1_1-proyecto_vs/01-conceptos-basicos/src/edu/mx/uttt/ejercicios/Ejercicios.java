package edu.mx.uttt.ejercicios;

public class Ejercicios {
    private int calificaciones;

    public Ejercicios(int calificaciones) {
        this.calificaciones = (calificaciones <= 0) ? 1 : calificaciones;
    }

    public int getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int calificaciones) {
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        int suma = 0;
        for (int i = 1; i <= calificaciones; i++) {
            suma += calificaciones;
        }
        return (double) suma / calificaciones;
    }

}
