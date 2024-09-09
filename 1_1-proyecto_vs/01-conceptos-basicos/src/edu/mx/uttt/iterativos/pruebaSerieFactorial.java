package edu.mx.uttt.iterativos;

import javax.swing.JOptionPane;

public class pruebaSerieFactorial {
    public static void main(String[] args) {

        Factorial fact1 = new Factorial();
        fact1.setN(3);
        JOptionPane.showMessageDialog(null, fact1.calcularFactorial());
        JOptionPane.showMessageDialog(null, fact1.calcularFactorialRev());

        serieFactorial sf1 = new serieFactorial();
        sf1.setN(3);
        JOptionPane.showMessageDialog(null, sf1.calcularSerieFact());

        serie2 sr2 = new serie2();
        sr2.setN(3);
        JOptionPane.showMessageDialog(null, sr2.calcular());

    }
}
