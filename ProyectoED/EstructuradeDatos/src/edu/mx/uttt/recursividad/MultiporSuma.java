package edu.mx.uttt.recursividad;//terminado

public class MultiporSuma {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (a > 0) {
            this.a = a;
        }
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if (b > 0) {
            this.b = b;
        }
    }

    // Método recursivo para realizar la multiplicación mediante sumas repetidas
    public int multiplicar(int a, int b) {
        // Caso base: si b es 0, el resultado es 0
        if (b == 0) {
            return 0;
        }
        // Caso recursivo: sumar 'a' y llamar al método con 'b-1'
        return a + multiplicar(a, b - 1);
    }

    // Método para imprimir el resultado en el formato deseado
    public void imprimirResultado(int a, int b) {
        int resultado = multiplicar(a, b);
        System.out.print(a + " * " + b + " = ");
        for (int i = 1; i <= b; i++) {
            System.out.print(a);
            if (i < b) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + resultado);
    }
}
