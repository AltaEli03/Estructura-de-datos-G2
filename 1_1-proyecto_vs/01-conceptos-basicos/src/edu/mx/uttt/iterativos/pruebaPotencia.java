package edu.mx.uttt.iterativos;

import javax.swing.JOptionPane;

public class pruebaPotencia {
    public static void main(String[] args) {
        potencia pot1 = new potencia();
        pot1.setBase(4.0);
        pot1.setPotencia(2.0);
        JOptionPane.showMessageDialog(null, pot1.CalcularPotenciaFor());

        potencia pot2 = new potencia();
        pot2.setBase(3.0);
        pot2.setPotencia(3.0);
        JOptionPane.showMessageDialog(null, pot2.CalcularPotenciaWhile());

        potencia pot3 = new potencia();
        pot3.setBase(5.0);
        pot3.setPotencia(3.0);
        JOptionPane.showMessageDialog(null, pot3.CalcularPotenciaDoWhile());

    }

}
