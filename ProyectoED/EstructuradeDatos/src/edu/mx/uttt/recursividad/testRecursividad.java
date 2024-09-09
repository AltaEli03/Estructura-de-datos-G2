package edu.mx.uttt.recursividad;

import javax.swing.JOptionPane;

public class testRecursividad {
    public static void main(String[] args) {
        ejecutar();
    }

    public static String menu() {
        String menu = "Menu Principal\n" +
                "1) Metodo Iterativo\n" +
                "2) Metodo Recursivo\n" +
                "3) Salir\n" +
                "Elige la opcion";
        return JOptionPane.showInputDialog(menu);
    }

    public static void ejecutar() {
        boolean sentinel = true;
        String opcion = "";
        Operaciones op = new Operaciones();
        int n = 0;

        do {// Empieza el do-while
            opcion = menu();
            switch (opcion) {
                case "1":
                    n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces a imprimir"));
                    op.setN(n);
                    op.imprimir();
                    break;
                case "2":
                    n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces a imprimir"));
                    op.imprimir(op.getN(n));
                    break;
                case "3":// Salir
                    sentinel = false;
                    JOptionPane.showMessageDialog(null, "Hasta la proxima");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                    break;
            }// Cierra el switch
        } while (sentinel);// Cierra el do-while

    }// Cierra el metodo
}
