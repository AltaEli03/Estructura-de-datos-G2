package edu.mx.uttt.iterativos;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        double resultado = gestionarOperaciones(menuPrincipal());
        if (resultado == 0.0) {
            JOptionPane.showMessageDialog(null, "Opcion no valida");
        } else {
            JOptionPane.showMessageDialog(null, resultado);
        }

    }

    public static String menuPrincipal() {
        String menu = "MENU PRINCIPAL \n" +
                "1) Serie 1\n" + "2) Serie 2\n" + "3) Factorial\n" + "4) Potencia\n" + "5) Serie 3\n"
                + "Elige una opcion";
        return JOptionPane.showInputDialog(menu);
    }

    public static double gestionarOperaciones(String opcion) {
        double resultado = 0.0;
        switch (opcion) {
            case "1":
                Serie serie = new Serie();
                int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de 'n'"));
                serie.setN(valor);
                resultado = serie.calcularSerie();
                break;
            case "2":
                serie2 serie2 = new serie2();
                int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de 'n'"));
                serie2.setN(valor2);
                resultado = serie2.calcular();
                break;
            case "3":
                Factorial factorial = new Factorial();
                int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de 'n'"));
                factorial.setN(valor3);
                resultado = factorial.calcularFactorial();
                break;
            case "4":

                break;
            case "5":
                break;
            default:
                System.out.println("No existe el valor");
                break;
        }
        return resultado;
    }
}
