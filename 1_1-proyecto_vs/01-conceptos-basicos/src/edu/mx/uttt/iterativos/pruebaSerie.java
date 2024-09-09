package edu.mx.uttt.iterativos;

import javax.swing.JOptionPane;

public class pruebaSerie {
    public static void main(String[] args) {
        // creacion del primer objeto
        Serie serie1 = new Serie();

        JOptionPane.showMessageDialog(null, serie1.getN());

        Serie serie2 = new Serie(5);

        JOptionPane.showMessageDialog(null, serie2.getN());

        serie1.setN(5);
        JOptionPane.showMessageDialog(null, serie1.calcularSerie());
        JOptionPane.showMessageDialog(null, serie1);



    }

}
