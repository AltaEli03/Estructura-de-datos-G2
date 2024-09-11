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
                "3) Factorial Iterativo\n" +
                "4) Factorial Recursivo\n" +
                "5) Salir\n" +
                "Elige la opcion";
        return JOptionPane.showInputDialog(menu);
    }

    public static void ejecutar() {
        boolean sentinel = true;
        String opcion = "";
        Operaciones op = new Operaciones();
        Factorial f = null;
        long r = 0;
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
                case "3": // Factorial Iterativo
                    opcion = JOptionPane.showInputDialog(Menus.menuFact());
                    f = new Factorial();
                    n = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el valor del factorial a calcular"));
                    f.setN(n);
                    r = f.factorialI(opcion);
                    JOptionPane.showMessageDialog(null, "f ( " + f.getN() + " ) " + "= " + r);
                    break;
                case "4":// Factorial Recursivo
                    f = new Factorial();
                    n = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el valor del factorial a calcular"));
                    f.setN(n);
                    r = f.factorialR(f.getN());
                    JOptionPane.showMessageDialog(null, "f ( " + f.getN() + " ) " + "= " + r);
                    break;
                case "5":// Salir
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
