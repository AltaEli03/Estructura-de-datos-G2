import javax.swing.JOptionPane;

public class TestCalificacionesHoteles {
    public static void main(String[] args) {
        int hoteles = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de hoteles:"));
        int anos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de años:"));
        int[][] calificaciones = solicitarValores(hoteles, anos);
        
        CalificacionesHoteles calificacionesHoteles = new CalificacionesHoteles(calificaciones);
        calificacionesHoteles.imprimir();
    }

    public static int[][] solicitarValores(int hoteles, int anos) {
        int[][] calificaciones = new int[hoteles][anos];
        for (int i = 0; i < hoteles; i++) {
            for (int j = 0; j < anos; j++) {
                calificaciones[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce la calificación para el hotel " + (i + 1) + " en el año " + (j + 1) + ":"));
            }
        }
        return calificaciones;
    }
}
