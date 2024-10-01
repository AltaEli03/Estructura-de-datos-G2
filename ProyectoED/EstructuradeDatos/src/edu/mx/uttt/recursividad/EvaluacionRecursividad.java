package edu.mx.uttt.recursividad;

import javax.swing.JOptionPane;

public class EvaluacionRecursividad {
    public static void main(String[] args) {
        ejecutarEvaluacion();
    }

    public static String menuEvaluacion() {
        String menu = "Menu Principal\n" +
                "1) Metodo Recursivo\n" +
                "2) Salir\n" +
                "Elige la opcion";
        return JOptionPane.showInputDialog(menu);
    }

    public static void ejecutarEvaluacion() {
        boolean sentinel = true;
        String opcion = "";
        int n = 0;
        do {
            opcion = menuEvaluacion();
            switch (opcion) {
                case "1": // Metodo Recursivo
                Evaluacion e1 = new Evaluacion();
                n = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el valor de N"));
                JOptionPane.showMessageDialog(null, e1.resolvTN(n));
                    break;
                case "2": // Salir
                    sentinel = false;
                    JOptionPane.showMessageDialog(null, "Hasta la proxima");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                    break;
            }
        } while (sentinel);
    }
}
