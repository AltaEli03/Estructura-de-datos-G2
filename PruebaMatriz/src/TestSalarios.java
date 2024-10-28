import javax.swing.JOptionPane;

public class TestSalarios {
    public static void main(String[] args) {
        int personas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de personas:"));
        int anos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de años:"));
        double[][] salarios = solicitarValores(personas, anos);
        
        SalariosVerano salariosVerano = new SalariosVerano(salarios);
        salariosVerano.imprimirEstadisticas();
    }

    public static double[][] solicitarValores(int personas, int anos) {
        double[][] salarios = new double[personas][anos];
        for (int i = 0; i < personas; i++) {
            for (int j = 0; j < anos; j++) {
                salarios[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Introduce el salario para la persona " + (i + 1) + " en el año " + (j + 1) + ":"));
            }
        }
        return salarios;
    }
}
