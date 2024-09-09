package edu.mx.uttt.iterativos;

// PROGRAMA PARA CALCULAR EL FACTORIAL DE UN NUMERO ENTERO
// Realizar la validacion para que la variable de instancia nunca sea 0
// Realizar un metodo que calcule el factorial, utilizando un ciclo for
// Realizar un metodo que calcule el factorial, de forma inversa, utilizando un while

// Ejemplo factorial:
// f(1) = 1
// f(2) = 1 * 2
// f(3) = 1 * 2 * 3
// f(n) = 1 * 2 * ... n

// f(1) = 1
// f(2) = 2 * 1
// f(3) = 3 * 2 * 1
// f(n) = n * ... 1

public class Factorial {
    // variables de instancia
    private int n;

    public Factorial() {
        this.n = (n <= 0) ? 1 : n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if (n > 0) {
            this.n = n;
        } else {
            System.out.println("El valor no puede ser negativo ni cero");
        }
    }

    public long calcularFactorial() {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i; // fact * i
        }
        return fact;
    }

    public long calcularFactorialRev() {
        long fact = 1;
        int i = n;
        while (i >= 1) {
            fact *= i;
            i--;
        }
        return fact;
    }

    

    @Override
    public String toString() {
        return "El factorial del numero " + this.n + " es: " + this.calcularFactorial();
    }
}
